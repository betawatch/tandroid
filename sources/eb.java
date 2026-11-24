// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eb extends FrameLayout {
    public final cb E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public iu M;
    public xt N;
    public xt O;
    public AsyncTask P;
    public final rk5 a;
    public boolean b;
    public final fg0 c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public final fg0 h;
    public final ImageView n;
    public final TextView r;
    public final TextView s;
    public final o72 w;
    public final va x;
    public final ArrayList y;

    public eb(Activity activity) {
        super(activity);
        int i = z8c.t0;
        this.y = new ArrayList();
        this.K = 0.0f;
        setWillNotDraw(false);
        int i2 = z8c.t0;
        f fVar = new f(this, (byte) 5);
        ta taVar = new ta(this);
        rk5 rk5Var = new rk5((ylb) null);
        this.a = rk5Var;
        va vaVar = new va(this, activity, i2, fVar, taVar, rk5Var);
        this.x = vaVar;
        vaVar.g3.r = false;
        vaVar.setOverScrollMode(2);
        vaVar.setPadding(0, 0, 0, 0);
        addView(vaVar, qoe.e(-1, -1, nm7.D1));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        fg0 Z = cmb.Z(this.H, this.J, 15, 15);
        this.c = Z;
        frameLayout2.setBackground(Z);
        rve.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, qoe.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f = imageView;
        frameLayout2.addView(imageView, qoe.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.n = imageView2;
        rve.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        fg0 Z2 = cmb.Z(0, 0, 6, 6);
        this.h = Z2;
        imageView2.setBackground(Z2);
        frameLayout2.addView(imageView2, qoe.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, qoe.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(gm.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, qoe.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, qoe.t(-1, -2, 55, 0, 0, 0, 0));
        this.E = new cb(null, i, new b1(this, (byte) 6));
        this.w = new o72(activity, (byte) 1);
        int i3 = cmb.Fl;
        c(cmb.w0(null, i3, false), gm.B(cmb.w0(null, i3, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(k47 k47Var) {
        TLRPC.Message message = k47Var.k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = k47Var.v;
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k47Var.v);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                return url;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[Catch: Exception -> 0x00e3, TryCatch #2 {Exception -> 0x00e3, blocks: (B:6:0x0063, B:8:0x0069, B:10:0x0079, B:13:0x007c, B:15:0x0082, B:16:0x009f, B:17:0x00a7, B:19:0x00b3, B:21:0x00d3, B:25:0x0097), top: B:5:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3 A[Catch: Exception -> 0x00e3, LOOP:1: B:17:0x00a7->B:19:0x00b3, LOOP_END, TryCatch #2 {Exception -> 0x00e3, blocks: (B:6:0x0063, B:8:0x0069, B:10:0x0079, B:13:0x007c, B:15:0x0082, B:16:0x009f, B:17:0x00a7, B:19:0x00b3, B:21:0x00d3, B:25:0x0097), top: B:5:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[Catch: Exception -> 0x00e3, TryCatch #2 {Exception -> 0x00e3, blocks: (B:6:0x0063, B:8:0x0069, B:10:0x0079, B:13:0x007c, B:15:0x0082, B:16:0x009f, B:17:0x00a7, B:19:0x00b3, B:21:0x00d3, B:25:0x0097), top: B:5:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[EDGE_INSN: B:26:0x007c->B:13:0x007c BREAK  A[LOOP:0: B:5:0x0063->B:10:0x0079], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069 A[Catch: Exception -> 0x00e3, TryCatch #2 {Exception -> 0x00e3, blocks: (B:6:0x0063, B:8:0x0069, B:10:0x0079, B:13:0x007c, B:15:0x0082, B:16:0x009f, B:17:0x00a7, B:19:0x00b3, B:21:0x00d3, B:25:0x0097), top: B:5:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, String str) {
        SharedPreferences sharedPreferences;
        int i;
        int i2;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("webhistory", 0);
        db dbVar = null;
        String string = sharedPreferences2.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int i3 = 0;
                while (i3 < jSONArray.length()) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i3);
                    sharedPreferences = sharedPreferences2;
                    try {
                        db dbVar2 = new db(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                        dbVar2.c = jSONObject.optDouble("rank", 0.0d);
                        arrayList.add(dbVar2);
                        i3++;
                        sharedPreferences2 = sharedPreferences;
                    } catch (Exception e) {
                        e = e;
                        fc4.g(e, true);
                        i = 0;
                        while (true) {
                            try {
                                if (i < arrayList.size()) {
                                }
                                i++;
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                                return;
                            }
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (dbVar == null) {
                        }
                        dbVar.b = currentTimeMillis;
                        JSONArray jSONArray2 = new JSONArray();
                        while (i2 < Math.min(arrayList.size(), 20)) {
                        }
                        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
                    }
                }
                sharedPreferences = sharedPreferences2;
                Collections.sort(arrayList, new sa((byte) 1));
            } catch (Exception e3) {
                e = e3;
                sharedPreferences = sharedPreferences2;
            }
        } else {
            sharedPreferences = sharedPreferences2;
        }
        i = 0;
        while (true) {
            if (i < arrayList.size()) {
                break;
            }
            db dbVar3 = (db) arrayList.get(i);
            if (TextUtils.equals(dbVar3.a, str)) {
                dbVar = dbVar3;
                break;
            }
            i++;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (dbVar == null) {
            dbVar.c += Math.exp((currentTimeMillis2 - dbVar.b) / 2419200.0d);
        } else {
            dbVar = new db(str, currentTimeMillis2);
            arrayList.add(dbVar);
        }
        dbVar.b = currentTimeMillis2;
        JSONArray jSONArray22 = new JSONArray();
        for (i2 = 0; i2 < Math.min(arrayList.size(), 20); i2++) {
            db dbVar4 = (db) arrayList.get(i2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", dbVar4.a);
            jSONObject2.put("rank", dbVar4.c);
            jSONObject2.put("usage", dbVar4.b);
            jSONArray22.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray22.toString()).apply();
    }

    public final void c(int i, int i2) {
        if (this.F != i) {
            this.F = i;
            invalidate();
        }
        this.I = i2;
        float f = gm.B(i) >= 0.721f ? 0.0f : 1.0f;
        this.H = on2.f(gm.R1(0.05f, 0.12f, f), i, i2);
        this.G = i;
        this.J = on2.f(gm.R1(0.12f, 0.22f, f), i, i2);
        int i3 = this.H;
        fg0 fg0Var = this.c;
        cmb.F1(fg0Var, i3, false);
        cmb.F1(fg0Var, this.J, true);
        this.e.invalidate();
        this.r.setTextColor(i2);
        this.s.setTextColor(cmb.p1(0.6f, i2));
        ImageView imageView = this.f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        this.n.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        cmb.F1(this.h, cmb.p1(1.5f, this.J), true);
        int v = cmb.v(i, cmb.p1(0.05f, i2));
        int v2 = cmb.v(i, cmb.p1(0.55f, i2));
        rk5 rk5Var = this.a;
        SparseIntArray sparseIntArray = (SparseIntArray) rk5Var.b;
        SparseIntArray sparseIntArray2 = (SparseIntArray) rk5Var.b;
        sparseIntArray.put(cmb.c6, this.G);
        sparseIntArray2.put(cmb.F6, i2);
        sparseIntArray2.put(cmb.d7, v);
        sparseIntArray2.put(cmb.e7, v2);
        sparseIntArray2.put(cmb.F8, cmb.p1(0.2f, i2));
        sparseIntArray2.put(cmb.h6, cmb.p1(gm.R1(0.05f, 0.12f, f), i2));
        this.x.h1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.K);
        canvas.drawColor(this.G);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.K < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cb cbVar = this.E;
        if (cbVar == null || !this.L) {
            return;
        }
        cbVar.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cb cbVar = this.E;
        if (cbVar != null) {
            cbVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.P;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.P = null;
        }
        ArrayList arrayList = this.y;
        boolean z = !arrayList.isEmpty();
        byte b = 0;
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            va vaVar = this.x;
            vaVar.g3.O(true);
            if (z != (!arrayList.isEmpty())) {
                vaVar.f3.g1(0, 0);
                return;
            }
            return;
        }
        li5 li5Var = new li5(new ra(b, this, z));
        String str3 = ku9.a().c;
        if (str3 != null) {
            str2 = str3 + URLEncoder.encode(str);
        }
        this.P = li5Var.execute(str2);
    }

    public void setOpenProgress(float f) {
        if (Math.abs(this.K - f) > 1.0E-4f) {
            this.K = f;
            int i = f <= 1.0E-4f ? 4 : 0;
            if (getImportantForAccessibility() != i) {
                setImportantForAccessibility(i);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z) {
        cb cbVar = this.E;
        boolean z2 = z && cbVar != null;
        this.L = z2;
        if (z2) {
            cbVar.a();
        }
    }
}
