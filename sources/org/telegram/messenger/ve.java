package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class ve {
    public final int a;
    public boolean b;
    public final String c;
    public final ff d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public ve(int i7, String str, ff ffVar) {
        this.a = i7;
        this.c = str;
        this.d = ffVar;
    }

    public final void a(ff ffVar) {
        this.e.add(ffVar);
        this.f.put(ffVar.C, ffVar);
    }
}
