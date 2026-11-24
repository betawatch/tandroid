// default package

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ku6 extends dq {
    public TextView E;
    public LinearLayout F;
    public Button G;
    public ProgressBar H;
    public ListView I;
    public iu6 J;
    public final zk K;
    public boolean L;
    public long M;
    public final c1 N;
    public final gw6 f;
    public final hu6 h;
    public yv6 n;
    public ArrayList r;
    public TextView s;
    public TextView w;
    public RelativeLayout x;
    public TextView y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ku6(Context context) {
        super(r3, r1 == 0 ? yqe.e(r3) : r1);
        byte b = 0;
        ContextThemeWrapper a = yqe.a(context, false);
        int g = yqe.g(a, R.attr.mediaRouteTheme);
        this.n = yv6.c;
        this.N = new c1((Object) this, (byte) 7);
        this.f = gw6.d(getContext());
        this.h = new hu6(this, b);
        this.K = new zk(this, (byte) 8);
    }

    @Override // dq, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.K);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.M = SystemClock.uptimeMillis();
        this.r.clear();
        this.r.addAll(list);
        this.J.notifyDataSetChanged();
        c1 c1Var = this.N;
        c1Var.removeMessages(3);
        c1Var.removeMessages(2);
        if (!list.isEmpty()) {
            i(1);
        } else {
            i(0);
            c1Var.sendMessageDelayed(c1Var.obtainMessage(2), 5000L);
        }
    }

    public final void f() {
        if (this.L) {
            this.f.getClass();
            gw6.b();
            ArrayList arrayList = new ArrayList(gw6.c().j);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                ew6 ew6Var = (ew6) arrayList.get(i);
                if (ew6Var.d() || !ew6Var.g || !ew6Var.h(this.n)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, ju6.b);
            if (SystemClock.uptimeMillis() - this.M >= 300) {
                e(arrayList);
                return;
            }
            c1 c1Var = this.N;
            c1Var.removeMessages(1);
            c1Var.sendMessageAtTime(c1Var.obtainMessage(1, arrayList), this.M + 300);
        }
    }

    public final void h(yv6 yv6Var) {
        if (yv6Var == null) {
            u36.j("selector must not be null");
            return;
        }
        if (this.n.equals(yv6Var)) {
            return;
        }
        this.n = yv6Var;
        if (this.L) {
            gw6 gw6Var = this.f;
            hu6 hu6Var = this.h;
            gw6Var.h(hu6Var);
            gw6Var.a(yv6Var, hu6Var, 1);
        }
        f();
    }

    public final void i(int i) {
        if (i == 0) {
            setTitle(R.string.mr_chooser_title);
            this.I.setVisibility(8);
            this.w.setVisibility(0);
            this.H.setVisibility(0);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(8);
            this.x.setVisibility(8);
            return;
        }
        if (i == 1) {
            setTitle(R.string.mr_chooser_title);
            this.I.setVisibility(0);
            this.w.setVisibility(8);
            this.H.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(8);
            this.x.setVisibility(8);
            return;
        }
        if (i == 2) {
            setTitle(R.string.mr_chooser_title);
            this.I.setVisibility(8);
            this.w.setVisibility(8);
            this.H.setVisibility(0);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(4);
            this.x.setVisibility(0);
            return;
        }
        if (i != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.I.setVisibility(8);
        this.w.setVisibility(8);
        this.H.setVisibility(8);
        this.F.setVisibility(0);
        this.G.setVisibility(0);
        this.E.setVisibility(0);
        this.x.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        this.f.a(this.n, this.h, 1);
        f();
        c1 c1Var = this.N;
        c1Var.removeMessages(2);
        c1Var.removeMessages(3);
        c1Var.removeMessages(1);
        c1Var.sendMessageDelayed(c1Var.obtainMessage(2), 5000L);
    }

    @Override // dq, jr2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.r = new ArrayList();
        this.J = new iu6(getContext(), this.r);
        this.s = (TextView) findViewById(R.id.mr_chooser_title);
        this.w = (TextView) findViewById(R.id.mr_chooser_searching);
        this.x = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.y = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.E = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.F = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.G = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.H = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        Boolean bool = sfe.a;
        boolean z2 = false;
        if (bool == null) {
            if (!sfe.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                Boolean bool2 = sfe.e;
                if (bool2 == null) {
                    bool2 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                    sfe.e = bool2;
                }
                if (!bool2.booleanValue() && !sfe.a(context) && !sfe.d(context)) {
                    z = true;
                    bool = Boolean.valueOf(z);
                    sfe.a = bool;
                }
            }
            z = false;
            bool = Boolean.valueOf(z);
            sfe.a = bool;
        }
        if (!bool.booleanValue()) {
            Boolean bool3 = sfe.c;
            if (bool3 == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                bool3 = Boolean.valueOf(z2);
                sfe.c = bool3;
            }
            if (!bool3.booleanValue()) {
                if (sfe.c(context) || sfe.b(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (sfe.d(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    Boolean bool4 = sfe.e;
                    if (bool4 == null) {
                        bool4 = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                        sfe.e = bool4;
                    }
                    string = bool4.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : sfe.a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.y.setText(string);
                this.E.setMovementMethod(LinkMovementMethod.getInstance());
                this.G.setOnClickListener(new ca5(this, (byte) 28));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.I = listView;
                listView.setAdapter((ListAdapter) this.J);
                this.I.setOnItemClickListener(this.J);
                this.I.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(uqe.a(getContext()), -2);
                getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.y.setText(string);
        this.E.setMovementMethod(LinkMovementMethod.getInstance());
        this.G.setOnClickListener(new ca5(this, (byte) 28));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.I = listView2;
        listView2.setAdapter((ListAdapter) this.J);
        this.I.setOnItemClickListener(this.J);
        this.I.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(uqe.a(getContext()), -2);
        getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.L = false;
        this.f.h(this.h);
        c1 c1Var = this.N;
        c1Var.removeMessages(1);
        c1Var.removeMessages(2);
        c1Var.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // dq, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    @Override // dq, android.app.Dialog
    public final void setTitle(int i) {
        this.s.setText(i);
    }
}
