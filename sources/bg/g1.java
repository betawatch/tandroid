package bg;

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
import i7.f6;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.y5;
import org.telegram.ui.gq0;
import org.telegram.ui.th;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class g1 extends iv0 implements q2, i, l2, gv0, NotificationCenter.NotificationCenterDelegate {
    public final Bitmap A0;
    public boolean A1;
    public final ag.n2 B0;
    public o1.k B1;
    public final DispatchQueue C0;
    public final a1 C1;
    public final MediaController.CropState D0;
    public final Paint D1;
    public float E0;
    public final Paint E1;
    public float F0;
    public final Paint F1;
    public float G0;
    public final ag.k2 G1;
    public float H0;
    public boolean H1;
    public float I0;
    public o1.k I1;
    public float J0;
    public float J1;
    public float K0;
    public final Paint K1;
    public boolean L0;
    public final int L1;
    public float M0;
    public final i0 M1;
    public bv0 N0;
    public org.telegram.ui.ActionBar.o1 N1;
    public k O0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O1;
    public boolean P0;
    public Rect P1;
    public int Q0;
    public Runnable Q1;
    public final boolean R0;
    public final ag.h1 R1;
    public final t0 S0;
    public boolean S1;
    public final v0 T0;
    public float T1;
    public final y0 U0;
    public boolean U1;
    public final x0 V0;
    public final d6 V1;
    public p01 W0;
    public final Paint W1;
    public final FrameLayout X0;
    public final Paint X1;
    public final b1 Y0;
    public ng.d Y1;
    public final z0 Z0;
    public final float[] Z1;
    public final FrameLayout a1;
    public final int[] a2;
    public l0 b1;
    public fz b2;
    public int c1;
    public boolean c2;
    public int d1;
    public boolean d2;
    public float e1;
    public boolean e2;
    public ValueAnimator f1;
    public int f2;
    public boolean g1;
    public int g2;
    public final w2 h1;
    public int h2;
    public final za.c i1;
    public int i2;
    public ArrayList j1;
    public boolean j2;
    public final int k1;
    public BigInteger l1;
    public TextView m1;
    public TextView n1;
    public TextView o1;
    public final r2 p1;
    public final n2 q1;
    public final t2 r1;
    public final ImageView s1;
    public final LinearLayout t1;
    public final TextView u1;
    public final TextView v1;
    public final e2 w0;
    public final TextView w1;
    public final i2 x0;
    public final Paint x1;
    public float y0;
    public final Paint y1;
    public final Bitmap z0;
    public float z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [bg.f4] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.view.View, bg.q0, bg.v3] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, bg.g1, bg.l2, bg.q2, org.telegram.ui.Components.gv0, org.telegram.ui.Components.hv0] */
    public g1(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, gq0 gq0Var, c6 c6Var) {
        super(context, activity);
        float f9;
        int i12;
        y2 y2Var;
        Emoji.EmojiSpan[] emojiSpanArr;
        ArrayList arrayList2 = arrayList;
        boolean z10 = false;
        this.c1 = 0;
        this.d1 = -1;
        final ws0 ws0Var = (ws0) this;
        this.i1 = new za.c(ws0Var, 5);
        this.x1 = new Paint(1);
        this.y1 = new Paint(1);
        this.D1 = new Paint(1);
        this.E1 = new Paint(1);
        this.F1 = new Paint(1);
        ag.k2 k2Var = new ag.k2(1.0f, 0.016773745f, -1);
        this.G1 = k2Var;
        this.K1 = new Paint(1);
        this.U1 = false;
        this.V1 = new d6((View) this, 350L, jr.h);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        this.X1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.Z1 = new float[2];
        this.a2 = new int[2];
        new ag.q1(ws0Var, 10);
        setDelegate(this);
        this.L1 = i10;
        this.M1 = new i0(false ? 1 : 0, c6Var);
        this.D0 = cropState;
        this.R0 = context instanceof BubbleActivity;
        ag.h1 e10 = ag.h1.e(i10);
        this.R1 = e10;
        e10.i(0, true);
        k2Var.a = e10.c();
        k2Var.c = e10.i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.C0 = dispatchQueue;
        this.z0 = bitmap;
        this.A0 = bitmap2;
        this.k1 = i11;
        ag.n2 n2Var = new ag.n2();
        this.B0 = n2Var;
        n2Var.a = new a1.c(ws0Var, 4);
        t0 t0Var = new t0(ws0Var, context, new ag.f1(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.S0 = t0Var;
        t0Var.setDelegate(new u0(ws0Var, gq0Var));
        t0Var.setUndoStore(n2Var);
        t0Var.setQueue(dispatchQueue);
        t0Var.setVisibility(4);
        addView(t0Var, f6.e(-1, -1, 51));
        v0 v0Var = new v0(ws0Var, context);
        this.T0 = v0Var;
        v0Var.setVisibility(4);
        addView(v0Var, f6.e(-1, -1, 51));
        x0 x0Var = new x0(ws0Var, context, new w0(ws0Var));
        this.V0 = x0Var;
        addView(x0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList2.get(i13);
                byte b10 = mediaEntity.type;
                if (b10 == 0) {
                    f9 = 2.0f;
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z10);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    y2Var = i02;
                } else {
                    f9 = 2.0f;
                    if (b10 == 1) {
                        ?? j02 = j0(z10);
                        j02.setType(mediaEntity.subType);
                        j02.setTypeface(mediaEntity.textTypeface);
                        j02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                        int size2 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList3.get(i14);
                            i14++;
                            VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                            int i15 = size2;
                            y5 y5Var = new y5(emojiEntity2.document_id, j02.getFontMetricsInt());
                            int i16 = emojiEntity2.offset;
                            spannableString.setSpan(y5Var, i16, emojiEntity2.length + i16, 33);
                            size = size;
                            size2 = i15;
                        }
                        i12 = size;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        j02.setText(replaceEmoji);
                        u0(j02, mediaEntity.textAlign);
                        ag.k2 swatch = j02.getSwatch();
                        swatch.a = mediaEntity.color;
                        j02.setSwatch(swatch);
                        y2Var = j02;
                    } else {
                        i12 = size;
                        if (b10 == 2) {
                            y2 h02 = h0(mediaEntity.text, false);
                            h02.x0 = false;
                            if ((mediaEntity.subType & 2) != 0) {
                                h02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            y2Var = h02;
                        } else {
                            i13++;
                            arrayList2 = arrayList;
                            size = i12;
                            z10 = false;
                        }
                    }
                }
                y2Var.setX((mediaEntity.x * this.N0.a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f9));
                y2Var.setY((mediaEntity.y * this.N0.b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f9));
                y2Var.setPosition(new PointF((mediaEntity.viewWidth / f9) + y2Var.getX(), (mediaEntity.viewHeight / f9) + y2Var.getY()));
                y2Var.setScale(mediaEntity.scale);
                y2Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i13++;
                arrayList2 = arrayList;
                size = i12;
                z10 = false;
            }
        }
        this.V0.setVisibility(4);
        y0 y0Var = new y0(context);
        this.U0 = y0Var;
        addView(y0Var);
        ?? frameLayout = new FrameLayout(context);
        this.X0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, f6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.s1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(g6.f0(1090519039, 1, -1));
        final int i17 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: bg.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        ws0 ws0Var2 = ws0Var;
                        t0 t0Var2 = ws0Var2.S0;
                        if (t0Var2 != null && (t0Var2.getCurrentBrush() instanceof ag.l)) {
                            t0Var2.b();
                            ws0Var2.p1.setSelectedIndex(1);
                            ws0Var2.q((ag.m) ag.m.a.get(0));
                            break;
                        } else {
                            ws0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        ws0 ws0Var3 = ws0Var;
                        t0 t0Var3 = ws0Var3.S0;
                        ag.n2 n2Var2 = ws0Var3.B0;
                        if (n2Var2.a()) {
                            if (t0Var3 != null && (t0Var3.getCurrentBrush() instanceof ag.l)) {
                                t0Var3.b();
                                ws0Var3.p1.setSelectedIndex(1);
                                ws0Var3.q((ag.m) ag.m.a.get(0));
                            }
                            t0Var3.a();
                            n2Var2.c.clear();
                            n2Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            ws0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ws0 ws0Var4 = ws0Var;
                        k kVar = ws0Var4.O0;
                        if (kVar instanceof f4) {
                            AndroidUtilities.hideKeyboard(((f4) kVar).getFocusedView());
                        }
                        if (ws0Var4.c2) {
                            ws0Var4.l0(false);
                        }
                        ws0Var4.q0(ws0Var4.O0);
                        ws0Var4.r0(null, true);
                        break;
                    default:
                        ws0Var.r0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, f6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.t1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(g6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, f6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, f6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new n(0));
        frameLayout.addView(linearLayout, f6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.u1 = textView2;
        textView2.setBackground(g6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i18 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: bg.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        ws0 ws0Var2 = ws0Var;
                        t0 t0Var2 = ws0Var2.S0;
                        if (t0Var2 != null && (t0Var2.getCurrentBrush() instanceof ag.l)) {
                            t0Var2.b();
                            ws0Var2.p1.setSelectedIndex(1);
                            ws0Var2.q((ag.m) ag.m.a.get(0));
                            break;
                        } else {
                            ws0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        ws0 ws0Var3 = ws0Var;
                        t0 t0Var3 = ws0Var3.S0;
                        ag.n2 n2Var2 = ws0Var3.B0;
                        if (n2Var2.a()) {
                            if (t0Var3 != null && (t0Var3.getCurrentBrush() instanceof ag.l)) {
                                t0Var3.b();
                                ws0Var3.p1.setSelectedIndex(1);
                                ws0Var3.q((ag.m) ag.m.a.get(0));
                            }
                            t0Var3.a();
                            n2Var2.c.clear();
                            n2Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            ws0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ws0 ws0Var4 = ws0Var;
                        k kVar = ws0Var4.O0;
                        if (kVar instanceof f4) {
                            AndroidUtilities.hideKeyboard(((f4) kVar).getFocusedView());
                        }
                        if (ws0Var4.c2) {
                            ws0Var4.l0(false);
                        }
                        ws0Var4.q0(ws0Var4.O0);
                        ws0Var4.r0(null, true);
                        break;
                    default:
                        ws0Var.r0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView h = th.h(frameLayout, textView2, f6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.v1 = h;
        h.setBackground(g6.f0(822083583, 7, -1));
        h.setPadding(org.telegram.ui.b.e(8.0f, R.string.Clear, h), 0, AndroidUtilities.dp(8.0f), 0);
        h.setGravity(16);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 16.0f);
        final int i19 = 2;
        h.setOnClickListener(new View.OnClickListener() { // from class: bg.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        ws0 ws0Var2 = ws0Var;
                        t0 t0Var2 = ws0Var2.S0;
                        if (t0Var2 != null && (t0Var2.getCurrentBrush() instanceof ag.l)) {
                            t0Var2.b();
                            ws0Var2.p1.setSelectedIndex(1);
                            ws0Var2.q((ag.m) ag.m.a.get(0));
                            break;
                        } else {
                            ws0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        ws0 ws0Var3 = ws0Var;
                        t0 t0Var3 = ws0Var3.S0;
                        ag.n2 n2Var2 = ws0Var3.B0;
                        if (n2Var2.a()) {
                            if (t0Var3 != null && (t0Var3.getCurrentBrush() instanceof ag.l)) {
                                t0Var3.b();
                                ws0Var3.p1.setSelectedIndex(1);
                                ws0Var3.q((ag.m) ag.m.a.get(0));
                            }
                            t0Var3.a();
                            n2Var2.c.clear();
                            n2Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            ws0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ws0 ws0Var4 = ws0Var;
                        k kVar = ws0Var4.O0;
                        if (kVar instanceof f4) {
                            AndroidUtilities.hideKeyboard(((f4) kVar).getFocusedView());
                        }
                        if (ws0Var4.c2) {
                            ws0Var4.l0(false);
                        }
                        ws0Var4.q0(ws0Var4.O0);
                        ws0Var4.r0(null, true);
                        break;
                    default:
                        ws0Var.r0(null, true);
                        break;
                }
            }
        });
        h.setAlpha(0.0f);
        h.setVisibility(8);
        TextView h10 = th.h(frameLayout, h, f6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.w1 = h10;
        h10.setBackground(g6.f0(822083583, 7, -1));
        h10.setPadding(org.telegram.ui.b.e(8.0f, R.string.Done, h10), 0, AndroidUtilities.dp(8.0f), 0);
        h10.setGravity(16);
        h10.setTextColor(-1);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setTextSize(1, 16.0f);
        final int i20 = 3;
        h10.setOnClickListener(new View.OnClickListener() { // from class: bg.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        ws0 ws0Var2 = ws0Var;
                        t0 t0Var2 = ws0Var2.S0;
                        if (t0Var2 != null && (t0Var2.getCurrentBrush() instanceof ag.l)) {
                            t0Var2.b();
                            ws0Var2.p1.setSelectedIndex(1);
                            ws0Var2.q((ag.m) ag.m.a.get(0));
                            break;
                        } else {
                            ws0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        ws0 ws0Var3 = ws0Var;
                        t0 t0Var3 = ws0Var3.S0;
                        ag.n2 n2Var2 = ws0Var3.B0;
                        if (n2Var2.a()) {
                            if (t0Var3 != null && (t0Var3.getCurrentBrush() instanceof ag.l)) {
                                t0Var3.b();
                                ws0Var3.p1.setSelectedIndex(1);
                                ws0Var3.q((ag.m) ag.m.a.get(0));
                            }
                            t0Var3.a();
                            n2Var2.c.clear();
                            n2Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            ws0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ws0 ws0Var4 = ws0Var;
                        k kVar = ws0Var4.O0;
                        if (kVar instanceof f4) {
                            AndroidUtilities.hideKeyboard(((f4) kVar).getFocusedView());
                        }
                        if (ws0Var4.c2) {
                            ws0Var4.l0(false);
                        }
                        ws0Var4.q0(ws0Var4.O0);
                        ws0Var4.r0(null, true);
                        break;
                    default:
                        ws0Var.r0(null, true);
                        break;
                }
            }
        });
        h10.setAlpha(0.0f);
        h10.setVisibility(8);
        frameLayout.addView(h10, f6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        b1 b1Var = new b1(ws0Var, context);
        this.Y0 = b1Var;
        b1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        b1Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(b1Var, f6.e(-1, 104, 80));
        r2 r2Var = new r2(context, bitmap2 != null);
        this.p1 = r2Var;
        r2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r2Var.setDelegate(this);
        r2Var.setSelectedIndex(1);
        b1Var.addView(r2Var, f6.c(48.0f, -1));
        n2 n2Var2 = new n2(context);
        this.q1 = n2Var2;
        n2Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        n2Var2.setVisibility(8);
        n2Var2.setDelegate(this);
        n2Var2.setAlignment(ag.h1.e(i10).g);
        b1Var.addView(n2Var2, f6.c(48.0f, -1));
        z0 z0Var = new z0(ws0Var, context);
        this.Z0 = z0Var;
        addView(z0Var, f6.c(-1.0f, -1));
        t2 t2Var = new t2(context);
        this.r1 = t2Var;
        t2Var.setVisibility(8);
        t2Var.setOnItemClickListener(new o(ws0Var, 0));
        n2Var2.setTypefaceListView(t2Var);
        z0Var.addView(t2Var, f6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.x1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.x1.setColor(1728053247);
        this.x1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.y1.setColor(g6.v0(g6.G8, this.M1));
        a1 a1Var = new a1(ws0Var, context);
        this.C1 = a1Var;
        a1Var.setVisibility(8);
        a1Var.setColorPalette(ag.h1.e(i10));
        a1Var.setColorListener(new p(ws0Var, 0));
        b1Var.addView(a1Var, f6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        e2 e2Var = new e2(context);
        this.w0 = e2Var;
        e2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        e2Var.setBackground(g6.f0(1090519039, 1, -1));
        b1Var.addView(e2Var, f6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        i2 i2Var = new i2(context);
        this.x0 = i2Var;
        i2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        i2Var.setBackground(g6.f0(1090519039, 1, -1));
        i2Var.setOnClickListener(new q(ws0Var, context, bitmap2, 0));
        b1Var.addView(i2Var, f6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        w2 w2Var = new w2(context);
        this.h1 = w2Var;
        w2Var.setColorSwatch(this.G1);
        w2Var.setRenderView(this.S0);
        w2Var.setValueOverride(this.i1);
        this.G1.c = this.i1.get();
        w2Var.setOnUpdate(new f(ws0Var, i10, 1));
        addView(w2Var, f6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a1 = frameLayout2;
        addView(frameLayout2, f6.c(-1.0f, -1));
        this.F1.setStyle(style);
        this.F1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.G1, null);
        q((ag.m) ag.m.a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static /* synthetic */ void Z(ws0 ws0Var, Integer num) {
        ws0Var.setNewColor(num.intValue());
        ws0Var.w0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: all -> 0x002c, Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:4:0x0003, B:6:0x0022, B:8:0x0026, B:12:0x0036, B:14:0x005a, B:17:0x0061, B:18:0x0068, B:21:0x006d, B:22:0x0077, B:24:0x007d, B:26:0x0091, B:30:0x009b, B:34:0x00a7, B:36:0x00aa, B:41:0x00ad, B:46:0x00b4), top: B:3:0x0003, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(g1 g1Var) {
        ag.i1 i1Var;
        boolean z10;
        Bitmap bitmap = g1Var.A0;
        f8.c cVar = null;
        try {
            try {
                f8.b bVar = new f8.b(g1Var.getContext());
                bVar.c(1);
                bVar.b(1);
                bVar.c = false;
                cVar = bVar.a();
                if (!cVar.c.k()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    cVar.N();
                    return;
                }
                androidx.biometric.e eVar = new androidx.biometric.e(5);
                c8.a aVar = (c8.a) eVar.b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                eVar.d = bitmap;
                aVar.a = width;
                aVar.b = height;
                aVar.c = g1Var.getFrameRotation();
                if (((ByteBuffer) eVar.c) == null && ((Bitmap) eVar.d) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray Q = cVar.Q(eVar);
                    ArrayList arrayList = new ArrayList();
                    bv0 paintingSize = g1Var.getPaintingSize();
                    for (int i10 = 0; i10 < Q.size(); i10++) {
                        f8.a aVar2 = (f8.a) Q.get(Q.keyAt(i10));
                        int i11 = g1Var.k1;
                        if (i11 % 360 != 90 && i11 % 360 != 270) {
                            z10 = false;
                            i1Var = new ag.i1(aVar2, bitmap, paintingSize, z10);
                            if (!(i1Var.d == null)) {
                                arrayList.add(i1Var);
                            }
                        }
                        z10 = true;
                        i1Var = new ag.i1(aVar2, bitmap, paintingSize, z10);
                        if (!(i1Var.d == null)) {
                        }
                    }
                    g1Var.j1 = arrayList;
                    cVar.N();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    cVar.N();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (0 == 0) {
                }
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                cVar.N();
            }
            throw th3;
        }
    }

    public static void b0(g1 g1Var) {
        k kVar;
        x0 x0Var = g1Var.V0;
        k kVar2 = g1Var.O0;
        if (kVar2 != null) {
            PointF A0 = g1Var.A0(kVar2);
            k kVar3 = g1Var.O0;
            if (kVar3 instanceof v3) {
                v3 v3Var = new v3(g1Var.getContext(), (v3) g1Var.O0, A0);
                v3Var.setDelegate(g1Var);
                x0Var.addView(v3Var);
                kVar = v3Var;
            } else if (kVar3 instanceof f4) {
                f4 f4Var = new f4(g1Var.getContext(), (f4) g1Var.O0, A0);
                f4Var.setDelegate(g1Var);
                f4Var.setMaxWidth((int) (g1Var.getPaintingSize().a - 20.0f));
                x0Var.addView(f4Var, f6.c(-2.0f, -2));
                kVar = f4Var;
            } else {
                kVar = null;
            }
            g1Var.p0(kVar);
            g1Var.r0(kVar, true);
        }
        org.telegram.ui.ActionBar.o1 o1Var = g1Var.N1;
        if (o1Var == null || !o1Var.isShowing()) {
            return;
        }
        g1Var.N1.d(true);
    }

    public static void c0(ws0 ws0Var, Integer num) {
        ag.h1 h1Var = ws0Var.R1;
        h1Var.h(num.intValue(), true);
        h1Var.g();
        ws0Var.setNewColor(num.intValue());
        a1 a1Var = ws0Var.C1;
        a1Var.setSelectedColorIndex(h1Var.d());
        a1Var.getAdapter().l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.c1 == 2 ? this.q1 : this.p1;
    }

    private int getFrameRotation() {
        int i10 = this.k1;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private bv0 getPaintingSize() {
        bv0 bv0Var = this.N0;
        if (bv0Var != null) {
            return bv0Var;
        }
        Bitmap bitmap = this.z0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        int i10 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
        bv0 bv0Var2 = new bv0(width, height);
        float f9 = i10;
        bv0Var2.a = f9;
        float floor = (float) Math.floor((f9 * height) / width);
        bv0Var2.b = floor;
        if (floor > f9) {
            bv0Var2.b = f9;
            bv0Var2.a = (float) Math.floor((f9 * width) / height);
        }
        this.N0 = bv0Var2;
        return bv0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i10) {
        ag.k2 k2Var = this.G1;
        int i11 = k2Var.a;
        k2Var.a = i10;
        s0(k2Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new h0(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.Q0 = i10;
        k kVar = this.O0;
        if (kVar instanceof f4) {
            ((f4) kVar).setType(i10);
        }
        ag.h1 e10 = ag.h1.e(this.L1);
        e10.h = i10;
        e10.a.edit().putInt("text_type", i10).apply();
        this.q1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        l0 l0Var = new l0(this, context);
        this.b1 = l0Var;
        l0Var.setClipToPadding(false);
        this.b1.setOrientation(0);
        this.Y0.addView(this.b1, f6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.m1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.m1;
        int i10 = g6.i6;
        i0 i0Var = this.M1;
        textView2.setBackground(g6.f0(g6.v0(i10, i0Var), 7, -1));
        this.m1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.m1.setTextColor(-1);
        this.m1.setTextSize(1, 14.0f);
        this.m1.setGravity(1);
        this.m1.setTypeface(AndroidUtilities.bold());
        this.m1.setSingleLine();
        this.m1.setOnClickListener(new l(this, 0));
        this.b1.addView(this.m1, f6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.n1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.n1.setBackground(g6.f0(g6.v0(i10, i0Var), 7, -1));
        this.n1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.n1.setOnClickListener(new l(this, 1));
        this.n1.setTextColor(-1);
        this.n1.setTextSize(1, 14.0f);
        this.n1.setGravity(1);
        this.n1.setTypeface(AndroidUtilities.bold());
        this.n1.setAlpha(0.6f);
        this.n1.setSingleLine();
        this.b1.addView(this.n1, f6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.o1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.o1.setBackground(g6.f0(g6.v0(i10, i0Var), 7, -1));
        this.o1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.o1.setTextColor(-1);
        this.o1.setTextSize(1, 14.0f);
        this.o1.setGravity(1);
        this.o1.setTypeface(AndroidUtilities.bold());
        this.o1.setAlpha(0.6f);
        this.o1.setSingleLine();
        this.o1.setOnClickListener(new l(this, 4));
        this.b1.addView(this.o1, f6.l(1.0f, 0, -2));
    }

    public static void u0(f4 f4Var, int i10) {
        f4Var.setAlign(i10);
        int i11 = 2;
        f4Var.getEditText().setGravity(i10 != 1 ? i10 != 2 ? 19 : 21 : 17);
        if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i11 = 3;
        }
        f4Var.getEditText().setTextAlignment(i11);
    }

    @Override // bg.q2
    public final void A() {
        y0(new r(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(k kVar) {
        MediaController.CropState cropState = this.D0;
        float f9 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (kVar != null) {
            PointF position = kVar.getPosition();
            return new PointF(position.x + f9, position.y + f9);
        }
        float f10 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF g02 = g0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                x0 x0Var = this.V0;
                if (i10 >= x0Var.getChildCount()) {
                    break;
                }
                View childAt = x0Var.getChildAt(i10);
                if (childAt instanceof k) {
                    PointF position2 = ((k) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - g02.y, 2.0d) + Math.pow(position2.x - g02.x, 2.0d))) < f10) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return g02;
            }
            g02 = new PointF(g02.x + f9, g02.y + f9);
        }
    }

    public final void B0(int i10) {
        if (this.c1 == i10 || this.d1 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.f1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.c1;
        ViewGroup viewGroup = this.q1;
        ViewGroup viewGroup2 = this.p1;
        ViewGroup viewGroup3 = i11 == 0 ? viewGroup2 : i11 == 2 ? viewGroup : null;
        this.d1 = i10;
        ViewGroup viewGroup4 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        int i12 = this.L1;
        ag.h1 e10 = ag.h1.e(i12);
        int i13 = 0;
        boolean z10 = i10 == 2;
        if (e10.l != z10) {
            e10.l = z10;
            if (z10) {
                e10.i(-1, false);
            } else {
                e10.i(e10.a.getInt("brush", 0), false);
            }
        }
        int c3 = ag.h1.e(i12).c();
        ag.k2 k2Var = this.G1;
        k2Var.a = c3;
        s0(k2Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.f1 = duration;
        duration.setInterpolator(jr.f);
        this.f1.addUpdateListener(new s(this, viewGroup3, viewGroup4, i13));
        this.f1.addListener(new m0(this, viewGroup3, viewGroup4, i10, 0));
        this.f1.start();
    }

    public final void C0() {
        int i10 = 0;
        while (true) {
            x0 x0Var = this.V0;
            if (i10 >= x0Var.getChildCount()) {
                return;
            }
            View childAt = x0Var.getChildAt(i10);
            if (childAt != this.O0) {
                if (childAt instanceof k) {
                    k kVar = (k) childAt;
                    if (!kVar.h0 && kVar.f0 <= 0.0f) {
                    }
                }
                i10++;
            }
            ((k) childAt).m();
            i10++;
        }
    }

    @Override // bg.l2
    public final void D() {
        z0(true);
    }

    @Override // org.telegram.ui.Components.gv0
    public final void G(int i10, boolean z10) {
        boolean z11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.d2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.h2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.h2).commit();
            } else {
                this.g2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.g2).commit();
            }
        }
        if (this.c2) {
            int i11 = z10 ? this.h2 : this.g2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.b2.setLayoutParams(layoutParams);
                this.f2 = layoutParams.height;
                requestLayout();
                nh.w3 w3Var = ((ws0) this).k2.G1;
                if (w3Var != null) {
                    w3Var.a();
                }
                getHeight();
            }
        }
        if (this.i2 == i10 && this.j2 == z10) {
            getHeight();
            return;
        }
        this.i2 = i10;
        this.j2 = z10;
        boolean z12 = this.d2;
        k kVar = this.O0;
        if (kVar instanceof f4) {
            this.d2 = ((f4) kVar).getEditText().isFocused() && i10 > 0;
        } else {
            this.d2 = false;
        }
        if (this.d2 && this.c2) {
            x0(0);
        }
        if (this.f2 != 0 && !(z11 = this.d2) && z11 != z12 && !this.c2) {
            this.f2 = 0;
            requestLayout();
            nh.w3 w3Var2 = ((ws0) this).k2.G1;
            if (w3Var2 != null) {
                w3Var2.a();
            }
        }
        getHeight();
    }

    @Override // bg.q2, bg.l2
    public final void a() {
        w0(true);
    }

    @Override // bg.i
    public final void b(k kVar) {
        int[] k02 = k0(kVar);
        y0(new d0(this, kVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    @Override // bg.l2
    public final void d() {
        setTextType((this.Q0 + 1) % 4);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x0 x0Var;
        f4 f4Var;
        String str;
        if (i10 != NotificationCenter.customTypefacesLoaded || (x0Var = this.V0) == null) {
            return;
        }
        for (int i12 = 0; i12 < x0Var.getChildCount(); i12++) {
            View childAt = x0Var.getChildAt(i12);
            if ((childAt instanceof f4) && (str = (f4Var = (f4) childAt).w0) != null) {
                f4Var.setTypeface(str);
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
        y0 y0Var;
        x0 x0Var = this.V0;
        if (view == x0Var) {
            float e10 = this.V1.e(this.S1);
            if (e10 > 0.0f) {
                float dp = AndroidUtilities.dp(24.0f * e10);
                int l1 = g6.l1(e10, 1090519039);
                Paint paint = this.W1;
                paint.setShadowLayer(dp, 0.0f, 0.0f, l1);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(x0Var.getX(), x0Var.getY());
                canvas.scale(x0Var.getScaleX(), x0Var.getScaleY(), x0Var.getWidth() / 2.0f, x0Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, x0Var.getWidth(), x0Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, x0Var.getWidth(), x0Var.getHeight(), this.X1);
                canvas.restore();
                if ((view != this.S0 || view == this.T0 || ((view == x0Var && x0Var.getClipChildren()) || (view == (y0Var = this.U0) && y0Var.getClipChildren()))) && (cropState = this.D0) != null) {
                    canvas.save();
                    r10 = this.R0 ? 0 : AndroidUtilities.statusBarHeight;
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + r10;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    i10 = cropState.transformRotation;
                    if (i10 != 90 || i10 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
                    int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
                    float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.H0;
                    float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.f2) - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r10 + this.I0;
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
        if (view != this.S0) {
        }
        canvas.save();
        if (this.R0) {
        }
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + r10;
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        i10 = cropState.transformRotation;
        if (i10 != 90) {
        }
        measuredHeight2 = measuredWidth2;
        measuredWidth2 = measuredHeight2;
        int scaleX2 = (int) ((view.getScaleX() * (measuredWidth2 * cropState.cropPw)) / cropState.cropScale);
        int scaleY2 = (int) ((view.getScaleY() * (measuredHeight2 * cropState.cropPh)) / cropState.cropScale);
        float ceil2 = ((float) Math.ceil((getMeasuredWidth() - scaleX2) / 2.0f)) + this.H0;
        float additionalBottom2 = (((getAdditionalBottom() + (((getMeasuredHeight() - this.f2) - currentActionBarHeight2) - AndroidUtilities.dp(48.0f))) - scaleY2) / 2.0f) + AndroidUtilities.dp(8.0f) + r10 + this.I0;
        canvas.clipRect(Math.max(0.0f, ceil2), Math.max(0.0f, additionalBottom2), Math.min(ceil2 + scaleX2, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom2 + scaleY2));
        r10 = 1;
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        if (r10 != 0) {
        }
        return drawChild2;
    }

    @Override // org.telegram.ui.Components.hv0, org.telegram.ui.ActionBar.x5
    public final void e() {
        this.K1.setColor(-15132391);
    }

    @Override // bg.l2
    public final void f(int i10) {
        k kVar = this.O0;
        if (kVar instanceof f4) {
            u0((f4) kVar, i10);
            ag.h1 e10 = ag.h1.e(this.L1);
            e10.g = i10;
            e10.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new a1.e(11, this, (y2) view)).start();
    }

    public final PointF g0() {
        bv0 paintingSize = getPaintingSize();
        float f9 = paintingSize.a / 2.0f;
        float f10 = paintingSize.b / 2.0f;
        if (this.D0 != null) {
            double radians = (float) Math.toRadians(-(r2.transformRotation + r2.cropRotate));
            float cos = (float) ((Math.cos(radians) * r2.cropPx) - (Math.sin(radians) * r2.cropPy));
            float b10 = (float) j7.l1.b(radians, r2.cropPy, Math.sin(radians) * r2.cropPx);
            f9 -= cos * paintingSize.a;
            f10 -= b10 * paintingSize.b;
        }
        return new PointF(f9, f10);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.w0;
    }

    @Override // org.telegram.ui.Components.iv0, org.telegram.ui.Components.hv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.x0;
    }

    public long getLcm() {
        return this.l1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        y5[] y5VarArr;
        x0 x0Var = this.V0;
        int childCount = x0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = x0Var.getChildAt(i10);
            if (childAt instanceof v3) {
                TLRPC.Document sticker = ((v3) childAt).getSticker();
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
            } else if (childAt instanceof f4) {
                CharSequence text = ((f4) childAt).getText();
                if ((text instanceof Spanned) && (y5VarArr = (y5[]) ((Spanned) text).getSpans(0, text.length(), y5.class)) != null) {
                    for (y5 y5Var : y5VarArr) {
                        if (y5Var != null) {
                            TLRPC.Document document = y5Var.document;
                            if (document == null) {
                                document = p5.f(this.L1, y5Var.getDocumentId());
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
        return this.y0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public ag.t1 getRenderView() {
        return this.S0;
    }

    public float getSelectedEntityBottom() {
        k kVar = this.O0;
        x0 x0Var = this.V0;
        if (kVar == null) {
            return getY() + x0Var.getMeasuredHeight();
        }
        kVar.getLocationInWindow(new int[2]);
        return (x0Var.getScaleY() * this.O0.getHeight()) + r2[1];
    }

    public p01 getThanosEffect() {
        if (!p01.c()) {
            return null;
        }
        if (this.W0 == null) {
            p01 p01Var = new p01(getContext(), new r(this, 0));
            this.W0 = p01Var;
            addView(p01Var);
        }
        return this.W0;
    }

    public final y2 h0(String str, boolean z10) {
        float f9;
        bv0 bv0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f9 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            FileLog.e(e10);
            f9 = 1.0f;
        }
        x0 x0Var = this.V0;
        if (f9 > 1.0f) {
            float floor = (float) Math.floor(x0Var.getMeasuredWidth() * 0.5d);
            bv0Var = new bv0(floor, floor / f9);
        } else {
            float floor2 = (float) Math.floor(x0Var.getMeasuredHeight() * 0.5d);
            bv0Var = new bv0(f9 * floor2, floor2);
        }
        bv0 bv0Var2 = bv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = bv0Var2.a;
            bv0Var2.a = bv0Var2.b;
            bv0Var2.b = f10;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        y2 y2Var = new y2(context, g02, bv0Var2, str, intValue);
        y2Var.setDelegate(this);
        x0Var.addView(y2Var);
        if (z10) {
            p0(y2Var);
            r0(y2Var, true);
        }
        return y2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q0 i0(Object obj, TLRPC.Document document, boolean z10) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f9;
        f1 f1Var;
        double d;
        f1 f1Var2;
        PointF pointF;
        boolean isTextColorEmoji;
        ArrayList arrayList;
        ag.i1 i1Var;
        f1 f1Var3;
        int i10;
        float f10;
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
        float f11 = 0.75f;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f9 = -(cropState.transformRotation + cropState.cropRotate);
            f11 = 0.75f / cropState.cropScale;
        } else {
            f9 = 0.0f;
        }
        f1 f1Var4 = new f1(g0(), f11, f9);
        x0 x0Var = this.V0;
        if (tL_maskCoords == null || (arrayList = this.j1) == null || arrayList.size() == 0) {
            f1Var = f1Var4;
            d = 0.5d;
        } else {
            int i12 = tL_maskCoords.n;
            long j10 = document.id;
            if (i12 >= 0 && i12 <= 3 && !this.j1.isEmpty()) {
                int size = this.j1.size();
                int nextInt = Utilities.random.nextInt(size);
                int i13 = size;
                loop1: while (i13 > 0) {
                    ag.i1 i1Var2 = (ag.i1) this.j1.get(nextInt);
                    if (i1Var2.a(i12) != null) {
                        d = 0.5d;
                        float f12 = i1Var2.a * 1.1f;
                        int i14 = 0;
                        while (i14 < x0Var.getChildCount()) {
                            View childAt = x0Var.getChildAt(i14);
                            ag.i1 i1Var3 = i1Var2;
                            if (childAt instanceof v3) {
                                v3 v3Var = (v3) childAt;
                                if (v3Var.getAnchor() == i12) {
                                    PointF position = v3Var.getPosition();
                                    f1Var3 = f1Var4;
                                    i10 = size;
                                    f10 = f12;
                                    float hypot = (float) Math.hypot(position.x - r4.x, position.y - r4.y);
                                    if ((j10 == v3Var.getSticker().id || this.j1.size() > 1) && hypot < f10) {
                                        break;
                                    }
                                    i14++;
                                    i1Var2 = i1Var3;
                                    f1Var4 = f1Var3;
                                    size = i10;
                                    f12 = f10;
                                }
                            }
                            f1Var3 = f1Var4;
                            i10 = size;
                            f10 = f12;
                            i14++;
                            i1Var2 = i1Var3;
                            f1Var4 = f1Var3;
                            size = i10;
                            f12 = f10;
                        }
                        f1Var = f1Var4;
                        i1Var = i1Var2;
                        break loop1;
                    }
                    f1Var3 = f1Var4;
                    i10 = size;
                    nextInt = (nextInt + 1) % i10;
                    i13--;
                    f1Var4 = f1Var3;
                    size = i10;
                }
            }
            f1Var = f1Var4;
            d = 0.5d;
            i1Var = null;
            if (i1Var != null) {
                PointF a2 = i1Var.a(i12);
                float f13 = i12 == 1 ? i1Var.e : i1Var.a;
                float f14 = i1Var.b;
                float floor = (float) ((f13 / ((float) Math.floor(getPaintingSize().a * d))) * tL_maskCoords.zoom);
                double radians = (float) Math.toRadians(f14);
                double d10 = 1.5707963267948966d - radians;
                double d11 = f13;
                float sin = (float) (Math.sin(d10) * d11 * tL_maskCoords.x);
                float cos = (float) (Math.cos(d10) * d11 * tL_maskCoords.x);
                double d12 = radians + 1.5707963267948966d;
                f1Var2 = new f1(new PointF(a2.x + sin + ((float) (Math.cos(d12) * d11 * tL_maskCoords.y)), a2.y + cos + ((float) (Math.sin(d12) * d11 * tL_maskCoords.y))), floor, f14);
                Context context = getContext();
                float floor2 = (float) Math.floor(getPaintingSize().a * d);
                bv0 bv0Var = new bv0(floor2, floor2);
                pointF = f1Var2.a;
                q0 q0Var = new q0(this, context, pointF, f1Var2.c, f1Var2.b, bv0Var, document, obj);
                isTextColorEmoji = MessageObject.isTextColorEmoji(document);
                ImageReceiver imageReceiver = q0Var.t0;
                if (isTextColorEmoji) {
                    imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                imageReceiver.setLayerNum(12);
                if (pointF.x == x0Var.getMeasuredWidth() / 2.0f) {
                    q0Var.setStickyX(2);
                }
                if (pointF.y == x0Var.getMeasuredHeight() / 2.0f) {
                    q0Var.setStickyY(2);
                }
                q0Var.setDelegate(this);
                x0Var.addView(q0Var);
                if (z10) {
                    p0(q0Var);
                    r0(q0Var, true);
                }
                return q0Var;
            }
        }
        f1Var2 = f1Var;
        Context context2 = getContext();
        float floor22 = (float) Math.floor(getPaintingSize().a * d);
        bv0 bv0Var2 = new bv0(floor22, floor22);
        pointF = f1Var2.a;
        q0 q0Var2 = new q0(this, context2, pointF, f1Var2.c, f1Var2.b, bv0Var2, document, obj);
        isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver2 = q0Var2.t0;
        if (isTextColorEmoji) {
        }
        imageReceiver2.setLayerNum(12);
        if (pointF.x == x0Var.getMeasuredWidth() / 2.0f) {
        }
        if (pointF.y == x0Var.getMeasuredHeight() / 2.0f) {
        }
        q0Var2.setDelegate(this);
        x0Var.addView(q0Var2);
        if (z10) {
        }
        return q0Var2;
    }

    public final f4 j0(boolean z10) {
        ((ws0) this).k2.c0.isFocusable();
        bv0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        f4 f4Var = new f4(getContext(), A0, (int) (paintingSize.a / 9.0f), "", this.G1, this.Q0);
        float f9 = paintingSize.a / 9.0f;
        r rVar = new r(this, 2);
        f4Var.s0 = (int) (0.5f * f9);
        f4Var.t0 = (int) (f9 * 2.0f);
        f4Var.u0 = rVar;
        float f10 = A0.x;
        x0 x0Var = this.V0;
        if (f10 == x0Var.getMeasuredWidth() / 2.0f) {
            f4Var.setStickyX(2);
        }
        if (A0.y == x0Var.getMeasuredHeight() / 2.0f) {
            f4Var.setStickyY(2);
        }
        f4Var.setDelegate(this);
        f4Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i10 = this.L1;
        f4Var.setTypeface(ag.h1.e(i10).j);
        f4Var.setType(ag.h1.e(i10).h);
        x0Var.addView(f4Var, f6.c(-2.0f, -2));
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f4Var.j(1.0f / cropState.cropScale);
            f4Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            p0(f4Var);
            f4Var.q();
            r0(f4Var, false);
            f4Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(f4Var.getFocusedView());
            this.P0 = true;
            int i11 = ag.h1.e(i10).g;
            n2 n2Var = this.q1;
            n2Var.d(i11, true);
            n2Var.setOutlineType(ag.h1.e(i10).h);
        }
        return f4Var;
    }

    public final int[] k0(k kVar) {
        float[] fArr = this.Z1;
        fArr[0] = kVar.getWidth() / 2.0f;
        fArr[1] = kVar.getHeight() / 2.0f;
        kVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + kVar.getLeft();
        fArr[1] = fArr[1] + kVar.getTop();
        Object parent = kVar.getParent();
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
        int[] iArr = this.a2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        float f9 = iArr[0];
        Point point = AndroidUtilities.displaySize;
        float f10 = round2 - (point.y / 2.0f);
        double d = f9 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d10 = f10;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) j7.l1.b(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final boolean l(MotionEvent motionEvent) {
        if (this.O0 != null) {
            r0(null, true);
        }
        float x4 = motionEvent.getX();
        t0 t0Var = this.S0;
        float translationX = ((x4 - t0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / t0Var.getScaleX();
        float y8 = ((((motionEvent.getY() - t0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / t0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-t0Var.getRotation());
        double d10 = y8;
        float measuredWidth = (t0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (t0Var.getMeasuredHeight() / 2.0f) + ((float) j7.l1.b(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        t0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void l0(boolean z10) {
        int i10 = 0;
        if (this.c2) {
            x0(0);
        }
        if (z10) {
            fz fzVar = this.b2;
            if (fzVar == null || fzVar.getVisibility() != 0) {
                m0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.b2.getMeasuredHeight());
            ofFloat.addUpdateListener(new t(this, i10));
            this.e2 = true;
            ofFloat.addListener(new r0(this, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            ofFloat.start();
        }
    }

    public final void m0() {
        fz fzVar;
        nh.w3 w3Var;
        if (this.f2 > 0 && (w3Var = ((ws0) this).k2.G1) != null) {
            w3Var.a();
        }
        if (!this.c2 && (fzVar = this.b2) != null && fzVar.getVisibility() != 8) {
            this.b2.setVisibility(8);
        }
        this.f2 = 0;
    }

    public final void n0(boolean z10) {
        if (this.c1 == 0) {
            this.h1.setLayerType(z10 ? 2 : 0, null);
            this.Y0.setLayerType(z10 ? 2 : 0, null);
            this.X0.setLayerType(z10 ? 2 : 0, null);
        }
    }

    public final boolean o0() {
        if (this.H1) {
            w0(false);
            return true;
        }
        if (this.c2) {
            l0(true);
            return true;
        }
        if (!this.P0) {
            return false;
        }
        r0(null, true);
        return true;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.iv0, org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (this.b2 != null) {
            int measuredHeight = AndroidUtilities.isTablet() ? i15 - this.b2.getMeasuredHeight() : (R() + i15) - this.b2.getMeasuredHeight();
            fz fzVar = this.b2;
            fzVar.layout(0, measuredHeight, fzVar.getMeasuredWidth(), this.b2.getMeasuredHeight() + measuredHeight);
        }
        int i16 = this.R0 ? 0 : AndroidUtilities.statusBarHeight;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i16;
        t0 t0Var = this.S0;
        int ceil = (int) Math.ceil((i14 - t0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.x3.C(8.0f, (((i15 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - t0Var.getMeasuredHeight()) / 2, i16);
        t0Var.layout(ceil, additionalTop, t0Var.getMeasuredWidth() + ceil, t0Var.getMeasuredHeight() + additionalTop);
        v0 v0Var = this.T0;
        v0Var.layout(ceil, additionalTop, v0Var.getMeasuredWidth() + ceil, v0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = t0Var.getMeasuredWidth();
        x0 x0Var = this.V0;
        int measuredWidth2 = ((measuredWidth - x0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight2 = ((t0Var.getMeasuredHeight() - x0Var.getMeasuredHeight()) / 2) + additionalTop;
        x0Var.layout(measuredWidth2, measuredHeight2, x0Var.getMeasuredWidth() + measuredWidth2, x0Var.getMeasuredHeight() + measuredHeight2);
        p01 p01Var = this.W0;
        if (p01Var != null) {
            p01Var.layout(measuredWidth2, measuredHeight2, x0Var.getMeasuredWidth() + measuredWidth2, x0Var.getMeasuredHeight() + measuredHeight2);
        }
        y0 y0Var = this.U0;
        y0Var.layout(ceil, additionalTop, y0Var.getMeasuredWidth() + ceil, y0Var.getMeasuredHeight() + additionalTop);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f9;
        this.L0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.z0;
        if (bitmap != null) {
            f9 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f9 = size;
        }
        float f10 = size;
        float floor = (float) Math.floor((f10 * currentActionBarHeight) / f9);
        float f11 = currentActionBarHeight2;
        if (floor > f11) {
            f10 = (float) Math.floor((f9 * f11) / currentActionBarHeight);
            floor = f11;
        }
        int i12 = (int) f10;
        int i13 = (int) floor;
        this.S0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        this.T0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        float f12 = f10 / this.N0.a;
        this.M0 = f12;
        x0 x0Var = this.V0;
        x0Var.setScaleX(f12);
        x0Var.setScaleY(this.M0);
        x0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.N0.b, TLObject.FLAG_30));
        p01 p01Var = this.W0;
        if (p01Var != null) {
            p01Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.N0.b, TLObject.FLAG_30));
            this.W0.setScaleX(this.M0);
            this.W0.setScaleY(this.M0);
        }
        C0();
        this.U0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        measureChild(this.Y0, i10, i11);
        measureChild(this.h1, i10, i11);
        measureChild(this.a1, i10, i11);
        measureChild(this.Z0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f2), TLObject.FLAG_30));
        FrameLayout frameLayout = this.X0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.L0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.c2 && !this.e2) {
            this.L0 = true;
            m0();
            this.L0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        fz fzVar = this.b2;
        if (fzVar != null) {
            measureChild(fzVar, i10, i11);
        }
    }

    @Override // bg.i
    public final /* synthetic */ boolean p() {
        return true;
    }

    public final void p0(k kVar) {
        if (kVar == null) {
            return;
        }
        this.B0.b(kVar.getUUID(), new d0(this, kVar, 0));
    }

    @Override // bg.q2
    public final void q(ag.m mVar) {
        boolean z10 = mVar instanceof ag.b;
        w2 w2Var = this.h1;
        if (z10 || (mVar instanceof ag.d)) {
            w2Var.b(0.4f, 1.75f);
        } else {
            w2Var.b(0.05f, 1.0f);
        }
        w2Var.setDrawCenter(!(mVar instanceof ag.l));
        t0 t0Var = this.S0;
        if (t0Var.getCurrentBrush() instanceof ag.l) {
            this.g1 = true;
        }
        t0Var.setBrush(mVar);
        ag.k2 k2Var = this.G1;
        int i10 = k2Var.a;
        k2Var.a = ag.h1.e(this.L1).c();
        k2Var.c = this.i1.get();
        s0(k2Var, Integer.valueOf(i10));
        this.T0.invalidate();
    }

    public final void q0(k kVar) {
        k kVar2 = this.O0;
        if (kVar == kVar2 && kVar2 != null) {
            kVar2.l(kVar2.i0, false);
            this.O0 = null;
            if (kVar instanceof f4) {
                ValueAnimator valueAnimator = this.f1;
                if (valueAnimator != null && this.d1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.V0.removeView(kVar);
        if (kVar != null) {
            UUID uuid = kVar.getUUID();
            ag.n2 n2Var = this.B0;
            n2Var.b.remove(uuid);
            n2Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new a4.g(n2Var, 4));
        }
        w2 w2Var = this.h1;
        za.c cVar = this.i1;
        w2Var.setValueOverride(cVar);
        w2Var.setShowPreview(true);
        float f9 = cVar.get();
        ag.k2 k2Var = this.G1;
        k2Var.c = f9;
        s0(k2Var, null);
    }

    @Override // bg.i
    public final boolean r() {
        return !this.P0;
    }

    public final boolean r0(k kVar, boolean z10) {
        g1 g1Var;
        boolean z11;
        int i10;
        boolean z12 = kVar instanceof f4;
        int i11 = 2;
        if (z12 && (((i10 = this.d1) == -1 && this.c1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.H1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            f4 f4Var = (f4) kVar;
            int gravity = f4Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            n2 n2Var = this.q1;
            n2Var.setAlignment(i11);
            n2Var.setTypeface(f4Var.getTypeface().a);
            n2Var.e(f4Var.getType(), true);
            this.Z0.invalidate();
        }
        k kVar2 = this.O0;
        if (kVar2 == null) {
            g1Var = this;
            z11 = false;
        } else {
            if (kVar2 == kVar) {
                if (!this.P0) {
                    int[] k02 = k0(kVar2);
                    y0(new d0(this, kVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (kVar2 instanceof f4) {
                    AndroidUtilities.showKeyboard(((f4) kVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            g1Var = this;
            kVar2.l(kVar2.i0, false);
            k kVar3 = g1Var.O0;
            if (kVar3 instanceof f4) {
                f4 f4Var2 = (f4) kVar3;
                d4 d4Var = f4Var2.m0;
                d4Var.clearFocus();
                d4Var.setEnabled(false);
                d4Var.setClickable(false);
                f4Var2.m();
                if (!z12) {
                    g1Var.P0 = false;
                    AndroidUtilities.hideKeyboard(((f4) g1Var.O0).getFocusedView());
                    l0(false);
                }
            }
            z11 = true;
        }
        k kVar4 = g1Var.O0;
        g1Var.O0 = kVar;
        if ((kVar4 instanceof f4) && TextUtils.isEmpty(((f4) kVar4).getText())) {
            q0(kVar4);
        }
        k kVar5 = g1Var.O0;
        za.c cVar = g1Var.i1;
        ag.k2 k2Var = g1Var.G1;
        w2 w2Var = g1Var.h1;
        if (kVar5 == null) {
            ValueAnimator valueAnimator2 = g1Var.f1;
            if (valueAnimator2 != null && g1Var.d1 != 0) {
                valueAnimator2.cancel();
            }
            if (g1Var.H1) {
                w0(false);
            }
            B0(0);
            w2Var.setValueOverride(cVar);
            w2Var.setShowPreview(true);
            k2Var.c = cVar.get();
            s0(k2Var, null);
            return z11;
        }
        y0 y0Var = g1Var.U0;
        kVar5.i0 = y0Var;
        kVar5.l(y0Var, true);
        g1Var.V0.bringChildToFront(g1Var.O0);
        k kVar6 = g1Var.O0;
        if (!(kVar6 instanceof f4)) {
            w2Var.setValueOverride(cVar);
            w2Var.setShowPreview(true);
            k2Var.c = cVar.get();
            s0(k2Var, null);
            return true;
        }
        f4 f4Var3 = (f4) kVar6;
        f4Var3.v0 = false;
        f4Var3.getSwatch().c = k2Var.c;
        s0(f4Var3.getSwatch(), null);
        w2Var.setValueOverride(new k0(f4Var3, (int) (g1Var.N0.a / 9.0f), 0));
        w2Var.setShowPreview(false);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.L0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(ag.k2 k2Var, Integer num) {
        ag.k2 k2Var2 = this.G1;
        if (k2Var2 != k2Var) {
            k2Var2.a = k2Var.a;
            k2Var2.b = k2Var.b;
            k2Var2.c = k2Var.c;
            int i10 = this.L1;
            ag.h1.e(i10).h(k2Var.a, true);
            ag.h1.e(i10).j(k2Var.c);
        }
        int i11 = k2Var.a;
        t0 t0Var = this.S0;
        t0Var.setColor(i11);
        t0Var.setBrushSize(k2Var.c);
        int i12 = k2Var2.a;
        if (num == null || num.intValue() == i12) {
            b1 b1Var = this.Y0;
            if (b1Var != null) {
                b1Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new u(this, num, i12, 0));
            duration.start();
        }
        k kVar = this.O0;
        if (kVar instanceof f4) {
            ((f4) kVar).setSwatch(new ag.k2(k2Var.b, k2Var.c, k2Var.a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(ng.d dVar) {
        dVar.o(AndroidUtilities.dp(4.0f));
        this.Y1 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.S1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f9) {
        if (this.c1 == 0) {
            this.h1.setTranslationX(f9);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.Q1 = runnable;
    }

    @Override // bg.i
    public final int[] t(k kVar) {
        return k0(kVar);
    }

    public final void t0(float f9) {
        this.y0 = f9;
        this.X0.setTranslationY(-f9);
        this.Y0.setTranslationY(f9);
    }

    @Override // bg.l2
    public final void u() {
        nh.w3 w3Var;
        if (!this.d2 && !this.c2) {
            j0(true);
            return;
        }
        boolean z10 = this.c2;
        if (z10 && (w3Var = ((ws0) this).k2.G1) != null) {
            w3Var.e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            k kVar = this.O0;
            if (kVar instanceof f4) {
                AndroidUtilities.showKeyboard(((f4) kVar).getEditText());
            }
        }
    }

    @Override // bg.i
    public final void v(float f9, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f9 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) j7.l1.b(radians, d10, Math.sin(radians) * d));
    }

    public final void v0(float f9, float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        float f17;
        this.E0 = f9;
        this.J0 = f12;
        this.K0 = f13;
        this.F0 = f10;
        this.G0 = f11;
        this.H0 = f10;
        float f18 = f11 + 0.0f;
        this.I0 = f18;
        int i10 = 0;
        while (i10 < 4) {
            View view = i10 == 0 ? this.V0 : i10 == 1 ? this.U0 : i10 == 2 ? this.S0 : this.T0;
            MediaController.CropState cropState = this.D0;
            if (cropState != null) {
                float f19 = cropState.cropScale * 1.0f;
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
                float max = Math.max(f12 / ((int) (cropState.cropPw * r12)), f13 / ((int) (cropState.cropPh * r13)));
                f14 = f19 * max;
                float C = com.google.android.recaptcha.internal.a.C(cropState.cropPx, measuredWidth, f9, max);
                float f20 = cropState.cropScale;
                f15 = (C * f20) + f10;
                f16 = (cropState.cropPy * measuredHeight * f9 * max * f20) + f18;
                f17 = cropState.cropRotate + i11;
            } else {
                f14 = i10 == 0 ? this.M0 * 1.0f : 1.0f;
                f15 = f10;
                f16 = f18;
                f17 = 0.0f;
            }
            float f21 = ((-this.f2) / 2.0f) + f16;
            float f22 = f9 * f14;
            if (Float.isNaN(f22)) {
                f22 = 1.0f;
            }
            view.setScaleX(f22);
            view.setScaleY(f22);
            view.setTranslationX(f15);
            view.setTranslationY(f21);
            view.setRotation(f17);
            view.invalidate();
            i10++;
        }
        C0();
        invalidate();
    }

    @Override // bg.q2
    public final ag.h1 w() {
        return ag.h1.e(this.L1);
    }

    public final void w0(final boolean z10) {
        if (this.H1 != z10) {
            this.H1 = z10;
            o1.k kVar = this.I1;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = new o1.k(new ib.a(z10 ? 0.0f : 1000.0f));
            this.I1 = kVar2;
            o1.l lVar = new o1.l();
            lVar.i = z10 ? 1000.0f : 0.0f;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.u = lVar;
            int i10 = 1;
            final boolean[] zArr = {this.d2 || this.c2};
            final float translationY = this.Y0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.I1.b(new o1.h() { // from class: bg.e0
                @Override // o1.h
                public final void a(o1.i iVar, float f9, float f10) {
                    g1 g1Var = g1.this;
                    b1 b1Var = g1Var.Y0;
                    float f11 = f9 / 1000.0f;
                    g1Var.J1 = f11;
                    float f12 = ((1.0f - f11) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(g1Var.J1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(g1Var.J1, 0.25f) / 0.25f));
                    a1 a1Var = g1Var.C1;
                    float f13 = g1Var.J1;
                    boolean z11 = z10;
                    a1Var.y1(f13, z11);
                    g1Var.x0.setProgress(g1Var.J1);
                    g1Var.w0.setProgress(g1Var.J1);
                    g1Var.b1.setTranslationY(AndroidUtilities.dp(32.0f) * g1Var.J1);
                    if (zArr[0]) {
                        float f14 = g1Var.J1;
                        if (!z11) {
                            f14 = 1.0f - f14;
                        }
                        b1Var.setTranslationY(translationY - ((AndroidUtilities.dp(40.0f) * f14) * (z11 ? 1 : -1)));
                    }
                    b1Var.invalidate();
                    if (view == g1Var.q1) {
                        g1Var.Z0.invalidate();
                    }
                }
            });
            this.I1.a(new a0(this, z10, i10));
            this.I1.f();
            if (z10) {
                a1 a1Var = this.C1;
                a1Var.setVisibility(0);
                a1Var.setSelectedColorIndex(ag.h1.e(this.L1).d());
            }
        }
    }

    public final void x0(int i10) {
        n2 n2Var = this.q1;
        int i11 = 0;
        int i12 = 1;
        if (i10 != 1) {
            tg emojiButton = n2Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(rg.e, true);
            }
            fz fzVar = this.b2;
            if (fzVar != null) {
                this.c2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    fzVar.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f2 = 0;
            }
            nh.w3 w3Var = ((ws0) this).k2.G1;
            if (w3Var != null) {
                w3Var.a();
            }
            requestLayout();
            getHeight();
            return;
        }
        fz fzVar2 = this.b2;
        boolean z10 = fzVar2 != null && fzVar2.getVisibility() == 0;
        fz fzVar3 = this.b2;
        if (fzVar3 != null && fzVar3.Y0 != UserConfig.selectedAccount) {
            removeView(fzVar3);
            this.b2 = null;
        }
        if (this.b2 == null) {
            fz fzVar4 = new fz(null, true, false, false, getContext(), false, null, null, true, this.M1, false, false);
            this.b2 = fzVar4;
            fzVar4.Q0 = true;
            fzVar4.setVisibility(8);
            if (AndroidUtilities.isTablet()) {
                this.b2.setForseMultiwindowLayout(true);
            }
            this.b2.setDelegate(new s0(this));
            addView(this.b2);
        }
        this.b2.setVisibility(0);
        this.c2 = true;
        fz fzVar5 = this.b2;
        if (this.g2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.g2 = AndroidUtilities.dp(150.0f);
            } else {
                this.g2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
        }
        if (this.h2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.h2 = AndroidUtilities.dp(150.0f);
            } else {
                this.h2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
        }
        Point point = AndroidUtilities.displaySize;
        int i13 = point.x > point.y ? this.h2 : this.g2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fzVar5.getLayoutParams();
        layoutParams.height = i13;
        fzVar5.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            k kVar = this.O0;
            if (kVar instanceof f4) {
                AndroidUtilities.hideKeyboard(((f4) kVar).getEditText());
            }
        }
        this.f2 = i13;
        requestLayout();
        nh.w3 w3Var2 = ((ws0) this).k2.G1;
        if (w3Var2 != null) {
            w3Var2.a();
        }
        tg emojiButton2 = n2Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(rg.d, true);
        }
        getHeight();
        if (z10 || this.d2) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f2, 0.0f);
        ofFloat.addUpdateListener(new t(this, i12));
        ofFloat.addListener(new r0(this, i11));
        ofFloat.start();
    }

    @Override // bg.i
    public final boolean y(k kVar) {
        return r0(kVar, true);
    }

    public final void y0(Runnable runnable, g1 g1Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.o1 o1Var = this.N1;
        if (o1Var != null && o1Var.isShowing()) {
            this.N1.d(true);
            return;
        }
        if (this.O1 == null) {
            this.P1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.M1);
            this.O1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.O1.setBackgroundColor(-14145495);
            this.O1.setOnTouchListener(new w(this, 0));
            this.O1.setDispatchKeyEventListener(new x(this));
            this.O1.setShownFromBottom(true);
        }
        this.O1.d();
        runnable.run();
        if (this.N1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.O1, -2, -2);
            this.N1 = o1Var2;
            o1Var2.b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.N1.setOutsideTouchable(true);
            this.N1.setClippingEnabled(true);
            this.N1.setInputMethodMode(2);
            this.N1.setSoftInputMode(0);
            this.N1.getContentView().setFocusableInTouchMode(true);
            this.N1.setOnDismissListener(new y(this, 0));
        }
        this.O1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.N1.setFocusable(true);
        this.N1.showAtLocation(g1Var, i10, i11 - (this.O1.getMeasuredWidth() / 2), i12 - this.O1.getMeasuredHeight());
        org.telegram.ui.ActionBar.o1.i(this.O1);
    }

    public final void z0(boolean z10) {
        if (this.A1 != z10) {
            this.A1 = z10;
            o1.k kVar = this.B1;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = new o1.k(new ib.a(z10 ? 0.0f : 1000.0f));
            this.B1 = kVar2;
            o1.l lVar = new o1.l();
            lVar.i = z10 ? 1000.0f : 0.0f;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.u = lVar;
            if (z10) {
                t2 t2Var = this.r1;
                t2Var.setAlpha(0.0f);
                t2Var.setVisibility(0);
            }
            int i10 = 0;
            this.B1.b(new z(i10, this));
            this.B1.a(new a0(this, z10, i10));
            this.B1.f();
        }
    }

    @Override // bg.i
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // bg.i
    public final /* synthetic */ void C() {
    }

    @Override // bg.i
    public final /* synthetic */ void g(boolean z10) {
    }

    public View getView() {
        return this;
    }

    @Override // bg.i
    public final /* synthetic */ void h(boolean z10) {
    }

    @Override // bg.i
    public final /* synthetic */ void j() {
    }

    @Override // bg.i
    public final /* synthetic */ void k() {
    }

    @Override // bg.i
    public final /* synthetic */ void m(boolean z10) {
    }

    @Override // bg.i
    public final /* synthetic */ void x() {
    }
}
