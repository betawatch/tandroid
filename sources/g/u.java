package g;

import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import m.j1;
import m.l3;
import org.telegram.messenger.beta.R;
import r0.i0;
import w7.v6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class u extends androidx.activity.n {
    public s d;
    public final t e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, r2);
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        this.e = new r0.j() { // from class: g.t
            @Override // r0.j
            public final boolean i(KeyEvent keyEvent) {
                return u.this.d(keyEvent);
            }
        };
        h c10 = c();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((s) c10).c0 = i10;
        c10.a();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.k();
        ((ViewGroup) sVar.J.findViewById(android.R.id.content)).addView(view, layoutParams);
        sVar.h.a(sVar.f.getCallback());
    }

    public final h c() {
        if (this.d == null) {
            int i10 = h.a;
            this.d = new s(this, this);
        }
        return this.d;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        s sVar = (s) c();
        u uVar = sVar.d;
        if (sVar.h0) {
            sVar.f.getDecorView().removeCallbacks(sVar.j0);
        }
        sVar.Z = true;
        if (sVar.b0 != -100) {
            u uVar2 = sVar.d;
        }
        s.q0.remove(sVar.d.getClass().getName());
        o oVar = sVar.f0;
        if (oVar != null) {
            oVar.c();
        }
        o oVar2 = sVar.g0;
        if (oVar2 != null) {
            oVar2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return v6.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        s sVar = (s) c();
        sVar.k();
        return sVar.f.findViewById(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        s sVar = (s) c();
        if (sVar.n != null) {
            sVar.q().getClass();
            sVar.r(0);
        }
    }

    @Override // androidx.activity.n, android.app.Dialog
    public void onCreate(Bundle bundle) {
        s sVar = (s) c();
        LayoutInflater from = LayoutInflater.from(sVar.e);
        if (from.getFactory() == null) {
            from.setFactory2(sVar);
        } else if (!(from.getFactory2() instanceof s)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void onStop() {
        bc.d dVar;
        super.onStop();
        b0 q6 = ((s) c()).q();
        if (q6 == null || (dVar = q6.s) == null) {
            return;
        }
        dVar.a();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void setContentView(int i10) {
        s sVar = (s) c();
        sVar.k();
        ViewGroup viewGroup = (ViewGroup) sVar.J.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(sVar.e).inflate(i10, viewGroup);
        sVar.h.a(sVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        s sVar = (s) c();
        sVar.r = charSequence;
        j1 j1Var = sVar.s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        b0 b0Var = sVar.n;
        if (b0Var == null) {
            TextView textView = sVar.K;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        l3 l3Var = (l3) b0Var.e;
        if (l3Var.g) {
            return;
        }
        Toolbar toolbar = l3Var.a;
        l3Var.h = charSequence;
        if ((l3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (l3Var.g) {
                i0.l(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void setContentView(View view) {
        s sVar = (s) c();
        sVar.k();
        ViewGroup viewGroup = (ViewGroup) sVar.J.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        sVar.h.a(sVar.f.getCallback());
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.k();
        ViewGroup viewGroup = (ViewGroup) sVar.J.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        sVar.h.a(sVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        h c10 = c();
        String string = getContext().getString(i10);
        s sVar = (s) c10;
        sVar.r = string;
        j1 j1Var = sVar.s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        b0 b0Var = sVar.n;
        if (b0Var != null) {
            l3 l3Var = (l3) b0Var.e;
            if (l3Var.g) {
                return;
            }
            Toolbar toolbar = l3Var.a;
            l3Var.h = string;
            if ((l3Var.b & 8) != 0) {
                toolbar.setTitle(string);
                if (l3Var.g) {
                    i0.l(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = sVar.K;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
