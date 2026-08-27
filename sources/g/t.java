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
import h7.r6;
import m.k1;
import m.p3;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        this.e = new r0.k() { // from class: g.s
            @Override // r0.k
            public final boolean i(KeyEvent keyEvent) {
                return t.this.d(keyEvent);
            }
        };
        h c10 = c();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((r) c10).Y = i10;
        c10.a();
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.l();
        ((ViewGroup) rVar.F.findViewById(android.R.id.content)).addView(view, layoutParams);
        rVar.h.a(rVar.f.getCallback());
    }

    public final h c() {
        if (this.d == null) {
            int i10 = h.a;
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
        if (rVar.d0) {
            rVar.f.getDecorView().removeCallbacks(rVar.f0);
        }
        rVar.V = true;
        if (rVar.X != -100) {
            t tVar2 = rVar.d;
        }
        r.m0.remove(rVar.d.getClass().getName());
        o oVar = rVar.b0;
        if (oVar != null) {
            oVar.c();
        }
        o oVar2 = rVar.c0;
        if (oVar2 != null) {
            oVar2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return r6.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        r rVar = (r) c();
        rVar.l();
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
        k.j jVar;
        super.onStop();
        b0 q6 = ((r) c()).q();
        if (q6 == null || (jVar = q6.s) == null) {
            return;
        }
        jVar.a();
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(int i10) {
        r rVar = (r) c();
        rVar.l();
        ViewGroup viewGroup = (ViewGroup) rVar.F.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(rVar.e).inflate(i10, viewGroup);
        rVar.h.a(rVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        r rVar = (r) c();
        rVar.r = charSequence;
        k1 k1Var = rVar.s;
        if (k1Var != null) {
            k1Var.setWindowTitle(charSequence);
            return;
        }
        b0 b0Var = rVar.n;
        if (b0Var == null) {
            TextView textView = rVar.G;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        p3 p3Var = (p3) b0Var.e;
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

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(View view) {
        r rVar = (r) c();
        rVar.l();
        ViewGroup viewGroup = (ViewGroup) rVar.F.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        rVar.h.a(rVar.f.getCallback());
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.l();
        ViewGroup viewGroup = (ViewGroup) rVar.F.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        rVar.h.a(rVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        h c10 = c();
        String string = getContext().getString(i10);
        r rVar = (r) c10;
        rVar.r = string;
        k1 k1Var = rVar.s;
        if (k1Var != null) {
            k1Var.setWindowTitle(string);
            return;
        }
        b0 b0Var = rVar.n;
        if (b0Var != null) {
            p3 p3Var = (p3) b0Var.e;
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
        TextView textView = rVar.G;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
