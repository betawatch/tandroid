package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ge(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                lj ljVar = this.b.m2;
                if (ljVar != null) {
                    ljVar.c(false);
                    break;
                }
                break;
            case 1:
                an.j1(this.b);
                break;
            case 2:
                this.b.x8(false, true, 0.0f);
                break;
            case 3:
                this.b.x8(false, true, 0.0f);
                break;
            case 4:
                this.b.x8(false, true, 0.0f);
                break;
            case 5:
                this.b.x8(false, true, 0.0f);
                break;
            case 6:
                this.b.x8(false, true, 0.0f);
                break;
            case 7:
                this.b.x8(false, true, 0.0f);
                break;
            default:
                this.b.jc = null;
                break;
        }
    }
}
