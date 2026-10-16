package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import m.c3;

/* loaded from: classes.dex */
public final class c extends ContentObserver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(null);
        this.b = bVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                synchronized (bVar.d) {
                    bVar.e = null;
                }
                b.a((b) this.b);
                return;
            default:
                c3 c3Var = (c3) this.b;
                if (!c3Var.b || (cursor = c3Var.c) == null || cursor.isClosed()) {
                    return;
                }
                c3Var.a = c3Var.c.requery();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c3 c3Var) {
        super(new Handler());
        this.b = c3Var;
    }
}
