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
import m.m3;
import org.telegram.messenger.beta.R;
import r0.i0;
import w7.x6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class t extends androidx.activity.m {
    public r d;
    public final s e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, r2);
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        this.e = new r0.j() { // from class: g.s
            @Override // r0.j
            public final boolean i(KeyEvent keyEvent) {
                return t.this.d(keyEvent);
            }
        };
        g c10 = c();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((r) c10).c0 = i10;
        c10.a();
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ((ViewGroup) rVar.J.findViewById(android.R.id.content)).addView(view, layoutParams);
        rVar.h.a(rVar.f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i10 = g.a;
            this.d = new r(this, this);
        }
        return this.d;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        r rVar = (r) c();
        t tVar = rVar.d;
        if (rVar.h0) {
            rVar.f.getDecorView().removeCallbacks(rVar.j0);
        }
        rVar.Z = true;
        if (rVar.b0 != -100) {
            t tVar2 = rVar.d;
        }
        r.q0.remove(rVar.d.getClass().getName());
        n nVar = rVar.f0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = rVar.g0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return x6.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        r rVar = (r) c();
        rVar.k();
        return rVar.f.findViewById(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        r rVar = (r) c();
        if (rVar.n != null) {
            rVar.q().getClass();
            rVar.r(0);
        }
    }

    @Override // androidx.activity.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        r rVar = (r) c();
        LayoutInflater from = LayoutInflater.from(rVar.e);
        if (from.getFactory() == null) {
            from.setFactory2(rVar);
        } else if (!(from.getFactory2() instanceof r)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void onStop() {
        bc.d dVar;
        super.onStop();
        a0 q6 = ((r) c()).q();
        if (q6 == null || (dVar = q6.s) == null) {
            return;
        }
        dVar.a();
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(int i10) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(rVar.e).inflate(i10, viewGroup);
        rVar.h.a(rVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        r rVar = (r) c();
        rVar.r = charSequence;
        j1 j1Var = rVar.s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        a0 a0Var = rVar.n;
        if (a0Var == null) {
            TextView textView = rVar.K;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        m3 m3Var = (m3) a0Var.e;
        if (m3Var.g) {
            return;
        }
        Toolbar toolbar = m3Var.a;
        m3Var.h = charSequence;
        if ((m3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (m3Var.g) {
                i0.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(View view) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        rVar.h.a(rVar.f.getCallback());
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        rVar.h.a(rVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        g c10 = c();
        String string = getContext().getString(i10);
        r rVar = (r) c10;
        rVar.r = string;
        j1 j1Var = rVar.s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        a0 a0Var = rVar.n;
        if (a0Var != null) {
            m3 m3Var = (m3) a0Var.e;
            if (m3Var.g) {
                return;
            }
            Toolbar toolbar = m3Var.a;
            m3Var.h = string;
            if ((m3Var.b & 8) != 0) {
                toolbar.setTitle(string);
                if (m3Var.g) {
                    i0.k(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = rVar.K;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
