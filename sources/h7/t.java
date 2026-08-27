package h7;

import android.util.Base64;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class t {
    public static z3.c a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = d5.g0.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                d5.a.K("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new d5.z(Base64.decode(split[1], 0))));
                } catch (RuntimeException e9) {
                    d5.a.L("VorbisUtil", "Failed to parse vorbis picture", e9);
                }
            } else {
                arrayList.add(new h4.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new z3.c(arrayList);
    }

    public static m3.y b(d5.z zVar, boolean z10, boolean z11) {
        if (z10) {
            c(3, zVar, false);
        }
        zVar.p((int) zVar.i(), o8.d.c);
        long i10 = zVar.i();
        String[] strArr = new String[(int) i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = zVar.p((int) zVar.i(), o8.d.c);
        }
        if (z11 && (zVar.r() & 1) == 0) {
            throw h3.t1.a("framing bit expected to be set", null);
        }
        return new m3.y(strArr);
    }

    public static boolean c(int i10, d5.z zVar, boolean z10) {
        if (zVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw h3.t1.a("too short header: " + zVar.a(), null);
        }
        if (zVar.r() != i10) {
            if (z10) {
                return false;
            }
            throw h3.t1.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (zVar.r() == 118 && zVar.r() == 111 && zVar.r() == 114 && zVar.r() == 98 && zVar.r() == 105 && zVar.r() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw h3.t1.a("expected characters 'vorbis'", null);
    }
}
