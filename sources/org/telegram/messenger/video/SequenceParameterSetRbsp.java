package org.telegram.messenger.video;

import java.io.InputStream;
import java.lang.reflect.Array;
import n2.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class SequenceParameterSetRbsp {
    public int bit_depth_chroma_minus8;
    public int bit_depth_luma_minus8;
    public int chroma_format_idc;
    public long general_constraint_indicator_flags;
    public byte general_level_idc;
    public long general_profile_compatibility_flags;
    public int general_profile_idc;
    public int general_profile_space;
    public boolean general_tier_flag;
    public int pic_height_in_luma_samples;
    public int pic_width_in_luma_samples;
    public int sps_max_sub_layers_minus1;
    public boolean sps_temporal_id_nesting_flag;

    public SequenceParameterSetRbsp(InputStream inputStream) {
        xb.a aVar = new xb.a();
        w wVar = new w((char) 0, 11);
        wVar.c = new char[50];
        aVar.e = wVar;
        aVar.a = inputStream;
        aVar.b = inputStream.read();
        aVar.c = inputStream.read();
        aVar.d(4, "sps_video_parameter_set_id");
        this.sps_max_sub_layers_minus1 = (int) aVar.d(3, "sps_max_sub_layers_minus1");
        aVar.b("sps_temporal_id_nesting_flag");
        profile_tier_level(this.sps_max_sub_layers_minus1, aVar);
        aVar.e("sps_seq_parameter_set_id");
        int e10 = aVar.e("chroma_format_idc");
        this.chroma_format_idc = e10;
        if (e10 == 3) {
            aVar.a();
        }
        this.pic_width_in_luma_samples = aVar.e("pic_width_in_luma_samples");
        this.pic_height_in_luma_samples = aVar.e("pic_width_in_luma_samples");
        if (aVar.b("conformance_window_flag")) {
            aVar.e("conf_win_left_offset");
            aVar.e("conf_win_right_offset");
            aVar.e("conf_win_top_offset");
            aVar.e("conf_win_bottom_offset");
        }
        this.bit_depth_luma_minus8 = aVar.e("bit_depth_luma_minus8");
        this.bit_depth_chroma_minus8 = aVar.e("bit_depth_chroma_minus8");
        int e11 = aVar.e("log2_max_pic_order_cnt_lsb_minus4");
        boolean b10 = aVar.b("sps_sub_layer_ordering_info_present_flag");
        int i9 = this.sps_max_sub_layers_minus1;
        int i10 = (i9 - (b10 ? 0 : i9)) + 1;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        for (i9 = b10 ? 0 : i9; i9 <= this.sps_max_sub_layers_minus1; i9++) {
            iArr[i9] = aVar.e("sps_max_dec_pic_buffering_minus1[" + i9 + "]");
            iArr2[i9] = aVar.e("sps_max_num_reorder_pics[" + i9 + "]");
            iArr3[i9] = aVar.e("sps_max_latency_increase_plus1[" + i9 + "]");
        }
        aVar.e("log2_min_luma_coding_block_size_minus3");
        aVar.e("log2_diff_max_min_luma_coding_block_size");
        aVar.e("log2_min_transform_block_size_minus2");
        aVar.e("log2_diff_max_min_transform_block_size");
        aVar.e("max_transform_hierarchy_depth_inter");
        aVar.e("max_transform_hierarchy_depth_intra");
        if (aVar.b("scaling_list_enabled_flag") && aVar.b("sps_scaling_list_data_present_flag")) {
            skip_scaling_list_data(aVar);
        }
        aVar.b("amp_enabled_flag");
        aVar.b("sample_adaptive_offset_enabled_flag");
        if (aVar.b("pcm_enabled_flag")) {
            aVar.d(4, "pcm_sample_bit_depth_luma_minus1");
            aVar.d(4, "pcm_sample_bit_depth_chroma_minus1");
            aVar.e("log2_min_pcm_luma_coding_block_size_minus3");
            aVar.e("log2_diff_max_min_pcm_luma_coding_block_size");
            aVar.b("pcm_loop_filter_disabled_flag");
        }
        parse_short_term_ref_pic_sets(aVar.e("num_short_term_ref_pic_sets"), aVar);
        if (aVar.b("long_term_ref_pics_present_flag")) {
            int e12 = aVar.e("num_long_term_ref_pics_sps");
            int[] iArr4 = new int[e12];
            boolean[] zArr = new boolean[e12];
            for (int i11 = 0; i11 < e12; i11++) {
                iArr4[i11] = (int) aVar.d(e11 + 4, "lt_ref_pic_poc_lsb_sps[" + i11 + "]");
                zArr[i11] = aVar.b("used_by_curr_pic_lt_sps_flag[" + i11 + "]");
            }
        }
        aVar.b("sps_temporal_mvp_enabled_flag");
        aVar.b("strong_intra_smoothing_enabled_flag");
    }

    private void parse_short_term_ref_pic_sets(int i9, xb.a aVar) {
        long[] jArr = new long[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 == 0 || aVar.a() != 1) {
                long e10 = aVar.e("num_positive_pics") + aVar.e("num_negative_pics");
                jArr[i10] = e10;
                for (long j10 = 0; j10 < e10; j10++) {
                    aVar.e("delta_poc_s0/1_minus1");
                    aVar.b("used_by_curr_pic_s0/1_flag");
                }
            } else {
                aVar.b("delta_rps_sign");
                aVar.e("abs_delta_rps_minus1");
                jArr[i10] = 0;
                for (int i11 = 0; i11 <= jArr[i10 - 1]; i11++) {
                    boolean z10 = aVar.a() == 1;
                    boolean z11 = !z10 && aVar.a() == 1;
                    if (z10 || z11) {
                        jArr[i10] = jArr[i10] + 1;
                    }
                }
            }
        }
    }

    private void profile_tier_level(int i9, xb.a aVar) {
        boolean[] zArr;
        int[] iArr;
        boolean[] zArr2;
        long[] jArr;
        int i10 = i9;
        long d = aVar.d(2, "general_profile_space");
        InputStream inputStream = aVar.a;
        this.general_profile_space = (int) d;
        this.general_tier_flag = aVar.b("general_tier_flag");
        this.general_profile_idc = (int) aVar.d(5, "general_profile_idc");
        this.general_profile_compatibility_flags = aVar.c(32);
        this.general_constraint_indicator_flags = aVar.c(48);
        if (aVar.d > 0) {
            aVar.b = aVar.c;
            aVar.c = inputStream.read();
            aVar.d = 0;
        }
        int i11 = aVar.b;
        aVar.b = aVar.c;
        aVar.c = inputStream.read();
        aVar.d = 0;
        this.general_level_idc = (byte) i11;
        boolean[] zArr3 = new boolean[i10];
        boolean[] zArr4 = new boolean[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            zArr3[i12] = aVar.b("sub_layer_profile_present_flag[" + i12 + "]");
            zArr4[i12] = aVar.b("sub_layer_level_present_flag[" + i12 + "]");
        }
        if (i10 > 0) {
            int[] iArr2 = new int[8];
            for (int i13 = i10; i13 < 8; i13++) {
                iArr2[i13] = (int) aVar.d(2, "reserved_zero_2bits[" + i13 + "]");
            }
        }
        int[] iArr3 = new int[i10];
        boolean[] zArr5 = new boolean[i10];
        int[] iArr4 = new int[i10];
        boolean[][] zArr6 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i10, 32);
        boolean[] zArr7 = new boolean[i10];
        boolean[] zArr8 = new boolean[i10];
        boolean[] zArr9 = new boolean[i10];
        boolean[] zArr10 = new boolean[i10];
        long[] jArr2 = new long[i10];
        int[] iArr5 = new int[i10];
        int i14 = 0;
        while (i14 < i10) {
            if (zArr3[i14]) {
                zArr = zArr3;
                iArr = iArr5;
                zArr2 = zArr10;
                iArr3[i14] = (int) aVar.d(2, "sub_layer_profile_space[" + i14 + "]");
                zArr5[i14] = aVar.b("sub_layer_tier_flag[" + i14 + "]");
                jArr = jArr2;
                iArr4[i14] = (int) aVar.d(5, "sub_layer_profile_idc[" + i14 + "]");
                for (int i15 = 0; i15 < 32; i15++) {
                    zArr6[i14][i15] = aVar.b("sub_layer_profile_compatibility_flag[" + i14 + "][" + i15 + "]");
                }
                zArr7[i14] = aVar.b("sub_layer_progressive_source_flag[" + i14 + "]");
                zArr8[i14] = aVar.b("sub_layer_interlaced_source_flag[" + i14 + "]");
                zArr9[i14] = aVar.b("sub_layer_non_packed_constraint_flag[" + i14 + "]");
                zArr2[i14] = aVar.b("sub_layer_frame_only_constraint_flag[" + i14 + "]");
                jArr[i14] = aVar.c(44);
            } else {
                zArr = zArr3;
                iArr = iArr5;
                zArr2 = zArr10;
                jArr = jArr2;
            }
            if (zArr4[i14]) {
                iArr[i14] = (int) aVar.d(8, "sub_layer_level_idc[" + i14 + "]");
            }
            i14++;
            i10 = i9;
            jArr2 = jArr;
            zArr10 = zArr2;
            zArr3 = zArr;
            iArr5 = iArr;
        }
    }

    private static void skip_scaling_list_data(xb.a aVar) {
        int i9 = 0;
        while (i9 < 4) {
            int i10 = 0;
            while (true) {
                if (i10 < (i9 == 3 ? 2 : 6)) {
                    if (aVar.a() == 1) {
                        aVar.e("scaling_list_pred_matrix_id_delta");
                    } else {
                        int min = Math.min(64, 1 << ((i9 << 1) + 4));
                        if (i9 > 1) {
                            aVar.e("scaling_list_dc_coef_minus8");
                        }
                        for (int i11 = 0; i11 < min; i11++) {
                            aVar.e("scaling_list_delta_coef");
                        }
                    }
                    i10++;
                }
            }
            i9++;
        }
    }
}
