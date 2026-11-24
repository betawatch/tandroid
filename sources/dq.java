// default package

import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class dq extends jr2 {
    public bq d;
    public final cq e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [cq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dq(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.e = new kx5() { // from class: cq
            @Override // kx5
            public final boolean i(KeyEvent keyEvent) {
                return dq.this.d(keyEvent);
            }
        };
        pp c = c();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((bq) c).d0 = i;
        c.a();
    }

    @Override // jr2, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        bq bqVar = (bq) c();
        bqVar.k();
        ((ViewGroup) bqVar.K.findViewById(android.R.id.content)).addView(view, layoutParams);
        bqVar.h.a(bqVar.f.getCallback());
    }

    public final pp c() {
        bq bqVar = this.d;
        if (bqVar != null) {
            return bqVar;
        }
        int i = pp.a;
        bq bqVar2 = new bq(this, this);
        this.d = bqVar2;
        return bqVar2;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        bq bqVar = (bq) c();
        dq dqVar = bqVar.d;
        if (bqVar.i0) {
            bqVar.f.getDecorView().removeCallbacks(bqVar.k0);
        }
        bqVar.a0 = true;
        if (bqVar.c0 != -100) {
            dq dqVar2 = bqVar.d;
        }
        bq.r0.remove(bqVar.d.getClass().getName());
        xp xpVar = bqVar.g0;
        if (xpVar != null) {
            xpVar.c();
        }
        xp xpVar2 = bqVar.h0;
        if (xpVar2 != null) {
            xpVar2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return xne.a(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        bq bqVar = (bq) c();
        bqVar.k();
        return bqVar.f.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        bq bqVar = (bq) c();
        if (bqVar.n != null) {
            bqVar.p().getClass();
            bqVar.q(0);
        }
    }

    @Override // jr2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        bq bqVar = (bq) c();
        LayoutInflater from = LayoutInflater.from(bqVar.e);
        if (from.getFactory() == null) {
            from.setFactory2(bqVar);
        } else if (!(from.getFactory2() instanceof bq)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override // jr2, android.app.Dialog
    public final void onStop() {
        chc chcVar;
        super.onStop();
        azc p = ((bq) c()).p();
        if (p == null || (chcVar = p.s) == null) {
            return;
        }
        chcVar.a();
    }

    @Override // jr2, android.app.Dialog
    public final void setContentView(int i) {
        bq bqVar = (bq) c();
        bqVar.k();
        ViewGroup viewGroup = (ViewGroup) bqVar.K.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(bqVar.e).inflate(i, viewGroup);
        bqVar.h.a(bqVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        pp c = c();
        String string = getContext().getString(i);
        bq bqVar = (bq) c;
        bqVar.r = string;
        ActionBarOverlayLayout actionBarOverlayLayout = bqVar.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(string);
            return;
        }
        azc azcVar = bqVar.n;
        if (azcVar == null) {
            TextView textView = bqVar.L;
            if (textView != null) {
                textView.setText(string);
                return;
            }
            return;
        }
        jvb jvbVar = (jvb) azcVar.e;
        if (jvbVar.g) {
            return;
        }
        Toolbar toolbar = jvbVar.a;
        jvbVar.h = string;
        if ((jvbVar.b & 8) != 0) {
            toolbar.setTitle(string);
            if (jvbVar.g) {
                kfc.l(toolbar.getRootView(), string);
            }
        }
    }

    @Override // jr2, android.app.Dialog
    public final void setContentView(View view) {
        bq bqVar = (bq) c();
        bqVar.k();
        ViewGroup viewGroup = (ViewGroup) bqVar.K.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        bqVar.h.a(bqVar.f.getCallback());
    }

    @Override // jr2, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        bq bqVar = (bq) c();
        bqVar.k();
        ViewGroup viewGroup = (ViewGroup) bqVar.K.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        bqVar.h.a(bqVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        bq bqVar = (bq) c();
        bqVar.r = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = bqVar.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        azc azcVar = bqVar.n;
        if (azcVar != null) {
            jvb jvbVar = (jvb) azcVar.e;
            if (jvbVar.g) {
                return;
            }
            Toolbar toolbar = jvbVar.a;
            jvbVar.h = charSequence;
            if ((jvbVar.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (jvbVar.g) {
                    kfc.l(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = bqVar.L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
