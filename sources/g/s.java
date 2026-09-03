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
import k7.q6;
import m.j1;
import m.n3;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class s extends androidx.activity.n {
    public q d;
    public final r e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, r2);
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        this.e = new r0.k() { // from class: g.r
            @Override // r0.k
            public final boolean i(KeyEvent keyEvent) {
                return s.this.d(keyEvent);
            }
        };
        g c3 = c();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((q) c3).Z = i10;
        c3.a();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) c();
        qVar.l();
        ((ViewGroup) qVar.G.findViewById(android.R.id.content)).addView(view, layoutParams);
        qVar.h.a(qVar.f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i10 = g.a;
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
        if (qVar.e0) {
            qVar.f.getDecorView().removeCallbacks(qVar.g0);
        }
        qVar.W = true;
        if (qVar.Y != -100) {
            s sVar2 = qVar.d;
        }
        q.n0.remove(qVar.d.getClass().getName());
        n nVar = qVar.c0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = qVar.d0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return q6.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        q qVar = (q) c();
        qVar.l();
        return qVar.f.findViewById(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        q qVar = (q) c();
        if (qVar.n != null) {
            qVar.q().getClass();
            qVar.r(0);
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
        k.j jVar;
        super.onStop();
        a0 q10 = ((q) c()).q();
        if (q10 == null || (jVar = q10.s) == null) {
            return;
        }
        jVar.a();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void setContentView(int i10) {
        q qVar = (q) c();
        qVar.l();
        ViewGroup viewGroup = (ViewGroup) qVar.G.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(qVar.e).inflate(i10, viewGroup);
        qVar.h.a(qVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        q qVar = (q) c();
        qVar.r = charSequence;
        j1 j1Var = qVar.s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        a0 a0Var = qVar.n;
        if (a0Var == null) {
            TextView textView = qVar.H;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        n3 n3Var = (n3) a0Var.e;
        if (n3Var.g) {
            return;
        }
        Toolbar toolbar = n3Var.a;
        n3Var.h = charSequence;
        if ((n3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (n3Var.g) {
                j0.l(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void setContentView(View view) {
        q qVar = (q) c();
        qVar.l();
        ViewGroup viewGroup = (ViewGroup) qVar.G.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        qVar.h.a(qVar.f.getCallback());
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) c();
        qVar.l();
        ViewGroup viewGroup = (ViewGroup) qVar.G.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        qVar.h.a(qVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        g c3 = c();
        String string = getContext().getString(i10);
        q qVar = (q) c3;
        qVar.r = string;
        j1 j1Var = qVar.s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        a0 a0Var = qVar.n;
        if (a0Var != null) {
            n3 n3Var = (n3) a0Var.e;
            if (n3Var.g) {
                return;
            }
            Toolbar toolbar = n3Var.a;
            n3Var.h = string;
            if ((n3Var.b & 8) != 0) {
                toolbar.setTitle(string);
                if (n3Var.g) {
                    j0.l(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = qVar.H;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
