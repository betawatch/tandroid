package androidx.mediarouter.app;

import a8.a7;
import a8.b7;
import a8.z6;
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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class g extends g.u {
    public TextView D;
    public LinearLayout E;
    public Button F;
    public ProgressBar G;
    public ListView H;
    public d I;
    public final f J;
    public boolean K;
    public long L;
    public final android.support.v4.media.session.q M;
    public final s4.x f;
    public final c h;
    public s4.r n;
    public ArrayList r;
    public TextView s;
    public TextView w;
    public RelativeLayout x;
    public TextView y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context) {
        super(r3, r1 == 0 ? b7.e(r3) : r1);
        int i7 = 0;
        ContextThemeWrapper a10 = b7.a(context, false);
        int g10 = b7.g(a10, R.attr.mediaRouteTheme);
        this.n = s4.r.c;
        this.M = new android.support.v4.media.session.q(this, 1);
        this.f = s4.x.d(getContext());
        this.h = new c(this, i7);
        this.J = new f(this, i7);
    }

    @Override // g.u, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.J);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.L = SystemClock.uptimeMillis();
        this.r.clear();
        this.r.addAll(list);
        this.I.notifyDataSetChanged();
        android.support.v4.media.session.q qVar = this.M;
        qVar.removeMessages(3);
        qVar.removeMessages(2);
        if (!list.isEmpty()) {
            i(1);
        } else {
            i(0);
            qVar.sendMessageDelayed(qVar.obtainMessage(2), 5000L);
        }
    }

    public final void f() {
        if (this.K) {
            this.f.getClass();
            s4.x.b();
            ArrayList arrayList = new ArrayList(s4.x.c().j);
            int size = arrayList.size();
            while (true) {
                int i7 = size - 1;
                if (size <= 0) {
                    break;
                }
                s4.v vVar = (s4.v) arrayList.get(i7);
                if (vVar.d() || !vVar.g || !vVar.h(this.n)) {
                    arrayList.remove(i7);
                }
                size = i7;
            }
            Collections.sort(arrayList, e.b);
            if (SystemClock.uptimeMillis() - this.L >= 300) {
                e(arrayList);
                return;
            }
            android.support.v4.media.session.q qVar = this.M;
            qVar.removeMessages(1);
            qVar.sendMessageAtTime(qVar.obtainMessage(1, arrayList), this.L + 300);
        }
    }

    public final void h(s4.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(rVar)) {
            return;
        }
        this.n = rVar;
        if (this.K) {
            s4.x xVar = this.f;
            c cVar = this.h;
            xVar.h(cVar);
            xVar.a(rVar, cVar, 1);
        }
        f();
    }

    public final void i(int i7) {
        if (i7 == 0) {
            setTitle(R.string.mr_chooser_title);
            this.H.setVisibility(8);
            this.w.setVisibility(0);
            this.G.setVisibility(0);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
            this.D.setVisibility(8);
            this.x.setVisibility(8);
            return;
        }
        if (i7 == 1) {
            setTitle(R.string.mr_chooser_title);
            this.H.setVisibility(0);
            this.w.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
            this.D.setVisibility(8);
            this.x.setVisibility(8);
            return;
        }
        if (i7 == 2) {
            setTitle(R.string.mr_chooser_title);
            this.H.setVisibility(8);
            this.w.setVisibility(8);
            this.G.setVisibility(0);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
            this.D.setVisibility(4);
            this.x.setVisibility(0);
            return;
        }
        if (i7 != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.H.setVisibility(8);
        this.w.setVisibility(8);
        this.G.setVisibility(8);
        this.E.setVisibility(0);
        this.F.setVisibility(0);
        this.D.setVisibility(0);
        this.x.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        this.f.a(this.n, this.h, 1);
        f();
        android.support.v4.media.session.q qVar = this.M;
        qVar.removeMessages(2);
        qVar.removeMessages(3);
        qVar.removeMessages(1);
        qVar.sendMessageDelayed(qVar.obtainMessage(2), 5000L);
    }

    @Override // g.u, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z9;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.r = new ArrayList();
        this.I = new d(getContext(), this.r);
        this.s = (TextView) findViewById(R.id.mr_chooser_title);
        this.w = (TextView) findViewById(R.id.mr_chooser_searching);
        this.x = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.y = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.D = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.E = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.F = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.G = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z10 = false;
        if (z6.a == null) {
            if (!z6.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (z6.e == null) {
                    z6.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!z6.e.booleanValue() && !z6.a(context) && !z6.d(context)) {
                    z9 = true;
                    z6.a = Boolean.valueOf(z9);
                }
            }
            z9 = false;
            z6.a = Boolean.valueOf(z9);
        }
        if (!z6.a.booleanValue()) {
            if (z6.c == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z10 = true;
                }
                z6.c = Boolean.valueOf(z10);
            }
            if (!z6.c.booleanValue()) {
                if (z6.c(context) || z6.b(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (z6.d(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (z6.e == null) {
                        z6.e = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                    }
                    string = z6.e.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : z6.a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.y.setText(string);
                this.D.setMovementMethod(LinkMovementMethod.getInstance());
                this.F.setOnClickListener(new ah.d(this, 2));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.H = listView;
                listView.setAdapter((ListAdapter) this.I);
                this.H.setOnItemClickListener(this.I);
                this.H.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(a7.a(getContext()), -2);
                getContext().registerReceiver(this.J, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.y.setText(string);
        this.D.setMovementMethod(LinkMovementMethod.getInstance());
        this.F.setOnClickListener(new ah.d(this, 2));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.H = listView2;
        listView2.setAdapter((ListAdapter) this.I);
        this.H.setOnItemClickListener(this.I);
        this.H.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(a7.a(getContext()), -2);
        getContext().registerReceiver(this.J, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.K = false;
        this.f.h(this.h);
        android.support.v4.media.session.q qVar = this.M;
        qVar.removeMessages(1);
        qVar.removeMessages(2);
        qVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // g.u, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    @Override // g.u, android.app.Dialog
    public final void setTitle(int i7) {
        this.s.setText(i7);
    }
}
