package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class xe {
    public final int a;
    public boolean b;
    public final String c;
    public final ff d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public xe(int i10, String str, ff ffVar) {
        this.a = i10;
        this.c = str;
        this.d = ffVar;
    }

    public final void a(ff ffVar) {
        this.e.add(ffVar);
        this.f.put(ffVar.C, ffVar);
    }
}
