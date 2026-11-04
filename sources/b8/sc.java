package b8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class sc {
    public sc() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i3);

    public abstract Typeface b(Context context, o0.i[] iVarArr, int i3);

    public Typeface c(Context context, List list, int i3) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = tc.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (tc.c(d, inputStream)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i3, String str, int i10) {
        File d = tc.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (tc.b(d, resources, i3)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.i f(o0.i[] iVarArr, int i3) {
        new nb.a(10);
        int i10 = (i3 & 1) == 0 ? 400 : 700;
        boolean z10 = (i3 & 2) != 0;
        o0.i iVar = null;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (o0.i iVar2 : iVarArr) {
            int abs = (Math.abs(iVar2.c - i10) * 2) + (iVar2.d == z10 ? 0 : 1);
            if (iVar == null || i11 > abs) {
                iVar = iVar2;
                i11 = abs;
            }
        }
        return iVar;
    }
}
