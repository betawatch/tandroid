package androidx.mediarouter.app;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import h7.e5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends g.s {
    public LinearLayout A;
    public Button B;
    public ProgressBar C;
    public ListView D;
    public d E;
    public final af.c F;
    public boolean G;
    public long H;
    public final a4.d I;
    public final c2.d0 f;
    public final c h;
    public c2.w n;
    public ArrayList r;
    public TextView s;
    public TextView v;
    public RelativeLayout w;
    public TextView x;
    public TextView y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Context context) {
        super(r3, r1 == 0 ? e5.e(r3) : r1);
        int i10 = 0;
        ContextThemeWrapper a2 = e5.a(context, false);
        int g10 = e5.g(a2, R.attr.mediaRouteTheme);
        this.n = c2.w.c;
        int i11 = 1;
        this.I = new a4.d(this, i11);
        this.f = c2.d0.d(getContext());
        this.h = new c(this, i10);
        this.F = new af.c(this, i11);
    }

    @Override // g.s, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.F);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.H = SystemClock.uptimeMillis();
        this.r.clear();
        this.r.addAll(list);
        this.E.notifyDataSetChanged();
        a4.d dVar = this.I;
        dVar.removeMessages(3);
        dVar.removeMessages(2);
        if (!list.isEmpty()) {
            i(1);
        } else {
            i(0);
            dVar.sendMessageDelayed(dVar.obtainMessage(2), 5000L);
        }
    }

    public final void f() {
        if (this.G) {
            this.f.getClass();
            c2.d0.b();
            ArrayList arrayList = new ArrayList(c2.d0.c().j);
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                c2.b0 b0Var = (c2.b0) arrayList.get(i10);
                if (b0Var.d() || !b0Var.g || !b0Var.h(this.n)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, e.b);
            if (SystemClock.uptimeMillis() - this.H >= 300) {
                e(arrayList);
                return;
            }
            a4.d dVar = this.I;
            dVar.removeMessages(1);
            dVar.sendMessageAtTime(dVar.obtainMessage(1, arrayList), this.H + 300);
        }
    }

    public final void h(c2.w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(wVar)) {
            return;
        }
        this.n = wVar;
        if (this.G) {
            c2.d0 d0Var = this.f;
            c cVar = this.h;
            d0Var.h(cVar);
            d0Var.a(wVar, cVar, 1);
        }
        f();
    }

    public final void i(int i10) {
        if (i10 == 0) {
            setTitle(R.string.mr_chooser_title);
            this.D.setVisibility(8);
            this.v.setVisibility(0);
            this.C.setVisibility(0);
            this.A.setVisibility(8);
            this.B.setVisibility(8);
            this.y.setVisibility(8);
            this.w.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            setTitle(R.string.mr_chooser_title);
            this.D.setVisibility(0);
            this.v.setVisibility(8);
            this.C.setVisibility(8);
            this.A.setVisibility(8);
            this.B.setVisibility(8);
            this.y.setVisibility(8);
            this.w.setVisibility(8);
            return;
        }
        if (i10 == 2) {
            setTitle(R.string.mr_chooser_title);
            this.D.setVisibility(8);
            this.v.setVisibility(8);
            this.C.setVisibility(0);
            this.A.setVisibility(8);
            this.B.setVisibility(8);
            this.y.setVisibility(4);
            this.w.setVisibility(0);
            return;
        }
        if (i10 != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.D.setVisibility(8);
        this.v.setVisibility(8);
        this.C.setVisibility(8);
        this.A.setVisibility(0);
        this.B.setVisibility(0);
        this.y.setVisibility(0);
        this.w.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        this.f.a(this.n, this.h, 1);
        f();
        a4.d dVar = this.I;
        dVar.removeMessages(2);
        dVar.removeMessages(3);
        dVar.removeMessages(1);
        dVar.sendMessageDelayed(dVar.obtainMessage(2), 5000L);
    }

    @Override // g.s, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z10;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.r = new ArrayList();
        this.E = new d(getContext(), this.r);
        this.s = (TextView) findViewById(R.id.mr_chooser_title);
        this.v = (TextView) findViewById(R.id.mr_chooser_searching);
        this.w = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.x = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.y = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.A = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.B = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.C = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z11 = false;
        int i10 = 1;
        if (h7.j0.a == null) {
            if (!h7.j0.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (h7.j0.e == null) {
                    h7.j0.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!h7.j0.e.booleanValue() && !h7.j0.a(context) && !h7.j0.d(context)) {
                    z10 = true;
                    h7.j0.a = Boolean.valueOf(z10);
                }
            }
            z10 = false;
            h7.j0.a = Boolean.valueOf(z10);
        }
        if (!h7.j0.a.booleanValue()) {
            if (h7.j0.c == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z11 = true;
                }
                h7.j0.c = Boolean.valueOf(z11);
            }
            if (!h7.j0.c.booleanValue()) {
                if (h7.j0.c(context) || h7.j0.b(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (h7.j0.d(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (h7.j0.e == null) {
                        h7.j0.e = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                    }
                    string = h7.j0.e.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : h7.j0.a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.x.setText(string);
                this.y.setMovementMethod(LinkMovementMethod.getInstance());
                this.B.setOnClickListener(new ag.o(this, i10));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.D = listView;
                listView.setAdapter((ListAdapter) this.E);
                this.D.setOnItemClickListener(this.E);
                this.D.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(h7.k0.a(getContext()), -2);
                getContext().registerReceiver(this.F, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.x.setText(string);
        this.y.setMovementMethod(LinkMovementMethod.getInstance());
        this.B.setOnClickListener(new ag.o(this, i10));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.D = listView2;
        listView2.setAdapter((ListAdapter) this.E);
        this.D.setOnItemClickListener(this.E);
        this.D.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(h7.k0.a(getContext()), -2);
        getContext().registerReceiver(this.F, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.G = false;
        this.f.h(this.h);
        a4.d dVar = this.I;
        dVar.removeMessages(1);
        dVar.removeMessages(2);
        dVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // g.s, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    @Override // g.s, android.app.Dialog
    public final void setTitle(int i10) {
        this.s.setText(i10);
    }
}
