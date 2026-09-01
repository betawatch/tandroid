package eg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ht0;
import org.telegram.ui.oq0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class c1 extends sv0 implements l2, h, g2, pv0, NotificationCenter.NotificationCenterDelegate {
    public final Bitmap A0;
    public float A1;
    public final Bitmap B0;
    public boolean B1;
    public final dg.h2 C0;
    public o1.j C1;
    public final DispatchQueue D0;
    public final x0 D1;
    public final MediaController.CropState E0;
    public final Paint E1;
    public float F0;
    public final Paint F1;
    public float G0;
    public final Paint G1;
    public float H0;
    public final dg.e2 H1;
    public float I0;
    public boolean I1;
    public float J0;
    public o1.j J1;
    public float K0;
    public float K1;
    public float L0;
    public final Paint L1;
    public boolean M0;
    public final int M1;
    public float N0;
    public final f0 N1;
    public kv0 O0;
    public org.telegram.ui.ActionBar.p1 O1;
    public j P0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P1;
    public boolean Q0;
    public Rect Q1;
    public int R0;
    public Runnable R1;
    public final boolean S0;
    public final dg.e1 S1;
    public final q0 T0;
    public boolean T1;
    public final s0 U0;
    public float U1;
    public final v0 V0;
    public boolean V1;
    public final u0 W0;
    public final z5 W1;
    public b11 X0;
    public final Paint X1;
    public final FrameLayout Y0;
    public final Paint Y1;
    public final y0 Z0;
    public qg.b Z1;
    public final w0 a1;
    public final float[] a2;
    public final FrameLayout b1;
    public final int[] b2;
    public i0 c1;
    public mz c2;
    public int d1;
    public boolean d2;
    public int e1;
    public boolean e2;
    public float f1;
    public boolean f2;
    public ValueAnimator g1;
    public int g2;
    public boolean h1;
    public int h2;
    public final r2 i1;
    public int i2;
    public final y5.h j1;
    public int j2;
    public ArrayList k1;
    public boolean k2;
    public final int l1;
    public BigInteger m1;
    public TextView n1;
    public TextView o1;
    public TextView p1;
    public final m2 q1;
    public final i2 r1;
    public final o2 s1;
    public final ImageView t1;
    public final LinearLayout u1;
    public final TextView v1;
    public final TextView w1;
    public final z1 x0;
    public final TextView x1;
    public final d2 y0;
    public final Paint y1;
    public float z0;
    public final Paint z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [eg.z3] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.view.View, eg.n0, eg.p3] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, eg.c1, eg.g2, eg.l2, org.telegram.ui.Components.pv0, org.telegram.ui.Components.qv0] */
    public c1(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, oq0 oq0Var, g6 g6Var) {
        super(context, activity);
        Emoji.EmojiSpan[] emojiSpanArr;
        t2 t2Var;
        ArrayList arrayList2 = arrayList;
        boolean z4 = false;
        this.d1 = 0;
        this.e1 = -1;
        final ht0 ht0Var = (ht0) this;
        this.j1 = new y5.h(ht0Var, 12);
        byte b10 = 1;
        this.y1 = new Paint(1);
        this.z1 = new Paint(1);
        this.E1 = new Paint(1);
        this.F1 = new Paint(1);
        this.G1 = new Paint(1);
        dg.e2 e2Var = new dg.e2(1.0f, 0.016773745f, -1);
        this.H1 = e2Var;
        this.L1 = new Paint(1);
        this.V1 = false;
        this.W1 = new z5((View) this, 350L, pr.h);
        this.X1 = new Paint(1);
        Paint paint = new Paint(1);
        this.Y1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.a2 = new float[2];
        this.b2 = new int[2];
        int i12 = 17;
        new androidx.activity.i(ht0Var, i12);
        setDelegate(this);
        this.M1 = i10;
        this.N1 = new f0(false ? 1 : 0, g6Var);
        this.E0 = cropState;
        this.S0 = context instanceof BubbleActivity;
        dg.e1 e6 = dg.e1.e(i10);
        this.S1 = e6;
        e6.i(0, true);
        e2Var.a = e6.c();
        e2Var.c = e6.i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.D0 = dispatchQueue;
        this.A0 = bitmap;
        this.B0 = bitmap2;
        this.l1 = i11;
        dg.h2 h2Var = new dg.h2();
        this.C0 = h2Var;
        h2Var.a = new a1.c(ht0Var, i12);
        q0 q0Var = new q0(ht0Var, context, new dg.c1(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.T0 = q0Var;
        q0Var.setDelegate(new r0(ht0Var, oq0Var));
        q0Var.setUndoStore(h2Var);
        q0Var.setQueue(dispatchQueue);
        q0Var.setVisibility(4);
        addView(q0Var, c6.e(-1, -1, 51));
        s0 s0Var = new s0(ht0Var, context);
        this.U0 = s0Var;
        s0Var.setVisibility(4);
        addView(s0Var, c6.e(-1, -1, 51));
        u0 u0Var = new u0(ht0Var, context, new t0(ht0Var));
        this.W0 = u0Var;
        addView(u0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList2.get(i13);
                byte b11 = mediaEntity.type;
                if (b11 == 0) {
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z4);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z4);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    t2Var = i02;
                } else if (b11 == b10) {
                    ?? j02 = j0(z4);
                    j02.setType(mediaEntity.subType);
                    j02.setTypeface(mediaEntity.textTypeface);
                    j02.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                    int size2 = arrayList3.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList3.get(i14);
                        u5 u5Var = new u5(emojiEntity.document_id, j02.getFontMetricsInt());
                        int i15 = emojiEntity.offset;
                        spannableString.setSpan(u5Var, i15, emojiEntity.length + i15, 33);
                        size2 = size2;
                    }
                    CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                    if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    j02.setText(replaceEmoji);
                    u0(j02, mediaEntity.textAlign);
                    dg.e2 swatch = j02.getSwatch();
                    swatch.a = mediaEntity.color;
                    j02.setSwatch(swatch);
                    t2Var = j02;
                } else if (b11 == 2) {
                    t2 h02 = h0(mediaEntity.text, false);
                    h02.y0 = false;
                    if ((mediaEntity.subType & 2) != 0) {
                        h02.r(false);
                    }
                    if ((mediaEntity.subType & 16) != 0) {
                        h02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                    layoutParams2.width = mediaEntity.viewWidth;
                    layoutParams2.height = mediaEntity.viewHeight;
                    t2Var = h02;
                } else {
                    i13++;
                    arrayList2 = arrayList;
                    z4 = false;
                    b10 = 1;
                }
                t2Var.setX((mediaEntity.x * this.O0.a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                t2Var.setY((mediaEntity.y * this.O0.b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                t2Var.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + t2Var.getX(), (mediaEntity.viewHeight / 2.0f) + t2Var.getY()));
                t2Var.setScale(mediaEntity.scale);
                t2Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i13++;
                arrayList2 = arrayList;
                z4 = false;
                b10 = 1;
            }
        }
        this.W0.setVisibility(4);
        v0 v0Var = new v0(context);
        this.V0 = v0Var;
        addView(v0Var);
        ?? frameLayout = new FrameLayout(context);
        this.Y0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, c6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.t1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(k6.f0(1090519039, 1, -1));
        final int i16 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: eg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        ht0 ht0Var2 = ht0Var;
                        q0 q0Var2 = ht0Var2.T0;
                        if (q0Var2 != null && (q0Var2.getCurrentBrush() instanceof dg.l)) {
                            q0Var2.b();
                            ht0Var2.q1.setSelectedIndex(1);
                            ht0Var2.g((dg.m) dg.m.a.get(0));
                            break;
                        } else {
                            ht0Var2.C0.c();
                            break;
                        }
                        break;
                    case 1:
                        ht0 ht0Var3 = ht0Var;
                        q0 q0Var3 = ht0Var3.T0;
                        dg.h2 h2Var2 = ht0Var3.C0;
                        if (h2Var2.a()) {
                            if (q0Var3 != null && (q0Var3.getCurrentBrush() instanceof dg.l)) {
                                q0Var3.b();
                                ht0Var3.q1.setSelectedIndex(1);
                                ht0Var3.g((dg.m) dg.m.a.get(0));
                            }
                            q0Var3.a();
                            h2Var2.c.clear();
                            h2Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            ht0Var3.W0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ht0 ht0Var4 = ht0Var;
                        j jVar = ht0Var4.P0;
                        if (jVar instanceof z3) {
                            AndroidUtilities.hideKeyboard(((z3) jVar).getFocusedView());
                        }
                        if (ht0Var4.d2) {
                            ht0Var4.l0(false);
                        }
                        ht0Var4.q0(ht0Var4.P0);
                        ht0Var4.r0(null, true);
                        break;
                    default:
                        ht0Var.r0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, c6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.u1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(k6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, c6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, c6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new m(0));
        frameLayout.addView(linearLayout, c6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.v1 = textView2;
        textView2.setBackground(k6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i17 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: eg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        ht0 ht0Var2 = ht0Var;
                        q0 q0Var2 = ht0Var2.T0;
                        if (q0Var2 != null && (q0Var2.getCurrentBrush() instanceof dg.l)) {
                            q0Var2.b();
                            ht0Var2.q1.setSelectedIndex(1);
                            ht0Var2.g((dg.m) dg.m.a.get(0));
                            break;
                        } else {
                            ht0Var2.C0.c();
                            break;
                        }
                        break;
                    case 1:
                        ht0 ht0Var3 = ht0Var;
                        q0 q0Var3 = ht0Var3.T0;
                        dg.h2 h2Var2 = ht0Var3.C0;
                        if (h2Var2.a()) {
                            if (q0Var3 != null && (q0Var3.getCurrentBrush() instanceof dg.l)) {
                                q0Var3.b();
                                ht0Var3.q1.setSelectedIndex(1);
                                ht0Var3.g((dg.m) dg.m.a.get(0));
                            }
                            q0Var3.a();
                            h2Var2.c.clear();
                            h2Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            ht0Var3.W0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ht0 ht0Var4 = ht0Var;
                        j jVar = ht0Var4.P0;
                        if (jVar instanceof z3) {
                            AndroidUtilities.hideKeyboard(((z3) jVar).getFocusedView());
                        }
                        if (ht0Var4.d2) {
                            ht0Var4.l0(false);
                        }
                        ht0Var4.q0(ht0Var4.P0);
                        ht0Var4.r0(null, true);
                        break;
                    default:
                        ht0Var.r0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView h = yh.h(frameLayout, textView2, c6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.w1 = h;
        h.setBackground(k6.f0(822083583, 7, -1));
        h.setPadding(org.telegram.ui.b.e(8.0f, R.string.Clear, h), 0, AndroidUtilities.dp(8.0f), 0);
        h.setGravity(16);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 16.0f);
        final int i18 = 2;
        h.setOnClickListener(new View.OnClickListener() { // from class: eg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        ht0 ht0Var2 = ht0Var;
                        q0 q0Var2 = ht0Var2.T0;
                        if (q0Var2 != null && (q0Var2.getCurrentBrush() instanceof dg.l)) {
                            q0Var2.b();
                            ht0Var2.q1.setSelectedIndex(1);
                            ht0Var2.g((dg.m) dg.m.a.get(0));
                            break;
                        } else {
                            ht0Var2.C0.c();
                            break;
                        }
                        break;
                    case 1:
                        ht0 ht0Var3 = ht0Var;
                        q0 q0Var3 = ht0Var3.T0;
                        dg.h2 h2Var2 = ht0Var3.C0;
                        if (h2Var2.a()) {
                            if (q0Var3 != null && (q0Var3.getCurrentBrush() instanceof dg.l)) {
                                q0Var3.b();
                                ht0Var3.q1.setSelectedIndex(1);
                                ht0Var3.g((dg.m) dg.m.a.get(0));
                            }
                            q0Var3.a();
                            h2Var2.c.clear();
                            h2Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            ht0Var3.W0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ht0 ht0Var4 = ht0Var;
                        j jVar = ht0Var4.P0;
                        if (jVar instanceof z3) {
                            AndroidUtilities.hideKeyboard(((z3) jVar).getFocusedView());
                        }
                        if (ht0Var4.d2) {
                            ht0Var4.l0(false);
                        }
                        ht0Var4.q0(ht0Var4.P0);
                        ht0Var4.r0(null, true);
                        break;
                    default:
                        ht0Var.r0(null, true);
                        break;
                }
            }
        });
        h.setAlpha(0.0f);
        h.setVisibility(8);
        TextView h9 = yh.h(frameLayout, h, c6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.x1 = h9;
        h9.setBackground(k6.f0(822083583, 7, -1));
        h9.setPadding(org.telegram.ui.b.e(8.0f, R.string.Done, h9), 0, AndroidUtilities.dp(8.0f), 0);
        h9.setGravity(16);
        h9.setTextColor(-1);
        h9.setTypeface(AndroidUtilities.bold());
        h9.setTextSize(1, 16.0f);
        final int i19 = 3;
        h9.setOnClickListener(new View.OnClickListener() { // from class: eg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        ht0 ht0Var2 = ht0Var;
                        q0 q0Var2 = ht0Var2.T0;
                        if (q0Var2 != null && (q0Var2.getCurrentBrush() instanceof dg.l)) {
                            q0Var2.b();
                            ht0Var2.q1.setSelectedIndex(1);
                            ht0Var2.g((dg.m) dg.m.a.get(0));
                            break;
                        } else {
                            ht0Var2.C0.c();
                            break;
                        }
                        break;
                    case 1:
                        ht0 ht0Var3 = ht0Var;
                        q0 q0Var3 = ht0Var3.T0;
                        dg.h2 h2Var2 = ht0Var3.C0;
                        if (h2Var2.a()) {
                            if (q0Var3 != null && (q0Var3.getCurrentBrush() instanceof dg.l)) {
                                q0Var3.b();
                                ht0Var3.q1.setSelectedIndex(1);
                                ht0Var3.g((dg.m) dg.m.a.get(0));
                            }
                            q0Var3.a();
                            h2Var2.c.clear();
                            h2Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            ht0Var3.W0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ht0 ht0Var4 = ht0Var;
                        j jVar = ht0Var4.P0;
                        if (jVar instanceof z3) {
                            AndroidUtilities.hideKeyboard(((z3) jVar).getFocusedView());
                        }
                        if (ht0Var4.d2) {
                            ht0Var4.l0(false);
                        }
                        ht0Var4.q0(ht0Var4.P0);
                        ht0Var4.r0(null, true);
                        break;
                    default:
                        ht0Var.r0(null, true);
                        break;
                }
            }
        });
        h9.setAlpha(0.0f);
        h9.setVisibility(8);
        frameLayout.addView(h9, c6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        y0 y0Var = new y0(ht0Var, context);
        this.Z0 = y0Var;
        y0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        y0Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(y0Var, c6.e(-1, 104, 80));
        m2 m2Var = new m2(context, bitmap2 != null);
        this.q1 = m2Var;
        m2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        m2Var.setDelegate(this);
        m2Var.setSelectedIndex(1);
        y0Var.addView(m2Var, c6.c(48.0f, -1));
        i2 i2Var = new i2(context);
        this.r1 = i2Var;
        i2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        i2Var.setVisibility(8);
        i2Var.setDelegate(this);
        i2Var.setAlignment(dg.e1.e(i10).g);
        y0Var.addView(i2Var, c6.c(48.0f, -1));
        w0 w0Var = new w0(ht0Var, context);
        this.a1 = w0Var;
        addView(w0Var, c6.c(-1.0f, -1));
        o2 o2Var = new o2(context);
        this.s1 = o2Var;
        o2Var.setVisibility(8);
        o2Var.setOnItemClickListener(new ag.h(ht0Var, 1));
        i2Var.setTypefaceListView(o2Var);
        w0Var.addView(o2Var, c6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.y1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.y1.setColor(1728053247);
        this.y1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.z1.setColor(k6.v0(k6.G8, this.N1));
        x0 x0Var = new x0(ht0Var, context);
        this.D1 = x0Var;
        x0Var.setVisibility(8);
        x0Var.setColorPalette(dg.e1.e(i10));
        x0Var.setColorListener(new n(ht0Var, 0));
        y0Var.addView(x0Var, c6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        z1 z1Var = new z1(context);
        this.x0 = z1Var;
        z1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        z1Var.setBackground(k6.f0(1090519039, 1, -1));
        y0Var.addView(z1Var, c6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        d2 d2Var = new d2(context);
        this.y0 = d2Var;
        d2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        d2Var.setBackground(k6.f0(1090519039, 1, -1));
        d2Var.setOnClickListener(new o(ht0Var, context, bitmap2, 0));
        y0Var.addView(d2Var, c6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        r2 r2Var = new r2(context);
        this.i1 = r2Var;
        r2Var.setColorSwatch(this.H1);
        r2Var.setRenderView(this.T0);
        r2Var.setValueOverride(this.j1);
        this.H1.c = this.j1.get();
        r2Var.setOnUpdate(new af.b(ht0Var, i10, i19));
        addView(r2Var, c6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b1 = frameLayout2;
        addView(frameLayout2, c6.c(-1.0f, -1));
        this.G1.setStyle(style);
        this.G1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.H1, null);
        g((dg.m) dg.m.a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static /* synthetic */ void Z(ht0 ht0Var, Integer num) {
        ht0Var.setNewColor(num.intValue());
        ht0Var.w0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[Catch: all -> 0x002c, Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:4:0x0003, B:6:0x0022, B:8:0x0026, B:12:0x0036, B:14:0x005b, B:17:0x0062, B:18:0x0069, B:21:0x006e, B:22:0x0078, B:24:0x007e, B:26:0x0092, B:30:0x009c, B:34:0x00a8, B:36:0x00ab, B:41:0x00ae, B:46:0x00b5), top: B:3:0x0003, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(c1 c1Var) {
        dg.f1 f1Var;
        boolean z4;
        Bitmap bitmap = c1Var.B0;
        h8.c cVar = null;
        try {
            try {
                h8.b bVar = new h8.b(c1Var.getContext());
                bVar.c(1);
                bVar.b(1);
                bVar.c = false;
                cVar = bVar.a();
                if (!cVar.c.k()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    cVar.J();
                    return;
                }
                androidx.biometric.e eVar = new androidx.biometric.e(15);
                e8.a aVar = (e8.a) eVar.b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                eVar.d = bitmap;
                aVar.a = width;
                aVar.b = height;
                aVar.c = c1Var.getFrameRotation();
                if (((ByteBuffer) eVar.c) == null && ((Bitmap) eVar.d) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray L = cVar.L(eVar);
                    ArrayList arrayList = new ArrayList();
                    kv0 paintingSize = c1Var.getPaintingSize();
                    for (int i10 = 0; i10 < L.size(); i10++) {
                        h8.a aVar2 = (h8.a) L.get(L.keyAt(i10));
                        int i11 = c1Var.l1;
                        if (i11 % 360 != 90 && i11 % 360 != 270) {
                            z4 = false;
                            f1Var = new dg.f1(aVar2, bitmap, paintingSize, z4);
                            if (!(f1Var.d == null)) {
                                arrayList.add(f1Var);
                            }
                        }
                        z4 = true;
                        f1Var = new dg.f1(aVar2, bitmap, paintingSize, z4);
                        if (!(f1Var.d == null)) {
                        }
                    }
                    c1Var.k1 = arrayList;
                    cVar.J();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    cVar.J();
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                if (0 == 0) {
                }
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                cVar.J();
            }
            throw th3;
        }
    }

    public static void b0(c1 c1Var) {
        j jVar;
        u0 u0Var = c1Var.W0;
        j jVar2 = c1Var.P0;
        if (jVar2 != null) {
            PointF A0 = c1Var.A0(jVar2);
            j jVar3 = c1Var.P0;
            if (jVar3 instanceof p3) {
                p3 p3Var = new p3(c1Var.getContext(), (p3) c1Var.P0, A0);
                p3Var.setDelegate(c1Var);
                u0Var.addView(p3Var);
                jVar = p3Var;
            } else if (jVar3 instanceof z3) {
                z3 z3Var = new z3(c1Var.getContext(), (z3) c1Var.P0, A0);
                z3Var.setDelegate(c1Var);
                z3Var.setMaxWidth((int) (c1Var.getPaintingSize().a - 20.0f));
                u0Var.addView(z3Var, c6.c(-2.0f, -2));
                jVar = z3Var;
            } else {
                jVar = null;
            }
            c1Var.p0(jVar);
            c1Var.r0(jVar, true);
        }
        org.telegram.ui.ActionBar.p1 p1Var = c1Var.O1;
        if (p1Var == null || !p1Var.isShowing()) {
            return;
        }
        c1Var.O1.d(true);
    }

    public static void c0(ht0 ht0Var, Integer num) {
        dg.e1 e1Var = ht0Var.S1;
        e1Var.h(num.intValue(), true);
        e1Var.g();
        ht0Var.setNewColor(num.intValue());
        x0 x0Var = ht0Var.D1;
        x0Var.setSelectedColorIndex(e1Var.d());
        x0Var.getAdapter().l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.d1 == 2 ? this.r1 : this.q1;
    }

    private int getFrameRotation() {
        int i10 = this.l1;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private kv0 getPaintingSize() {
        kv0 kv0Var = this.O0;
        if (kv0Var != null) {
            return kv0Var;
        }
        Bitmap bitmap = this.A0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        int i10 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
        kv0 kv0Var2 = new kv0(width, height);
        float f10 = i10;
        kv0Var2.a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        kv0Var2.b = floor;
        if (floor > f10) {
            kv0Var2.b = f10;
            kv0Var2.a = (float) Math.floor((f10 * width) / height);
        }
        this.O0 = kv0Var2;
        return kv0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i10) {
        dg.e2 e2Var = this.H1;
        int i11 = e2Var.a;
        e2Var.a = i10;
        s0(e2Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new e0(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.R0 = i10;
        j jVar = this.P0;
        if (jVar instanceof z3) {
            ((z3) jVar).setType(i10);
        }
        dg.e1 e6 = dg.e1.e(this.M1);
        e6.h = i10;
        e6.a.edit().putInt("text_type", i10).apply();
        this.r1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        i0 i0Var = new i0(this, context);
        this.c1 = i0Var;
        i0Var.setClipToPadding(false);
        this.c1.setOrientation(0);
        this.Z0.addView(this.c1, c6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.n1;
        int i10 = k6.i6;
        f0 f0Var = this.N1;
        textView2.setBackground(k6.f0(k6.v0(i10, f0Var), 7, -1));
        this.n1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.n1.setTextColor(-1);
        this.n1.setTextSize(1, 14.0f);
        this.n1.setGravity(1);
        this.n1.setTypeface(AndroidUtilities.bold());
        this.n1.setSingleLine();
        this.n1.setOnClickListener(new k(this, 0));
        this.c1.addView(this.n1, c6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.o1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.o1.setBackground(k6.f0(k6.v0(i10, f0Var), 7, -1));
        this.o1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.o1.setOnClickListener(new k(this, 1));
        this.o1.setTextColor(-1);
        this.o1.setTextSize(1, 14.0f);
        this.o1.setGravity(1);
        this.o1.setTypeface(AndroidUtilities.bold());
        this.o1.setAlpha(0.6f);
        this.o1.setSingleLine();
        this.c1.addView(this.o1, c6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.p1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.p1.setBackground(k6.f0(k6.v0(i10, f0Var), 7, -1));
        this.p1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.p1.setTextColor(-1);
        this.p1.setTextSize(1, 14.0f);
        this.p1.setGravity(1);
        this.p1.setTypeface(AndroidUtilities.bold());
        this.p1.setAlpha(0.6f);
        this.p1.setSingleLine();
        this.p1.setOnClickListener(new k(this, 4));
        this.c1.addView(this.p1, c6.l(1.0f, 0, -2));
    }

    public static void u0(z3 z3Var, int i10) {
        z3Var.setAlign(i10);
        int i11 = 2;
        z3Var.getEditText().setGravity(i10 != 1 ? i10 != 2 ? 19 : 21 : 17);
        if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i11 = 3;
        }
        z3Var.getEditText().setTextAlignment(i11);
    }

    @Override // eg.l2
    public final void A() {
        y0(new p(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(j jVar) {
        MediaController.CropState cropState = this.E0;
        float f10 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF g02 = g0();
        while (true) {
            int i10 = 0;
            boolean z4 = false;
            while (true) {
                u0 u0Var = this.W0;
                if (i10 >= u0Var.getChildCount()) {
                    break;
                }
                View childAt = u0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - g02.y, 2.0d) + Math.pow(position2.x - g02.x, 2.0d))) < f11) {
                        z4 = true;
                    }
                }
                i10++;
            }
            if (!z4) {
                return g02;
            }
            g02 = new PointF(g02.x + f10, g02.y + f10);
        }
    }

    public final void B0(int i10) {
        if (this.d1 == i10 || this.e1 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.g1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.d1;
        ViewGroup viewGroup = this.r1;
        ViewGroup viewGroup2 = this.q1;
        ViewGroup viewGroup3 = i11 == 0 ? viewGroup2 : i11 == 2 ? viewGroup : null;
        this.e1 = i10;
        ViewGroup viewGroup4 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        int i12 = this.M1;
        dg.e1 e6 = dg.e1.e(i12);
        int i13 = 0;
        boolean z4 = i10 == 2;
        if (e6.l != z4) {
            e6.l = z4;
            if (z4) {
                e6.i(-1, false);
            } else {
                e6.i(e6.a.getInt("brush", 0), false);
            }
        }
        int c3 = dg.e1.e(i12).c();
        dg.e2 e2Var = this.H1;
        e2Var.a = c3;
        s0(e2Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.g1 = duration;
        duration.setInterpolator(pr.f);
        this.g1.addUpdateListener(new q(this, viewGroup3, viewGroup4, i13));
        this.g1.addListener(new j0(this, viewGroup3, viewGroup4, i10, 0));
        this.g1.start();
    }

    public final void C0() {
        int i10 = 0;
        while (true) {
            u0 u0Var = this.W0;
            if (i10 >= u0Var.getChildCount()) {
                return;
            }
            View childAt = u0Var.getChildAt(i10);
            if (childAt != this.P0) {
                if (childAt instanceof j) {
                    j jVar = (j) childAt;
                    if (!jVar.i0 && jVar.g0 <= 0.0f) {
                    }
                }
                i10++;
            }
            ((j) childAt).m();
            i10++;
        }
    }

    @Override // eg.g2
    public final void D() {
        z0(true);
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        boolean z10;
        if (i10 > AndroidUtilities.dp(50.0f) && this.e2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z4) {
                this.i2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.i2).commit();
            } else {
                this.h2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.h2).commit();
            }
        }
        if (this.d2) {
            int i11 = z4 ? this.i2 : this.h2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.c2.setLayoutParams(layoutParams);
                this.g2 = layoutParams.height;
                requestLayout();
                qh.i3 i3Var = ((ht0) this).l2.H1;
                if (i3Var != null) {
                    i3Var.a();
                }
                getHeight();
            }
        }
        if (this.j2 == i10 && this.k2 == z4) {
            getHeight();
            return;
        }
        this.j2 = i10;
        this.k2 = z4;
        boolean z11 = this.e2;
        j jVar = this.P0;
        if (jVar instanceof z3) {
            this.e2 = ((z3) jVar).getEditText().isFocused() && i10 > 0;
        } else {
            this.e2 = false;
        }
        if (this.e2 && this.d2) {
            x0(0);
        }
        if (this.g2 != 0 && !(z10 = this.e2) && z10 != z11 && !this.d2) {
            this.g2 = 0;
            requestLayout();
            qh.i3 i3Var2 = ((ht0) this).l2.H1;
            if (i3Var2 != null) {
                i3Var2.a();
            }
        }
        getHeight();
    }

    @Override // eg.l2, eg.g2
    public final void a() {
        w0(true);
    }

    @Override // eg.h
    public final int[] b(j jVar) {
        return k0(jVar);
    }

    @Override // eg.g2
    public final void d() {
        setTextType((this.R0 + 1) % 4);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u0 u0Var;
        z3 z3Var;
        String str;
        if (i10 != NotificationCenter.customTypefacesLoaded || (u0Var = this.W0) == null) {
            return;
        }
        for (int i12 = 0; i12 < u0Var.getChildCount(); i12++) {
            View childAt = u0Var.getChildAt(i12);
            if ((childAt instanceof z3) && (str = (z3Var = (z3) childAt).x0) != null) {
                z3Var.setTypeface(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10;
        v0 v0Var;
        u0 u0Var = this.W0;
        if (view == u0Var) {
            float e6 = this.W1.e(this.T1);
            if (e6 > 0.0f) {
                float dp = AndroidUtilities.dp(24.0f * e6);
                int l1 = k6.l1(e6, 1090519039);
                Paint paint = this.X1;
                paint.setShadowLayer(dp, 0.0f, 0.0f, l1);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(u0Var.getX(), u0Var.getY());
                canvas.scale(u0Var.getScaleX(), u0Var.getScaleY(), u0Var.getWidth() / 2.0f, u0Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, u0Var.getWidth(), u0Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, u0Var.getWidth(), u0Var.getHeight(), this.Y1);
                canvas.restore();
                if ((view != this.T0 || view == this.U0 || ((view == u0Var && u0Var.getClipChildren()) || (view == (v0Var = this.V0) && v0Var.getClipChildren()))) && (cropState = this.E0) != null) {
                    canvas.save();
                    r10 = this.S0 ? 0 : AndroidUtilities.statusBarHeight;
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r10;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    i10 = cropState.transformRotation;
                    if (i10 != 90 || i10 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
                    int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
                    float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.I0;
                    float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.g2) - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r10 + this.J0;
                    canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
                    r10 = 1;
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (r10 != 0) {
                    canvas.restore();
                }
                return drawChild;
            }
        }
        if (view != this.T0) {
        }
        canvas.save();
        if (this.S0) {
        }
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r10;
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        i10 = cropState.transformRotation;
        if (i10 != 90) {
        }
        measuredHeight2 = measuredWidth2;
        measuredWidth2 = measuredHeight2;
        int scaleX2 = (int) ((view.getScaleX() * (measuredWidth2 * cropState.cropPw)) / cropState.cropScale);
        int scaleY2 = (int) ((view.getScaleY() * (measuredHeight2 * cropState.cropPh)) / cropState.cropScale);
        float ceil2 = ((float) Math.ceil((getMeasuredWidth() - scaleX2) / 2.0f)) + this.I0;
        float additionalBottom2 = (((getAdditionalBottom() + (((getMeasuredHeight() - this.g2) - currentActionBarHeight2) - AndroidUtilities.dp(48.0f))) - scaleY2) / 2.0f) + AndroidUtilities.dp(8.0f) + r10 + this.J0;
        canvas.clipRect(Math.max(0.0f, ceil2), Math.max(0.0f, additionalBottom2), Math.min(ceil2 + scaleX2, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom2 + scaleY2));
        r10 = 1;
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        if (r10 != 0) {
        }
        return drawChild2;
    }

    @Override // org.telegram.ui.Components.qv0, org.telegram.ui.ActionBar.b6
    public final void e() {
        this.L1.setColor(-15132391);
    }

    @Override // eg.g2
    public final void f(int i10) {
        j jVar = this.P0;
        if (jVar instanceof z3) {
            u0((z3) jVar, i10);
            dg.e1 e6 = dg.e1.e(this.M1);
            e6.g = i10;
            e6.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new a1.e(21, this, (t2) view)).start();
    }

    @Override // eg.l2
    public final void g(dg.m mVar) {
        boolean z4 = mVar instanceof dg.b;
        r2 r2Var = this.i1;
        if (z4 || (mVar instanceof dg.d)) {
            r2Var.b(0.4f, 1.75f);
        } else {
            r2Var.b(0.05f, 1.0f);
        }
        r2Var.setDrawCenter(!(mVar instanceof dg.l));
        q0 q0Var = this.T0;
        if (q0Var.getCurrentBrush() instanceof dg.l) {
            this.h1 = true;
        }
        q0Var.setBrush(mVar);
        dg.e2 e2Var = this.H1;
        int i10 = e2Var.a;
        e2Var.a = dg.e1.e(this.M1).c();
        e2Var.c = this.j1.get();
        s0(e2Var, Integer.valueOf(i10));
        this.U0.invalidate();
    }

    public final PointF g0() {
        kv0 paintingSize = getPaintingSize();
        float f10 = paintingSize.a / 2.0f;
        float f11 = paintingSize.b / 2.0f;
        if (this.E0 != null) {
            double radians = (float) Math.toRadians(-(r2.transformRotation + r2.cropRotate));
            float cos = (float) ((Math.cos(radians) * r2.cropPx) - (Math.sin(radians) * r2.cropPy));
            float a2 = (float) l.d.a(radians, r2.cropPy, Math.sin(radians) * r2.cropPx);
            f10 -= cos * paintingSize.a;
            f11 -= a2 * paintingSize.b;
        }
        return new PointF(f10, f11);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.x0;
    }

    @Override // org.telegram.ui.Components.sv0, org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.E0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.y0;
    }

    public long getLcm() {
        return this.m1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        u5[] u5VarArr;
        u0 u0Var = this.W0;
        int childCount = u0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = u0Var.getChildAt(i10);
            if (childAt instanceof p3) {
                TLRPC.Document sticker = ((p3) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof z3) {
                CharSequence text = ((z3) childAt).getText();
                if ((text instanceof Spanned) && (u5VarArr = (u5[]) ((Spanned) text).getSpans(0, text.length(), u5.class)) != null) {
                    for (u5 u5Var : u5VarArr) {
                        if (u5Var != null) {
                            TLRPC.Document document = u5Var.document;
                            if (document == null) {
                                document = l5.f(this.M1, u5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return this.z0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public dg.o1 getRenderView() {
        return this.T0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.P0;
        u0 u0Var = this.W0;
        if (jVar == null) {
            return getY() + u0Var.getMeasuredHeight();
        }
        jVar.getLocationInWindow(new int[2]);
        return (u0Var.getScaleY() * this.P0.getHeight()) + r2[1];
    }

    public b11 getThanosEffect() {
        if (!b11.c()) {
            return null;
        }
        if (this.X0 == null) {
            b11 b11Var = new b11(getContext(), new p(this, 0));
            this.X0 = b11Var;
            addView(b11Var);
        }
        return this.X0;
    }

    public final t2 h0(String str, boolean z4) {
        float f10;
        kv0 kv0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e6) {
            FileLog.e(e6);
            f10 = 1.0f;
        }
        u0 u0Var = this.W0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(u0Var.getMeasuredWidth() * 0.5d);
            kv0Var = new kv0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(u0Var.getMeasuredHeight() * 0.5d);
            kv0Var = new kv0(f10 * floor2, floor2);
        }
        kv0 kv0Var2 = kv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = kv0Var2.a;
            kv0Var2.a = kv0Var2.b;
            kv0Var2.b = f11;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        t2 t2Var = new t2(context, g02, kv0Var2, str, intValue);
        t2Var.setDelegate(this);
        u0Var.addView(t2Var);
        if (z4) {
            p0(t2Var);
            r0(t2Var, true);
        }
        return t2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n0 i0(Object obj, TLRPC.Document document, boolean z4) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f10;
        b1 b1Var;
        double d;
        b1 b1Var2;
        PointF pointF;
        boolean isTextColorEmoji;
        ArrayList arrayList;
        dg.f1 f1Var;
        b1 b1Var3;
        int i10;
        float f11;
        int i11 = 0;
        while (true) {
            if (i11 >= document.attributes.size()) {
                tL_maskCoords = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                tL_maskCoords = documentAttribute.mask_coords;
                break;
            }
            i11++;
        }
        float f12 = 0.75f;
        MediaController.CropState cropState = this.E0;
        if (cropState != null) {
            f10 = -(cropState.transformRotation + cropState.cropRotate);
            f12 = 0.75f / cropState.cropScale;
        } else {
            f10 = 0.0f;
        }
        b1 b1Var4 = new b1(g0(), f12, f10);
        u0 u0Var = this.W0;
        if (tL_maskCoords == null || (arrayList = this.k1) == null || arrayList.size() == 0) {
            b1Var = b1Var4;
            d = 0.5d;
        } else {
            int i12 = tL_maskCoords.n;
            long j10 = document.id;
            if (i12 >= 0 && i12 <= 3 && !this.k1.isEmpty()) {
                int size = this.k1.size();
                int nextInt = Utilities.random.nextInt(size);
                int i13 = size;
                loop1: while (i13 > 0) {
                    dg.f1 f1Var2 = (dg.f1) this.k1.get(nextInt);
                    if (f1Var2.a(i12) != null) {
                        d = 0.5d;
                        float f13 = f1Var2.a * 1.1f;
                        int i14 = 0;
                        while (i14 < u0Var.getChildCount()) {
                            View childAt = u0Var.getChildAt(i14);
                            dg.f1 f1Var3 = f1Var2;
                            if (childAt instanceof p3) {
                                p3 p3Var = (p3) childAt;
                                if (p3Var.getAnchor() == i12) {
                                    PointF position = p3Var.getPosition();
                                    b1Var3 = b1Var4;
                                    i10 = size;
                                    f11 = f13;
                                    float hypot = (float) Math.hypot(position.x - r4.x, position.y - r4.y);
                                    if ((j10 == p3Var.getSticker().id || this.k1.size() > 1) && hypot < f11) {
                                        break;
                                    }
                                    i14++;
                                    f1Var2 = f1Var3;
                                    b1Var4 = b1Var3;
                                    size = i10;
                                    f13 = f11;
                                }
                            }
                            b1Var3 = b1Var4;
                            i10 = size;
                            f11 = f13;
                            i14++;
                            f1Var2 = f1Var3;
                            b1Var4 = b1Var3;
                            size = i10;
                            f13 = f11;
                        }
                        b1Var = b1Var4;
                        f1Var = f1Var2;
                        break loop1;
                    }
                    b1Var3 = b1Var4;
                    i10 = size;
                    nextInt = (nextInt + 1) % i10;
                    i13--;
                    b1Var4 = b1Var3;
                    size = i10;
                }
            }
            b1Var = b1Var4;
            d = 0.5d;
            f1Var = null;
            if (f1Var != null) {
                PointF a2 = f1Var.a(i12);
                float f14 = i12 == 1 ? f1Var.e : f1Var.a;
                float f15 = f1Var.b;
                float floor = (float) ((f14 / ((float) Math.floor(getPaintingSize().a * d))) * tL_maskCoords.zoom);
                double radians = (float) Math.toRadians(f15);
                double d10 = 1.5707963267948966d - radians;
                double d11 = f14;
                float sin = (float) (Math.sin(d10) * d11 * tL_maskCoords.x);
                float cos = (float) (Math.cos(d10) * d11 * tL_maskCoords.x);
                double d12 = radians + 1.5707963267948966d;
                b1Var2 = new b1(new PointF(a2.x + sin + ((float) (Math.cos(d12) * d11 * tL_maskCoords.y)), a2.y + cos + ((float) (Math.sin(d12) * d11 * tL_maskCoords.y))), floor, f15);
                Context context = getContext();
                float floor2 = (float) Math.floor(getPaintingSize().a * d);
                kv0 kv0Var = new kv0(floor2, floor2);
                pointF = b1Var2.a;
                n0 n0Var = new n0(this, context, pointF, b1Var2.c, b1Var2.b, kv0Var, document, obj);
                isTextColorEmoji = MessageObject.isTextColorEmoji(document);
                ImageReceiver imageReceiver = n0Var.u0;
                if (isTextColorEmoji) {
                    imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                imageReceiver.setLayerNum(12);
                if (pointF.x == u0Var.getMeasuredWidth() / 2.0f) {
                    n0Var.setStickyX(2);
                }
                if (pointF.y == u0Var.getMeasuredHeight() / 2.0f) {
                    n0Var.setStickyY(2);
                }
                n0Var.setDelegate(this);
                u0Var.addView(n0Var);
                if (z4) {
                    p0(n0Var);
                    r0(n0Var, true);
                }
                return n0Var;
            }
        }
        b1Var2 = b1Var;
        Context context2 = getContext();
        float floor22 = (float) Math.floor(getPaintingSize().a * d);
        kv0 kv0Var2 = new kv0(floor22, floor22);
        pointF = b1Var2.a;
        n0 n0Var2 = new n0(this, context2, pointF, b1Var2.c, b1Var2.b, kv0Var2, document, obj);
        isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver2 = n0Var2.u0;
        if (isTextColorEmoji) {
        }
        imageReceiver2.setLayerNum(12);
        if (pointF.x == u0Var.getMeasuredWidth() / 2.0f) {
        }
        if (pointF.y == u0Var.getMeasuredHeight() / 2.0f) {
        }
        n0Var2.setDelegate(this);
        u0Var.addView(n0Var2);
        if (z4) {
        }
        return n0Var2;
    }

    public final z3 j0(boolean z4) {
        ((ht0) this).l2.d0.isFocusable();
        kv0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        z3 z3Var = new z3(getContext(), A0, (int) (paintingSize.a / 9.0f), "", this.H1, this.R0);
        float f10 = paintingSize.a / 9.0f;
        p pVar = new p(this, 2);
        z3Var.t0 = (int) (0.5f * f10);
        z3Var.u0 = (int) (f10 * 2.0f);
        z3Var.v0 = pVar;
        float f11 = A0.x;
        u0 u0Var = this.W0;
        if (f11 == u0Var.getMeasuredWidth() / 2.0f) {
            z3Var.setStickyX(2);
        }
        if (A0.y == u0Var.getMeasuredHeight() / 2.0f) {
            z3Var.setStickyY(2);
        }
        z3Var.setDelegate(this);
        z3Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i10 = this.M1;
        z3Var.setTypeface(dg.e1.e(i10).j);
        z3Var.setType(dg.e1.e(i10).h);
        u0Var.addView(z3Var, c6.c(-2.0f, -2));
        MediaController.CropState cropState = this.E0;
        if (cropState != null) {
            z3Var.j(1.0f / cropState.cropScale);
            z3Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z4) {
            p0(z3Var);
            z3Var.q();
            r0(z3Var, false);
            z3Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(z3Var.getFocusedView());
            this.Q0 = true;
            int i11 = dg.e1.e(i10).g;
            i2 i2Var = this.r1;
            i2Var.d(i11, true);
            i2Var.setOutlineType(dg.e1.e(i10).h);
        }
        return z3Var;
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.a2;
        fArr[0] = jVar.getWidth() / 2.0f;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        Object parent = jVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int round = Math.round(fArr[0]);
        int[] iArr = this.b2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        float f10 = iArr[0];
        Point point = AndroidUtilities.displaySize;
        float f11 = round2 - (point.y / 2.0f);
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.W0.getRotation());
        double d10 = f11;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) l.d.a(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final void l0(boolean z4) {
        int i10 = 0;
        if (this.d2) {
            x0(0);
        }
        if (z4) {
            mz mzVar = this.c2;
            if (mzVar == null || mzVar.getVisibility() != 0) {
                m0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.c2.getMeasuredHeight());
            ofFloat.addUpdateListener(new r(this, i10));
            this.f2 = true;
            ofFloat.addListener(new o0(this, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
            ofFloat.start();
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        if (this.P0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        q0 q0Var = this.T0;
        float translationX = ((x10 - q0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / q0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - q0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / q0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-q0Var.getRotation());
        double d10 = y10;
        float measuredWidth = (q0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (q0Var.getMeasuredHeight() / 2.0f) + ((float) l.d.a(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        q0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void m0() {
        mz mzVar;
        qh.i3 i3Var;
        if (this.g2 > 0 && (i3Var = ((ht0) this).l2.H1) != null) {
            i3Var.a();
        }
        if (!this.d2 && (mzVar = this.c2) != null && mzVar.getVisibility() != 8) {
            this.c2.setVisibility(8);
        }
        this.g2 = 0;
    }

    public final void n0(boolean z4) {
        if (this.d1 == 0) {
            this.i1.setLayerType(z4 ? 2 : 0, null);
            this.Z0.setLayerType(z4 ? 2 : 0, null);
            this.Y0.setLayerType(z4 ? 2 : 0, null);
        }
    }

    public final boolean o0() {
        if (this.I1) {
            w0(false);
            return true;
        }
        if (this.d2) {
            l0(true);
            return true;
        }
        if (!this.Q0) {
            return false;
        }
        r0(null, true);
        return true;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.sv0, org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (this.c2 != null) {
            int measuredHeight = AndroidUtilities.isTablet() ? i15 - this.c2.getMeasuredHeight() : (R() + i15) - this.c2.getMeasuredHeight();
            mz mzVar = this.c2;
            mzVar.layout(0, measuredHeight, mzVar.getMeasuredWidth(), this.c2.getMeasuredHeight() + measuredHeight);
        }
        int i16 = this.S0 ? 0 : AndroidUtilities.statusBarHeight;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16;
        q0 q0Var = this.T0;
        int ceil = (int) Math.ceil((i14 - q0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.y3.C(8.0f, (((i15 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - q0Var.getMeasuredHeight()) / 2, i16);
        q0Var.layout(ceil, additionalTop, q0Var.getMeasuredWidth() + ceil, q0Var.getMeasuredHeight() + additionalTop);
        s0 s0Var = this.U0;
        s0Var.layout(ceil, additionalTop, s0Var.getMeasuredWidth() + ceil, s0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = q0Var.getMeasuredWidth();
        u0 u0Var = this.W0;
        int measuredWidth2 = ((measuredWidth - u0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight2 = ((q0Var.getMeasuredHeight() - u0Var.getMeasuredHeight()) / 2) + additionalTop;
        u0Var.layout(measuredWidth2, measuredHeight2, u0Var.getMeasuredWidth() + measuredWidth2, u0Var.getMeasuredHeight() + measuredHeight2);
        b11 b11Var = this.X0;
        if (b11Var != null) {
            b11Var.layout(measuredWidth2, measuredHeight2, u0Var.getMeasuredWidth() + measuredWidth2, u0Var.getMeasuredHeight() + measuredHeight2);
        }
        v0 v0Var = this.V0;
        v0Var.layout(ceil, additionalTop, v0Var.getMeasuredWidth() + ceil, v0Var.getMeasuredHeight() + additionalTop);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f10;
        this.M0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.A0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * currentActionBarHeight) / f10);
        float f12 = currentActionBarHeight2;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / currentActionBarHeight);
            floor = f12;
        }
        int i12 = (int) f11;
        int i13 = (int) floor;
        this.T0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        this.U0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        float f13 = f11 / this.O0.a;
        this.N0 = f13;
        u0 u0Var = this.W0;
        u0Var.setScaleX(f13);
        u0Var.setScaleY(this.N0);
        u0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.O0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.O0.b, TLObject.FLAG_30));
        b11 b11Var = this.X0;
        if (b11Var != null) {
            b11Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.O0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.O0.b, TLObject.FLAG_30));
            this.X0.setScaleX(this.N0);
            this.X0.setScaleY(this.N0);
        }
        C0();
        this.V0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        measureChild(this.Z0, i10, i11);
        measureChild(this.i1, i10, i11);
        measureChild(this.b1, i10, i11);
        measureChild(this.a1, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.g2), TLObject.FLAG_30));
        FrameLayout frameLayout = this.Y0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.M0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.d2 && !this.f2) {
            this.M0 = true;
            m0();
            this.M0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        mz mzVar = this.c2;
        if (mzVar != null) {
            measureChild(mzVar, i10, i11);
        }
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.C0.b(jVar.getUUID(), new a0(this, jVar, 0));
    }

    @Override // eg.h
    public final /* synthetic */ boolean q() {
        return true;
    }

    public final void q0(j jVar) {
        j jVar2 = this.P0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.j0, false);
            this.P0 = null;
            if (jVar instanceof z3) {
                ValueAnimator valueAnimator = this.g1;
                if (valueAnimator != null && this.e1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.W0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            dg.h2 h2Var = this.C0;
            h2Var.b.remove(uuid);
            h2Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new ag.e(h2Var, 20));
        }
        r2 r2Var = this.i1;
        y5.h hVar = this.j1;
        r2Var.setValueOverride(hVar);
        r2Var.setShowPreview(true);
        float f10 = hVar.get();
        dg.e2 e2Var = this.H1;
        e2Var.c = f10;
        s0(e2Var, null);
    }

    @Override // eg.h
    public final boolean r() {
        return !this.Q0;
    }

    public final boolean r0(j jVar, boolean z4) {
        c1 c1Var;
        boolean z10;
        int i10;
        boolean z11 = jVar instanceof z3;
        int i11 = 2;
        if (z11 && (((i10 = this.e1) == -1 && this.d1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.g1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.I1) {
                w0(false);
            }
            B0(2);
        }
        if (z11 && z4) {
            z3 z3Var = (z3) jVar;
            int gravity = z3Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            i2 i2Var = this.r1;
            i2Var.setAlignment(i11);
            i2Var.setTypeface(z3Var.getTypeface().a);
            i2Var.e(z3Var.getType(), true);
            this.a1.invalidate();
        }
        j jVar2 = this.P0;
        if (jVar2 == null) {
            c1Var = this;
            z10 = false;
        } else {
            if (jVar2 == jVar) {
                if (!this.Q0) {
                    int[] k02 = k0(jVar2);
                    y0(new a0(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof z3) {
                    AndroidUtilities.showKeyboard(((z3) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            c1Var = this;
            jVar2.l(jVar2.j0, false);
            j jVar3 = c1Var.P0;
            if (jVar3 instanceof z3) {
                z3 z3Var2 = (z3) jVar3;
                x3 x3Var = z3Var2.n0;
                x3Var.clearFocus();
                x3Var.setEnabled(false);
                x3Var.setClickable(false);
                z3Var2.m();
                if (!z11) {
                    c1Var.Q0 = false;
                    AndroidUtilities.hideKeyboard(((z3) c1Var.P0).getFocusedView());
                    l0(false);
                }
            }
            z10 = true;
        }
        j jVar4 = c1Var.P0;
        c1Var.P0 = jVar;
        if ((jVar4 instanceof z3) && TextUtils.isEmpty(((z3) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = c1Var.P0;
        y5.h hVar = c1Var.j1;
        dg.e2 e2Var = c1Var.H1;
        r2 r2Var = c1Var.i1;
        if (jVar5 == null) {
            ValueAnimator valueAnimator2 = c1Var.g1;
            if (valueAnimator2 != null && c1Var.e1 != 0) {
                valueAnimator2.cancel();
            }
            if (c1Var.I1) {
                w0(false);
            }
            B0(0);
            r2Var.setValueOverride(hVar);
            r2Var.setShowPreview(true);
            e2Var.c = hVar.get();
            s0(e2Var, null);
            return z10;
        }
        v0 v0Var = c1Var.V0;
        jVar5.j0 = v0Var;
        jVar5.l(v0Var, true);
        c1Var.W0.bringChildToFront(c1Var.P0);
        j jVar6 = c1Var.P0;
        if (!(jVar6 instanceof z3)) {
            r2Var.setValueOverride(hVar);
            r2Var.setShowPreview(true);
            e2Var.c = hVar.get();
            s0(e2Var, null);
            return true;
        }
        z3 z3Var3 = (z3) jVar6;
        z3Var3.w0 = false;
        z3Var3.getSwatch().c = e2Var.c;
        s0(z3Var3.getSwatch(), null);
        r2Var.setValueOverride(new h0(z3Var3, (int) (c1Var.O0.a / 9.0f), 0));
        r2Var.setShowPreview(false);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.M0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(dg.e2 e2Var, Integer num) {
        dg.e2 e2Var2 = this.H1;
        if (e2Var2 != e2Var) {
            e2Var2.a = e2Var.a;
            e2Var2.b = e2Var.b;
            e2Var2.c = e2Var.c;
            int i10 = this.M1;
            dg.e1.e(i10).h(e2Var.a, true);
            dg.e1.e(i10).j(e2Var.c);
        }
        int i11 = e2Var.a;
        q0 q0Var = this.T0;
        q0Var.setColor(i11);
        q0Var.setBrushSize(e2Var.c);
        int i12 = e2Var2.a;
        if (num == null || num.intValue() == i12) {
            y0 y0Var = this.Z0;
            if (y0Var != null) {
                y0Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new s(this, num, i12, 0));
            duration.start();
        }
        j jVar = this.P0;
        if (jVar instanceof z3) {
            ((z3) jVar).setSwatch(new dg.e2(e2Var.b, e2Var.c, e2Var.a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(qg.b bVar) {
        bVar.o(AndroidUtilities.dp(4.0f));
        this.Z1 = bVar;
    }

    public void setDrawShadow(boolean z4) {
        this.T1 = z4;
        invalidate();
        setClipChildren(!z4);
    }

    public void setOffsetTranslationX(float f10) {
        if (this.d1 == 0) {
            this.i1.setTranslationX(f10);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.R1 = runnable;
    }

    @Override // eg.h
    public final void t(j jVar) {
        int[] k02 = k0(jVar);
        y0(new a0(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    public final void t0(float f10) {
        this.z0 = f10;
        this.Y0.setTranslationY(-f10);
        this.Z0.setTranslationY(f10);
    }

    @Override // eg.g2
    public final void u() {
        qh.i3 i3Var;
        if (!this.e2 && !this.d2) {
            j0(true);
            return;
        }
        boolean z4 = this.d2;
        if (z4 && (i3Var = ((ht0) this).l2.H1) != null) {
            i3Var.e = true;
        }
        x0(!z4 ? 1 : 0);
        if (z4) {
            j jVar = this.P0;
            if (jVar instanceof z3) {
                AndroidUtilities.showKeyboard(((z3) jVar).getEditText());
            }
        }
    }

    @Override // eg.h
    public final void v(float f10, float f11, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.W0.getRotation());
        double d10 = f11 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) l.d.a(radians, d10, Math.sin(radians) * d));
    }

    public final void v0(float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        this.F0 = f10;
        this.K0 = f13;
        this.L0 = f14;
        this.G0 = f11;
        this.H0 = f12;
        this.I0 = f11;
        float f19 = f12 + 0.0f;
        this.J0 = f19;
        int i10 = 0;
        while (i10 < 4) {
            View view = i10 == 0 ? this.W0 : i10 == 1 ? this.V0 : i10 == 2 ? this.T0 : this.U0;
            MediaController.CropState cropState = this.E0;
            if (cropState != null) {
                float f20 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth == 0 || measuredHeight == 0) {
                    return;
                }
                int i11 = cropState.transformRotation;
                if (i11 == 90 || i11 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f13 / ((int) (cropState.cropPw * r12)), f14 / ((int) (cropState.cropPh * r13)));
                f15 = f20 * max;
                float z4 = e2.c.z(cropState.cropPx, measuredWidth, f10, max);
                float f21 = cropState.cropScale;
                f16 = (z4 * f21) + f11;
                f17 = (cropState.cropPy * measuredHeight * f10 * max * f21) + f19;
                f18 = cropState.cropRotate + i11;
            } else {
                f15 = i10 == 0 ? this.N0 * 1.0f : 1.0f;
                f16 = f11;
                f17 = f19;
                f18 = 0.0f;
            }
            float f22 = ((-this.g2) / 2.0f) + f17;
            float f23 = f10 * f15;
            if (Float.isNaN(f23)) {
                f23 = 1.0f;
            }
            view.setScaleX(f23);
            view.setScaleY(f23);
            view.setTranslationX(f16);
            view.setTranslationY(f22);
            view.setRotation(f18);
            view.invalidate();
            i10++;
        }
        C0();
        invalidate();
    }

    @Override // eg.l2
    public final dg.e1 w() {
        return dg.e1.e(this.M1);
    }

    public final void w0(final boolean z4) {
        if (this.I1 != z4) {
            this.I1 = z4;
            o1.j jVar = this.J1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new kb.a(z4 ? 0.0f : 1000.0f));
            this.J1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z4 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            int i10 = 1;
            final boolean[] zArr = {this.e2 || this.d2};
            final float translationY = this.Z0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.J1.b(new o1.g() { // from class: eg.b0
                @Override // o1.g
                public final void a(o1.h hVar, float f10, float f11) {
                    c1 c1Var = c1.this;
                    y0 y0Var = c1Var.Z0;
                    float f12 = f10 / 1000.0f;
                    c1Var.K1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(c1Var.K1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(c1Var.K1, 0.25f) / 0.25f));
                    x0 x0Var = c1Var.D1;
                    float f14 = c1Var.K1;
                    boolean z10 = z4;
                    x0Var.y1(f14, z10);
                    c1Var.y0.setProgress(c1Var.K1);
                    c1Var.x0.setProgress(c1Var.K1);
                    c1Var.c1.setTranslationY(AndroidUtilities.dp(32.0f) * c1Var.K1);
                    if (zArr[0]) {
                        float f15 = c1Var.K1;
                        if (!z10) {
                            f15 = 1.0f - f15;
                        }
                        y0Var.setTranslationY(translationY - ((AndroidUtilities.dp(40.0f) * f15) * (z10 ? 1 : -1)));
                    }
                    y0Var.invalidate();
                    if (view == c1Var.r1) {
                        c1Var.a1.invalidate();
                    }
                }
            });
            this.J1.a(new x(this, z4, i10));
            this.J1.f();
            if (z4) {
                x0 x0Var = this.D1;
                x0Var.setVisibility(0);
                x0Var.setSelectedColorIndex(dg.e1.e(this.M1).d());
            }
        }
    }

    @Override // eg.h
    public final boolean x(j jVar) {
        return r0(jVar, true);
    }

    public final void x0(int i10) {
        i2 i2Var = this.r1;
        int i11 = 0;
        int i12 = 1;
        if (i10 != 1) {
            qg emojiButton = i2Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(og.e, true);
            }
            mz mzVar = this.c2;
            if (mzVar != null) {
                this.d2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    mzVar.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.g2 = 0;
            }
            qh.i3 i3Var = ((ht0) this).l2.H1;
            if (i3Var != null) {
                i3Var.a();
            }
            requestLayout();
            getHeight();
            return;
        }
        mz mzVar2 = this.c2;
        boolean z4 = mzVar2 != null && mzVar2.getVisibility() == 0;
        mz mzVar3 = this.c2;
        if (mzVar3 != null && mzVar3.Z0 != UserConfig.selectedAccount) {
            removeView(mzVar3);
            this.c2 = null;
        }
        if (this.c2 == null) {
            mz mzVar4 = new mz(null, true, false, false, getContext(), false, null, null, true, this.N1, false, false);
            this.c2 = mzVar4;
            mzVar4.R0 = true;
            mzVar4.setVisibility(8);
            if (AndroidUtilities.isTablet()) {
                this.c2.setForseMultiwindowLayout(true);
            }
            this.c2.setDelegate(new p0(this));
            addView(this.c2);
        }
        this.c2.setVisibility(0);
        this.d2 = true;
        mz mzVar5 = this.c2;
        if (this.h2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.h2 = AndroidUtilities.dp(150.0f);
            } else {
                this.h2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
        }
        if (this.i2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.i2 = AndroidUtilities.dp(150.0f);
            } else {
                this.i2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
        }
        Point point = AndroidUtilities.displaySize;
        int i13 = point.x > point.y ? this.i2 : this.h2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mzVar5.getLayoutParams();
        layoutParams.height = i13;
        mzVar5.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            j jVar = this.P0;
            if (jVar instanceof z3) {
                AndroidUtilities.hideKeyboard(((z3) jVar).getEditText());
            }
        }
        this.g2 = i13;
        requestLayout();
        qh.i3 i3Var2 = ((ht0) this).l2.H1;
        if (i3Var2 != null) {
            i3Var2.a();
        }
        qg emojiButton2 = i2Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(og.d, true);
        }
        getHeight();
        if (z4 || this.e2) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.g2, 0.0f);
        ofFloat.addUpdateListener(new r(this, i12));
        ofFloat.addListener(new o0(this, i11));
        ofFloat.start();
    }

    public final void y0(Runnable runnable, c1 c1Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.p1 p1Var = this.O1;
        if (p1Var != null && p1Var.isShowing()) {
            this.O1.d(true);
            return;
        }
        if (this.P1 == null) {
            this.Q1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.N1);
            this.P1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.P1.setBackgroundColor(-14145495);
            this.P1.setOnTouchListener(new u(this, 0));
            this.P1.setDispatchKeyEventListener(new v(this));
            this.P1.setShownFromBottom(true);
        }
        this.P1.d();
        runnable.run();
        if (this.O1 == null) {
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(this.P1, -2, -2);
            this.O1 = p1Var2;
            p1Var2.b = true;
            p1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.O1.setOutsideTouchable(true);
            this.O1.setClippingEnabled(true);
            this.O1.setInputMethodMode(2);
            this.O1.setSoftInputMode(0);
            this.O1.getContentView().setFocusableInTouchMode(true);
            this.O1.setOnDismissListener(new w(this, 0));
        }
        this.P1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.O1.setFocusable(true);
        this.O1.showAtLocation(c1Var, i10, i11 - (this.P1.getMeasuredWidth() / 2), i12 - this.P1.getMeasuredHeight());
        org.telegram.ui.ActionBar.p1.i(this.P1);
    }

    public final void z0(boolean z4) {
        if (this.B1 != z4) {
            this.B1 = z4;
            o1.j jVar = this.C1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new kb.a(z4 ? 0.0f : 1000.0f));
            this.C1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z4 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            if (z4) {
                o2 o2Var = this.s1;
                o2Var.setAlpha(0.0f);
                o2Var.setVisibility(0);
            }
            this.C1.b(new ag.c(1, this));
            this.C1.a(new x(this, z4, 0));
            this.C1.f();
        }
    }

    @Override // eg.h
    public final /* synthetic */ void B(boolean z4) {
    }

    @Override // eg.h
    public final /* synthetic */ void C() {
    }

    public View getView() {
        return this;
    }

    @Override // eg.h
    public final /* synthetic */ void h(boolean z4) {
    }

    @Override // eg.h
    public final /* synthetic */ void i(boolean z4) {
    }

    @Override // eg.h
    public final /* synthetic */ void k() {
    }

    @Override // eg.h
    public final /* synthetic */ void l() {
    }

    @Override // eg.h
    public final /* synthetic */ void n(boolean z4) {
    }

    @Override // eg.h
    public final /* synthetic */ void y() {
    }
}
