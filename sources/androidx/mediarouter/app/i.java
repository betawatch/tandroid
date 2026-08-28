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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends g.s {
    public LinearLayout A;
    public Button B;
    public ProgressBar C;
    public ListView D;
    public f E;
    public final h F;
    public boolean G;
    public long H;
    public final d I;
    public final c2.c0 f;
    public final e h;
    public c2.v n;
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
    public i(Context context) {
        super(r3, r1 == 0 ? f7.d0.e(r3) : r1);
        int i9 = 0;
        ContextThemeWrapper a2 = f7.d0.a(context, false);
        int g10 = f7.d0.g(a2, R.attr.mediaRouteTheme);
        this.n = c2.v.c;
        this.I = new d(this, i9);
        this.f = c2.c0.d(getContext());
        this.h = new e(this, i9);
        this.F = new h(this, i9);
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
        d dVar = this.I;
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
            c2.c0.b();
            ArrayList arrayList = new ArrayList(c2.c0.c().j);
            int size = arrayList.size();
            while (true) {
                int i9 = size - 1;
                if (size <= 0) {
                    break;
                }
                c2.a0 a0Var = (c2.a0) arrayList.get(i9);
                if (a0Var.d() || !a0Var.g || !a0Var.h(this.n)) {
                    arrayList.remove(i9);
                }
                size = i9;
            }
            Collections.sort(arrayList, g.b);
            if (SystemClock.uptimeMillis() - this.H >= 300) {
                e(arrayList);
                return;
            }
            d dVar = this.I;
            dVar.removeMessages(1);
            dVar.sendMessageAtTime(dVar.obtainMessage(1, arrayList), this.H + 300);
        }
    }

    public final void h(c2.v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(vVar)) {
            return;
        }
        this.n = vVar;
        if (this.G) {
            c2.c0 c0Var = this.f;
            e eVar = this.h;
            c0Var.h(eVar);
            c0Var.a(vVar, eVar, 1);
        }
        f();
    }

    public final void i(int i9) {
        if (i9 == 0) {
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
        if (i9 == 1) {
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
        if (i9 == 2) {
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
        if (i9 != 3) {
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
        d dVar = this.I;
        dVar.removeMessages(2);
        dVar.removeMessages(3);
        dVar.removeMessages(1);
        dVar.sendMessageDelayed(dVar.obtainMessage(2), 5000L);
    }

    @Override // g.s, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z10;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.r = new ArrayList();
        this.E = new f(getContext(), this.r);
        this.s = (TextView) findViewById(R.id.mr_chooser_title);
        this.v = (TextView) findViewById(R.id.mr_chooser_searching);
        this.w = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.x = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.y = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.A = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.B = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.C = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        int i9 = 0;
        if (f7.b0.a == null) {
            if (!f7.b0.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (f7.b0.e == null) {
                    f7.b0.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!f7.b0.e.booleanValue() && !f7.b0.a(context) && !f7.b0.d(context)) {
                    z10 = true;
                    f7.b0.a = Boolean.valueOf(z10);
                }
            }
            z10 = false;
            f7.b0.a = Boolean.valueOf(z10);
        }
        if (!f7.b0.a.booleanValue()) {
            if (f7.b0.c == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                f7.b0.c = Boolean.valueOf((Build.VERSION.SDK_INT < 30 || sensorManager == null || sensorManager.getDefaultSensor(36) == null) ? false : true);
            }
            if (!f7.b0.c.booleanValue()) {
                if (f7.b0.c(context) || f7.b0.b(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (f7.b0.d(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (f7.b0.e == null) {
                        f7.b0.e = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                    }
                    string = f7.b0.e.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : f7.b0.a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.x.setText(string);
                this.y.setMovementMethod(LinkMovementMethod.getInstance());
                this.B.setOnClickListener(new c(this, i9));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.D = listView;
                listView.setAdapter((ListAdapter) this.E);
                this.D.setOnItemClickListener(this.E);
                this.D.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(f7.c0.a(getContext()), -2);
                getContext().registerReceiver(this.F, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.x.setText(string);
        this.y.setMovementMethod(LinkMovementMethod.getInstance());
        this.B.setOnClickListener(new c(this, i9));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.D = listView2;
        listView2.setAdapter((ListAdapter) this.E);
        this.D.setOnItemClickListener(this.E);
        this.D.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(f7.c0.a(getContext()), -2);
        getContext().registerReceiver(this.F, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.G = false;
        this.f.h(this.h);
        d dVar = this.I;
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
    public final void setTitle(int i9) {
        this.s.setText(i9);
    }
}
