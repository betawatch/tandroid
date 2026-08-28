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
import g7.z6;
import m.k1;
import m.p3;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class s extends androidx.activity.n {
    public q d;
    public final r e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(ContextThemeWrapper contextThemeWrapper, int i9) {
        super(contextThemeWrapper, r2);
        int i10;
        if (i9 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = i9;
        }
        this.e = new r0.k() { // from class: g.r
            @Override // r0.k
            public final boolean i(KeyEvent keyEvent) {
                return s.this.d(keyEvent);
            }
        };
        g c10 = c();
        if (i9 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i9 = typedValue2.resourceId;
        }
        ((q) c10).Y = i9;
        c10.a();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) c();
        qVar.k();
        ((ViewGroup) qVar.F.findViewById(android.R.id.content)).addView(view, layoutParams);
        qVar.h.a(qVar.f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i9 = g.a;
            this.d = new q(this, this);
        }
        return this.d;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        q qVar = (q) c();
        s sVar = qVar.d;
        if (qVar.d0) {
            qVar.f.getDecorView().removeCallbacks(qVar.f0);
        }
        qVar.V = true;
        if (qVar.X != -100) {
            s sVar2 = qVar.d;
        }
        q.m0.remove(qVar.d.getClass().getName());
        n nVar = qVar.b0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = qVar.c0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return z6.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i9) {
        q qVar = (q) c();
        qVar.k();
        return qVar.f.findViewById(i9);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        q qVar = (q) c();
        if (qVar.n != null) {
            qVar.q().getClass();
            qVar.s(0);
        }
    }

    @Override // androidx.activity.n, android.app.Dialog
    public void onCreate(Bundle bundle) {
        q qVar = (q) c();
        LayoutInflater from = LayoutInflater.from(qVar.e);
        if (from.getFactory() == null) {
            from.setFactory2(qVar);
        } else if (!(from.getFactory2() instanceof q)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void onStop() {
        jb.d dVar;
        super.onStop();
        a0 q10 = ((q) c()).q();
        if (q10 == null || (dVar = q10.s) == null) {
            return;
        }
        dVar.a();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void setContentView(int i9) {
        q qVar = (q) c();
        qVar.k();
        ViewGroup viewGroup = (ViewGroup) qVar.F.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(qVar.e).inflate(i9, viewGroup);
        qVar.h.a(qVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        q qVar = (q) c();
        qVar.r = charSequence;
        k1 k1Var = qVar.s;
        if (k1Var != null) {
            k1Var.setWindowTitle(charSequence);
            return;
        }
        a0 a0Var = qVar.n;
        if (a0Var == null) {
            TextView textView = qVar.G;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        p3 p3Var = (p3) a0Var.e;
        if (p3Var.g) {
            return;
        }
        Toolbar toolbar = p3Var.a;
        p3Var.h = charSequence;
        if ((p3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (p3Var.g) {
                j0.l(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void setContentView(View view) {
        q qVar = (q) c();
        qVar.k();
        ViewGroup viewGroup = (ViewGroup) qVar.F.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        qVar.h.a(qVar.f.getCallback());
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) c();
        qVar.k();
        ViewGroup viewGroup = (ViewGroup) qVar.F.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        qVar.h.a(qVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(int i9) {
        super.setTitle(i9);
        g c10 = c();
        String string = getContext().getString(i9);
        q qVar = (q) c10;
        qVar.r = string;
        k1 k1Var = qVar.s;
        if (k1Var != null) {
            k1Var.setWindowTitle(string);
            return;
        }
        a0 a0Var = qVar.n;
        if (a0Var != null) {
            p3 p3Var = (p3) a0Var.e;
            if (p3Var.g) {
                return;
            }
            Toolbar toolbar = p3Var.a;
            p3Var.h = string;
            if ((p3Var.b & 8) != 0) {
                toolbar.setTitle(string);
                if (p3Var.g) {
                    j0.l(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = qVar.G;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
