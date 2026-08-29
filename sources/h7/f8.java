package h7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class f8 {
    public f8() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i10);

    public abstract Typeface b(Context context, o0.j[] jVarArr, int i10);

    public Typeface c(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = g8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (g8.c(inputStream, d)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File d = g8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (g8.b(d, resources, i10)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.j f(o0.j[] jVarArr, int i10) {
        new bb.a(9);
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        o0.j jVar = null;
        int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (o0.j jVar2 : jVarArr) {
            int abs = (Math.abs(jVar2.c - i11) * 2) + (jVar2.d == z10 ? 0 : 1);
            if (jVar == null || i12 > abs) {
                jVar = jVar2;
                i12 = abs;
            }
        }
        return jVar;
    }
}
