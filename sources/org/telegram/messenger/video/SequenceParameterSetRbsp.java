package org.telegram.messenger.video;

import java.io.InputStream;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        o61 o61Var = new o61();
        vk1 vk1Var = new vk1((byte) 0);
        vk1Var.b = new char[50];
        o61Var.e = vk1Var;
        o61Var.a = inputStream;
        o61Var.b = inputStream.read();
        o61Var.c = inputStream.read();
        o61Var.d(4, "sps_video_parameter_set_id");
        this.sps_max_sub_layers_minus1 = (int) o61Var.d(3, "sps_max_sub_layers_minus1");
        o61Var.b("sps_temporal_id_nesting_flag");
        profile_tier_level(this.sps_max_sub_layers_minus1, o61Var);
        o61Var.e("sps_seq_parameter_set_id");
        int e = o61Var.e("chroma_format_idc");
        this.chroma_format_idc = e;
        if (e == 3) {
            o61Var.a();
        }
        this.pic_width_in_luma_samples = o61Var.e("pic_width_in_luma_samples");
        this.pic_height_in_luma_samples = o61Var.e("pic_width_in_luma_samples");
        if (o61Var.b("conformance_window_flag")) {
            o61Var.e("conf_win_left_offset");
            o61Var.e("conf_win_right_offset");
            o61Var.e("conf_win_top_offset");
            o61Var.e("conf_win_bottom_offset");
        }
        this.bit_depth_luma_minus8 = o61Var.e("bit_depth_luma_minus8");
        this.bit_depth_chroma_minus8 = o61Var.e("bit_depth_chroma_minus8");
        int e2 = o61Var.e("log2_max_pic_order_cnt_lsb_minus4");
        boolean b = o61Var.b("sps_sub_layer_ordering_info_present_flag");
        int i = this.sps_max_sub_layers_minus1;
        int i2 = (i - (b ? 0 : i)) + 1;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        for (i = b ? 0 : i; i <= this.sps_max_sub_layers_minus1; i++) {
            iArr[i] = o61Var.e("sps_max_dec_pic_buffering_minus1[" + i + "]");
            iArr2[i] = o61Var.e("sps_max_num_reorder_pics[" + i + "]");
            iArr3[i] = o61Var.e("sps_max_latency_increase_plus1[" + i + "]");
        }
        o61Var.e("log2_min_luma_coding_block_size_minus3");
        o61Var.e("log2_diff_max_min_luma_coding_block_size");
        o61Var.e("log2_min_transform_block_size_minus2");
        o61Var.e("log2_diff_max_min_transform_block_size");
        o61Var.e("max_transform_hierarchy_depth_inter");
        o61Var.e("max_transform_hierarchy_depth_intra");
        if (o61Var.b("scaling_list_enabled_flag") && o61Var.b("sps_scaling_list_data_present_flag")) {
            skip_scaling_list_data(o61Var);
        }
        o61Var.b("amp_enabled_flag");
        o61Var.b("sample_adaptive_offset_enabled_flag");
        if (o61Var.b("pcm_enabled_flag")) {
            o61Var.d(4, "pcm_sample_bit_depth_luma_minus1");
            o61Var.d(4, "pcm_sample_bit_depth_chroma_minus1");
            o61Var.e("log2_min_pcm_luma_coding_block_size_minus3");
            o61Var.e("log2_diff_max_min_pcm_luma_coding_block_size");
            o61Var.b("pcm_loop_filter_disabled_flag");
        }
        parse_short_term_ref_pic_sets(o61Var.e("num_short_term_ref_pic_sets"), o61Var);
        if (o61Var.b("long_term_ref_pics_present_flag")) {
            int e3 = o61Var.e("num_long_term_ref_pics_sps");
            int[] iArr4 = new int[e3];
            boolean[] zArr = new boolean[e3];
            for (int i3 = 0; i3 < e3; i3++) {
                iArr4[i3] = (int) o61Var.d(e2 + 4, "lt_ref_pic_poc_lsb_sps[" + i3 + "]");
                zArr[i3] = o61Var.b("used_by_curr_pic_lt_sps_flag[" + i3 + "]");
            }
        }
        o61Var.b("sps_temporal_mvp_enabled_flag");
        o61Var.b("strong_intra_smoothing_enabled_flag");
    }

    private void parse_short_term_ref_pic_sets(int i, o61 o61Var) {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0 || o61Var.a() != 1) {
                long e = o61Var.e("num_positive_pics") + o61Var.e("num_negative_pics");
                jArr[i2] = e;
                for (long j = 0; j < e; j++) {
                    o61Var.e("delta_poc_s0/1_minus1");
                    o61Var.b("used_by_curr_pic_s0/1_flag");
                }
            } else {
                o61Var.b("delta_rps_sign");
                o61Var.e("abs_delta_rps_minus1");
                jArr[i2] = 0;
                for (int i3 = 0; i3 <= jArr[i2 - 1]; i3++) {
                    boolean z = o61Var.a() == 1;
                    boolean z2 = !z && o61Var.a() == 1;
                    if (z || z2) {
                        jArr[i2] = jArr[i2] + 1;
                    }
                }
            }
        }
    }

    private void profile_tier_level(int i, o61 o61Var) {
        boolean[] zArr;
        long[] jArr;
        int[] iArr;
        boolean[] zArr2;
        int i2 = i;
        long d = o61Var.d(2, "general_profile_space");
        InputStream inputStream = o61Var.a;
        this.general_profile_space = (int) d;
        this.general_tier_flag = o61Var.b("general_tier_flag");
        this.general_profile_idc = (int) o61Var.d(5, "general_profile_idc");
        this.general_profile_compatibility_flags = o61Var.c(32);
        this.general_constraint_indicator_flags = o61Var.c(48);
        if (o61Var.d > 0) {
            o61Var.b = o61Var.c;
            o61Var.c = inputStream.read();
            o61Var.d = 0;
        }
        int i3 = o61Var.b;
        o61Var.b = o61Var.c;
        o61Var.c = inputStream.read();
        o61Var.d = 0;
        this.general_level_idc = (byte) i3;
        boolean[] zArr3 = new boolean[i2];
        boolean[] zArr4 = new boolean[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            zArr3[i4] = o61Var.b("sub_layer_profile_present_flag[" + i4 + "]");
            zArr4[i4] = o61Var.b("sub_layer_level_present_flag[" + i4 + "]");
        }
        if (i2 > 0) {
            int[] iArr2 = new int[8];
            for (int i5 = i2; i5 < 8; i5++) {
                iArr2[i5] = (int) o61Var.d(2, "reserved_zero_2bits[" + i5 + "]");
            }
        }
        int[] iArr3 = new int[i2];
        boolean[] zArr5 = new boolean[i2];
        int[] iArr4 = new int[i2];
        boolean[][] zArr6 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i2, 32);
        boolean[] zArr7 = new boolean[i2];
        boolean[] zArr8 = new boolean[i2];
        boolean[] zArr9 = new boolean[i2];
        boolean[] zArr10 = new boolean[i2];
        long[] jArr2 = new long[i2];
        int[] iArr5 = new int[i2];
        int i6 = 0;
        while (i6 < i2) {
            if (zArr3[i6]) {
                zArr = zArr3;
                jArr = jArr2;
                iArr = iArr5;
                iArr3[i6] = (int) o61Var.d(2, "sub_layer_profile_space[" + i6 + "]");
                zArr5[i6] = o61Var.b("sub_layer_tier_flag[" + i6 + "]");
                iArr4[i6] = (int) o61Var.d(5, "sub_layer_profile_idc[" + i6 + "]");
                for (int i7 = 0; i7 < 32; i7++) {
                    zArr6[i6][i7] = o61Var.b("sub_layer_profile_compatibility_flag[" + i6 + "][" + i7 + "]");
                }
                zArr7[i6] = o61Var.b("sub_layer_progressive_source_flag[" + i6 + "]");
                zArr8[i6] = o61Var.b("sub_layer_interlaced_source_flag[" + i6 + "]");
                zArr9[i6] = o61Var.b("sub_layer_non_packed_constraint_flag[" + i6 + "]");
                zArr10[i6] = o61Var.b("sub_layer_frame_only_constraint_flag[" + i6 + "]");
                jArr[i6] = o61Var.c(44);
            } else {
                zArr = zArr3;
                jArr = jArr2;
                iArr = iArr5;
            }
            if (zArr4[i6]) {
                zArr2 = zArr10;
                iArr[i6] = (int) o61Var.d(8, "sub_layer_level_idc[" + i6 + "]");
            } else {
                zArr2 = zArr10;
            }
            i6++;
            i2 = i;
            zArr10 = zArr2;
            jArr2 = jArr;
            zArr3 = zArr;
            iArr5 = iArr;
        }
    }

    private static void skip_scaling_list_data(o61 o61Var) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (true) {
                if (i2 < (i == 3 ? 2 : 6)) {
                    if (o61Var.a() == 1) {
                        o61Var.e("scaling_list_pred_matrix_id_delta");
                    } else {
                        int min = Math.min(64, 1 << ((i << 1) + 4));
                        if (i > 1) {
                            o61Var.e("scaling_list_dc_coef_minus8");
                        }
                        for (int i3 = 0; i3 < min; i3++) {
                            o61Var.e("scaling_list_delta_coef");
                        }
                    }
                    i2++;
                }
            }
            i++;
        }
    }
}
