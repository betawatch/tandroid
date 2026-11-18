package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class io0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ yo0 c;

    public io0(yo0 yo0Var, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = yo0Var;
                this.b = new Rect();
                break;
            default:
                this.c = yo0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        yo0 yo0Var;
        org.telegram.ui.ActionBar.h1 h1Var;
        yo0 yo0Var2;
        org.telegram.ui.ActionBar.h1 h1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (h1Var = (yo0Var = this.c).F2) != null && h1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        yo0Var.F2.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (h1Var2 = (yo0Var2 = this.c).F2) != null && h1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        yo0Var2.F2.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
