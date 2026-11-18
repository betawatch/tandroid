package oi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ l2(s3 s3Var, a aVar, int i7) {
        this.a = i7;
        this.b = s3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g3(this.c);
                break;
            case 1:
                View C1 = this.b.C1(this.c);
                if (C1 instanceof z5) {
                    z5 z5Var = (z5) C1;
                    z5Var.B();
                    z5Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                this.b.g3(this.c);
                break;
            case 3:
                this.b.f3(this.c, true);
                break;
            case 4:
                this.b.f3(this.c, false);
                break;
            case 5:
                this.b.f3(this.c, true);
                break;
            case 6:
                this.b.g3(this.c);
                break;
            case 7:
                this.b.e3(this.c, false);
                break;
            case 8:
                this.b.e3(this.c, true);
                break;
            case 9:
                this.b.g3(this.c);
                break;
            case 10:
                this.b.e3(this.c, true);
                break;
            case 11:
                this.b.g3(this.c);
                break;
            case 12:
                this.b.f3(this.c, false);
                break;
            case 13:
                this.b.e3(this.c, true);
                break;
            case 14:
                s3 s3Var = this.b;
                KeyEvent.Callback C12 = s3Var.C1(this.c);
                if (C12 instanceof i9) {
                    s3Var.v3.b0(0, 0, (i9) C12);
                    break;
                }
                break;
            case 15:
                s3 s3Var2 = this.b;
                KeyEvent.Callback C13 = s3Var2.C1(this.c);
                if (C13 instanceof i9) {
                    s3Var2.v3.b0(0, C13 instanceof z5 ? ((z5) C13).getEditText().length() : 0, (i9) C13);
                    break;
                }
                break;
            case 16:
                this.b.i3(this.c);
                break;
            case 17:
                View C14 = this.b.C1(this.c);
                if (C14 instanceof z5) {
                    z5 z5Var2 = (z5) C14;
                    z5Var2.B();
                    z5Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View C15 = this.b.C1(this.c);
                if (!(C15 instanceof z5)) {
                    if (C15 instanceof l5) {
                        l5 l5Var = (l5) C15;
                        if (l5Var.getGrid().getChildCount() > 0) {
                            View childAt = l5Var.getGrid().getChildAt(0);
                            if (childAt instanceof o5) {
                                ((o5) childAt).a.O();
                                break;
                            }
                        }
                    }
                } else {
                    z5 z5Var3 = (z5) C15;
                    z5Var3.B();
                    z5Var3.getEditText().setSelection(z5Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.h3(this.c);
                break;
            case 20:
                View C16 = this.b.C1(this.c);
                if (C16 instanceof p0) {
                    ((p0) C16).d.O();
                    break;
                }
                break;
            case 21:
                this.b.h3(this.c);
                break;
            case 22:
                this.b.h3(this.c);
                break;
            case 23:
                View C17 = this.b.C1(this.c);
                if (C17 instanceof z5) {
                    z5 z5Var4 = (z5) C17;
                    z5Var4.B();
                    z5Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.g3(this.c);
                break;
            case 25:
                this.b.d5("", this.c);
                break;
            case 26:
                this.b.g3(this.c);
                break;
            case 27:
                this.b.g3(this.c);
                break;
            case 28:
                this.b.g3(this.c);
                break;
            default:
                this.b.g3(this.c);
                break;
        }
    }
}
