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
import c8.yb;
import m.j1;
import m.k3;
import org.telegram.messenger.beta.R;
import r0.i0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class u extends androidx.activity.m {
    public s d;
    public final t e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper, r2);
        int i10;
        if (i7 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = i7;
        }
        this.e = new r0.i() { // from class: g.t
            @Override // r0.i
            public final boolean i(KeyEvent keyEvent) {
                return u.this.d(keyEvent);
            }
        };
        g c10 = c();
        if (i7 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i7 = typedValue2.resourceId;
        }
        ((s) c10).d0 = i7;
        c10.a();
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.m();
        ((ViewGroup) sVar.K.findViewById(android.R.id.content)).addView(view, layoutParams);
        sVar.h.a(sVar.f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i7 = g.a;
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
        if (sVar.i0) {
            sVar.f.getDecorView().removeCallbacks(sVar.k0);
        }
        sVar.a0 = true;
        if (sVar.c0 != -100) {
            u uVar2 = sVar.d;
        }
        s.r0.remove(sVar.d.getClass().getName());
        o oVar = sVar.g0;
        if (oVar != null) {
            oVar.c();
        }
        o oVar2 = sVar.h0;
        if (oVar2 != null) {
            oVar2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return yb.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i7) {
        s sVar = (s) c();
        sVar.m();
        return sVar.f.findViewById(i7);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        s sVar = (s) c();
        if (sVar.n != null) {
            sVar.r().getClass();
            sVar.s(0);
        }
    }

    @Override // androidx.activity.m, android.app.Dialog
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

    @Override // androidx.activity.m, android.app.Dialog
    public final void onStop() {
        ac.d dVar;
        super.onStop();
        b0 r10 = ((s) c()).r();
        if (r10 == null || (dVar = r10.s) == null) {
            return;
        }
        dVar.a();
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(int i7) {
        s sVar = (s) c();
        sVar.m();
        ViewGroup viewGroup = (ViewGroup) sVar.K.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(sVar.e).inflate(i7, viewGroup);
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
            TextView textView = sVar.L;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        k3 k3Var = (k3) b0Var.e;
        if (k3Var.g) {
            return;
        }
        Toolbar toolbar = k3Var.a;
        k3Var.h = charSequence;
        if ((k3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k3Var.g) {
                i0.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(View view) {
        s sVar = (s) c();
        sVar.m();
        ViewGroup viewGroup = (ViewGroup) sVar.K.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        sVar.h.a(sVar.f.getCallback());
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.m();
        ViewGroup viewGroup = (ViewGroup) sVar.K.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        sVar.h.a(sVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(int i7) {
        super.setTitle(i7);
        g c10 = c();
        String string = getContext().getString(i7);
        s sVar = (s) c10;
        sVar.r = string;
        j1 j1Var = sVar.s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        b0 b0Var = sVar.n;
        if (b0Var != null) {
            k3 k3Var = (k3) b0Var.e;
            if (k3Var.g) {
                return;
            }
            Toolbar toolbar = k3Var.a;
            k3Var.h = string;
            if ((k3Var.b & 8) != 0) {
                toolbar.setTitle(string);
                if (k3Var.g) {
                    i0.k(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = sVar.L;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
