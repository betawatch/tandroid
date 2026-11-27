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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ep extends rq2 {
    public cp d;
    public final dp e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [dp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ep(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.e = new px5() { // from class: dp
            @Override // px5
            public final boolean i(KeyEvent keyEvent) {
                return ep.this.d(keyEvent);
            }
        };
        qo c = c();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((cp) c).d0 = i;
        c.a();
    }

    @Override // rq2, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        cp cpVar = (cp) c();
        cpVar.k();
        ((ViewGroup) cpVar.K.findViewById(android.R.id.content)).addView(view, layoutParams);
        cpVar.h.a(cpVar.f.getCallback());
    }

    public final qo c() {
        cp cpVar = this.d;
        if (cpVar != null) {
            return cpVar;
        }
        int i = qo.a;
        cp cpVar2 = new cp(this, this);
        this.d = cpVar2;
        return cpVar2;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        cp cpVar = (cp) c();
        ep epVar = cpVar.d;
        if (cpVar.i0) {
            cpVar.f.getDecorView().removeCallbacks(cpVar.k0);
        }
        cpVar.a0 = true;
        if (cpVar.c0 != -100) {
            ep epVar2 = cpVar.d;
        }
        cp.r0.remove(cpVar.d.getClass().getName());
        yo yoVar = cpVar.g0;
        if (yoVar != null) {
            yoVar.c();
        }
        yo yoVar2 = cpVar.h0;
        if (yoVar2 != null) {
            yoVar2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return rqe.a(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        cp cpVar = (cp) c();
        cpVar.k();
        return cpVar.f.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        cp cpVar = (cp) c();
        if (cpVar.n != null) {
            cpVar.p().getClass();
            cpVar.q(0);
        }
    }

    @Override // rq2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        cp cpVar = (cp) c();
        LayoutInflater from = LayoutInflater.from(cpVar.e);
        if (from.getFactory() == null) {
            from.setFactory2(cpVar);
        } else if (!(from.getFactory2() instanceof cp)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override // rq2, android.app.Dialog
    public final void onStop() {
        bjc bjcVar;
        super.onStop();
        p1d p = ((cp) c()).p();
        if (p == null || (bjcVar = p.s) == null) {
            return;
        }
        bjcVar.a();
    }

    @Override // rq2, android.app.Dialog
    public final void setContentView(int i) {
        cp cpVar = (cp) c();
        cpVar.k();
        ViewGroup viewGroup = (ViewGroup) cpVar.K.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(cpVar.e).inflate(i, viewGroup);
        cpVar.h.a(cpVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        qo c = c();
        String string = getContext().getString(i);
        cp cpVar = (cp) c;
        cpVar.r = string;
        ActionBarOverlayLayout actionBarOverlayLayout = cpVar.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(string);
            return;
        }
        p1d p1dVar = cpVar.n;
        if (p1dVar == null) {
            TextView textView = cpVar.L;
            if (textView != null) {
                textView.setText(string);
                return;
            }
            return;
        }
        jxb jxbVar = (jxb) p1dVar.e;
        if (jxbVar.g) {
            return;
        }
        Toolbar toolbar = jxbVar.a;
        jxbVar.h = string;
        if ((jxbVar.b & 8) != 0) {
            toolbar.setTitle(string);
            if (jxbVar.g) {
                ihc.m(toolbar.getRootView(), string);
            }
        }
    }

    @Override // rq2, android.app.Dialog
    public final void setContentView(View view) {
        cp cpVar = (cp) c();
        cpVar.k();
        ViewGroup viewGroup = (ViewGroup) cpVar.K.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        cpVar.h.a(cpVar.f.getCallback());
    }

    @Override // rq2, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        cp cpVar = (cp) c();
        cpVar.k();
        ViewGroup viewGroup = (ViewGroup) cpVar.K.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        cpVar.h.a(cpVar.f.getCallback());
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        cp cpVar = (cp) c();
        cpVar.r = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = cpVar.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        p1d p1dVar = cpVar.n;
        if (p1dVar != null) {
            jxb jxbVar = (jxb) p1dVar.e;
            if (jxbVar.g) {
                return;
            }
            Toolbar toolbar = jxbVar.a;
            jxbVar.h = charSequence;
            if ((jxbVar.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (jxbVar.g) {
                    ihc.m(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = cpVar.L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
