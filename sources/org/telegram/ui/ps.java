package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ps extends of.o1 {
    public final /* synthetic */ ContactsActivity G;

    public ps(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.G = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.D = new ArrayList();
        this.c = context;
        this.h = hVar;
        this.r = z10;
        this.s = z11;
        this.x = 0;
        this.v = z12;
        this.w = true;
        of.v1 v1Var = new of.v1(true);
        this.f = v1Var;
        v1Var.a = new of.l1(this);
    }

    @Override // of.o1
    public final void F() {
        if (this.y || this.f.e() || h() != 0) {
            return;
        }
        this.G.e.e(false, true);
    }
}
