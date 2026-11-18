package oi;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ n2(s3 s3Var, a aVar, int i7, int i10) {
        this.a = i10;
        this.b = s3Var;
        this.c = aVar;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View C1;
        View C12;
        switch (this.a) {
            case 0:
                s3 s3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    s3Var.getClass();
                    C1 = null;
                } else {
                    C1 = s3Var.C1(aVar);
                }
                if (C1 instanceof z5) {
                    z5 z5Var = (z5) C1;
                    z5Var.B();
                    z5Var.getEditText().setSelection(Math.min(this.d, z5Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                s3 s3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    s3Var2.getClass();
                    C12 = null;
                } else {
                    C12 = s3Var2.C1(aVar2);
                }
                if (C12 instanceof z5) {
                    z5 z5Var2 = (z5) C12;
                    z5Var2.B();
                    z5Var2.getEditText().setSelection(Math.min(this.d, z5Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View C13 = this.b.C1(this.c);
                if (C13 instanceof z5) {
                    z5 z5Var3 = (z5) C13;
                    z5Var3.B();
                    z5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, z5Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View C14 = this.b.C1(this.c);
                if (C14 instanceof z5) {
                    z5 z5Var4 = (z5) C14;
                    z5Var4.B();
                    z5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, z5Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View C15 = this.b.C1(this.c);
                if (C15 instanceof z5) {
                    z5 z5Var5 = (z5) C15;
                    z5Var5.B();
                    z5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, z5Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View C16 = this.b.C1(this.c);
                if (C16 instanceof z5) {
                    z5 z5Var6 = (z5) C16;
                    z5Var6.B();
                    z5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, z5Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
