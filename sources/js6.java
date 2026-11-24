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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class js6 extends dp {
    public TextView E;
    public LinearLayout F;
    public Button G;
    public ProgressBar H;
    public ListView I;
    public hs6 J;
    public final zj K;
    public boolean L;
    public long M;
    public final c1 N;
    public final gu6 f;
    public final gs6 h;
    public yt6 n;
    public ArrayList r;
    public TextView s;
    public TextView w;
    public RelativeLayout x;
    public TextView y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public js6(Context context) {
        super(r3, r1 == 0 ? voe.e(r3) : r1);
        byte b = 0;
        ContextThemeWrapper a = voe.a(context, false);
        int g = voe.g(a, R.attr.mediaRouteTheme);
        this.n = yt6.c;
        this.N = new c1((Object) this, (byte) 7);
        this.f = gu6.d(getContext());
        this.h = new gs6(this, b);
        this.K = new zj(this, (byte) 8);
    }

    @Override // dp, android.app.Dialog, android.content.DialogInterface
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
            gu6.b();
            ArrayList arrayList = new ArrayList(gu6.c().j);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                eu6 eu6Var = (eu6) arrayList.get(i);
                if (eu6Var.d() || !eu6Var.g || !eu6Var.h(this.n)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, is6.b);
            if (SystemClock.uptimeMillis() - this.M >= 300) {
                e(arrayList);
                return;
            }
            c1 c1Var = this.N;
            c1Var.removeMessages(1);
            c1Var.sendMessageAtTime(c1Var.obtainMessage(1, arrayList), this.M + 300);
        }
    }

    public final void h(yt6 yt6Var) {
        if (yt6Var == null) {
            w26.j("selector must not be null");
            return;
        }
        if (this.n.equals(yt6Var)) {
            return;
        }
        this.n = yt6Var;
        if (this.L) {
            gu6 gu6Var = this.f;
            gs6 gs6Var = this.h;
            gu6Var.h(gs6Var);
            gu6Var.a(yt6Var, gs6Var, 1);
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

    @Override // dp, yp2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.r = new ArrayList();
        this.J = new hs6(getContext(), this.r);
        this.s = (TextView) findViewById(R.id.mr_chooser_title);
        this.w = (TextView) findViewById(R.id.mr_chooser_searching);
        this.x = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.y = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.E = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.F = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.G = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.H = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        Boolean bool = rde.a;
        boolean z2 = false;
        if (bool == null) {
            if (!rde.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                Boolean bool2 = rde.e;
                if (bool2 == null) {
                    bool2 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                    rde.e = bool2;
                }
                if (!bool2.booleanValue() && !rde.a(context) && !rde.d(context)) {
                    z = true;
                    bool = Boolean.valueOf(z);
                    rde.a = bool;
                }
            }
            z = false;
            bool = Boolean.valueOf(z);
            rde.a = bool;
        }
        if (!bool.booleanValue()) {
            Boolean bool3 = rde.c;
            if (bool3 == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                bool3 = Boolean.valueOf(z2);
                rde.c = bool3;
            }
            if (!bool3.booleanValue()) {
                if (rde.c(context) || rde.b(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (rde.d(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    Boolean bool4 = rde.e;
                    if (bool4 == null) {
                        bool4 = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                        rde.e = bool4;
                    }
                    string = bool4.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : rde.a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.y.setText(string);
                this.E.setMovementMethod(LinkMovementMethod.getInstance());
                this.G.setOnClickListener(new b95(this, (byte) 25));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.I = listView;
                listView.setAdapter((ListAdapter) this.J);
                this.I.setOnItemClickListener(this.J);
                this.I.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(roe.a(getContext()), -2);
                getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.y.setText(string);
        this.E.setMovementMethod(LinkMovementMethod.getInstance());
        this.G.setOnClickListener(new b95(this, (byte) 25));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.I = listView2;
        listView2.setAdapter((ListAdapter) this.J);
        this.I.setOnItemClickListener(this.J);
        this.I.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(roe.a(getContext()), -2);
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

    @Override // dp, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    @Override // dp, android.app.Dialog
    public final void setTitle(int i) {
        this.s.setText(i);
    }
}
