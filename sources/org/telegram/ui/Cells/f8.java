package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import ci.ec;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.lc;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView E;
    public final TextView F;
    public final vg.o0 G;
    public final ImageView H;
    public AnimatorSet I;
    public final int a;
    public final ec b;
    public final TextView c;
    public final org.telegram.ui.Components.k9 d;
    public final wo e;
    public boolean f;
    public final ImageView h;
    public final ImageView n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public final Rect w;
    public boolean x;
    public final FrameLayout y;

    public f8(Context context, int i3) {
        super(context);
        this.w = new Rect();
        this.a = i3;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.d = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setLayerNum(1);
        boolean z10 = bd.a0;
        addView(k9Var, mf.d(40, 40.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 13.0f, 9.0f, z10 ? 13.0f : 0.0f, 0.0f));
        if (i3 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i3 != 3) {
                int i10 = org.telegram.ui.ActionBar.k6.Ji;
                y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
                imageView.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
            }
            if (i3 == 1) {
                int i11 = org.telegram.ui.ActionBar.k6.Ii;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.r6.t(imageView, i11, null, mode);
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(bd.M0(2131754839, null));
                addView(imageView, mf.e(40, 40, (bd.a0 ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                org.telegram.ui.ActionBar.r6.t(imageView2, i11, null, mode);
                addView(imageView2, mf.h(58.0f, 58.0f, 8388613));
                wo woVar = new wo(21, context, null);
                this.e = woVar;
                woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
                woVar.setDrawUnchecked(false);
                woVar.setDrawBackgroundAsArc(3);
                addView(woVar, mf.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i3 == 3) {
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.floating_check);
                boolean z11 = bd.a0;
                addView(imageView, mf.d(40, 40.0f, (z11 ? 3 : 5) | 48, z11 ? 10 : 0, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(bd.M0(2131754486, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i12);
        int i13 = org.telegram.ui.ActionBar.k6.Ei;
        y d = org.telegram.ui.ActionBar.y5.d(v02, org.telegram.ui.ActionBar.k6.v0(i13), 14.0f);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i13);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.r6.k(textView, d, N2, N3, null);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new z7(this, 0));
        frameLayout.addView(textView, mf.h(-2.0f, 28.0f, (bd.a0 ? 3 : 5) | 16));
        pf.a(textView);
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(bd.M0(2131744865, null));
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Fi, null);
        y d10 = org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.k6.v0(i12) & 452984831, 14.0f);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 26);
        textView2.setBackground(d10);
        org.telegram.ui.ActionBar.r6.k(textView2, d10, null, h, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new z7(this, 0));
        frameLayout.addView(textView2, mf.i(-2.0f, 32.0f, (bd.a0 ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        pf.a(textView2);
        vg.o0 o0Var = new vg.o0(org.telegram.messenger.g0.L(4.0f), context, null, false);
        this.G = o0Var;
        o0Var.setIcon(R.raw.unlock_icon);
        o0Var.b(bd.M0(2131743886, null), new z7(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) o0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            o0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.y.addView(this.G, mf.h(-2.0f, 28.0f, (bd.a0 ? 3 : 5) | 16));
        pf.a(this.G);
        this.y.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        addView(this.y, mf.d(-2, -1.0f, bd.a0 ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new z7(this, 1));
        ec ecVar = new ec(context, 9);
        this.b = ecVar;
        hs.i(ecVar);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.G6, null);
        ecVar.setTextSize(1, 16.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        ecVar.setLines(1);
        ecVar.setMaxLines(1);
        ecVar.setSingleLine(true);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        ecVar.setGravity(mf.y());
        addView(ecVar, mf.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.z6, null);
        org.telegram.messenger.camera.q.n(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(mf.y());
        addView(textView3, mf.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i3 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.H = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.y6, null, PorterDuff.Mode.SRC_IN);
            int i14 = org.telegram.ui.ActionBar.k6.i6;
            y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1);
            org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i14);
            imageView3.setBackground(h03);
            org.telegram.ui.ActionBar.r6.k(imageView3, h03, null, N4, null);
            imageView3.setVisibility(8);
            boolean z12 = bd.a0;
            addView(imageView3, mf.d(-2, -2.0f, (z12 ? 3 : 5) | 16, z12 ? 4.0f : 0.0f, 0.0f, z12 ? 0.0f : 4.0f, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i3 = this.a;
        if (i3 == 1) {
            return this.e.a.q;
        }
        if (i3 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.x || this.y.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
    }

    public final void b(boolean z10, boolean z11) {
        int i3 = this.a;
        if (i3 == 1) {
            this.e.a(z10, z11);
            return;
        }
        if (i3 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                imageView.animate().setListener(new c8(this, z10, 0)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            imageView.setVisibility(z10 ? 0 : 4);
            if (z10) {
                imageView.setAlpha(1.0f);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                return;
            } else {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
        }
        if (this.x) {
            FrameLayout frameLayout = this.y;
            if (z11) {
                frameLayout.animate().cancel();
                frameLayout.animate().setListener(new c8(this, z10, 1)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            frameLayout.setVisibility(z10 ? 0 : 4);
            if (z10) {
                frameLayout.setAlpha(1.0f);
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(1.0f);
            } else {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
            }
        }
    }

    public final void c(final boolean z10) {
        final int i3 = 1;
        if (this.a == 1) {
            final int i10 = 2;
            final int i11 = 0;
            float[] fArr = {z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f};
            float[] fArr2 = {z10 ? 1.0f : 0.66f, z10 ? 0.66f : 1.0f};
            ImageView imageView = this.n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            xq xqVar = ks.a;
            duration.setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.a8
                public final /* synthetic */ f8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            boolean z11 = z10;
                            f8 f8Var = this.b;
                            if (!z11) {
                                f8Var.n.setVisibility(8);
                                break;
                            } else {
                                f8Var.getClass();
                                break;
                            }
                        case 1:
                            boolean z12 = z10;
                            f8 f8Var2 = this.b;
                            if (!z12) {
                                f8Var2.getClass();
                                break;
                            } else {
                                f8Var2.y.setVisibility(8);
                                break;
                            }
                        default:
                            boolean z13 = z10;
                            f8 f8Var3 = this.b;
                            if (!z13) {
                                f8Var3.getClass();
                                break;
                            } else {
                                f8Var3.h.setVisibility(8);
                                break;
                            }
                    }
                }
            }).start();
            if (this.x) {
                FrameLayout frameLayout = this.y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.a8
                    public final /* synthetic */ f8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                boolean z11 = z10;
                                f8 f8Var = this.b;
                                if (!z11) {
                                    f8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    f8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z12 = z10;
                                f8 f8Var2 = this.b;
                                if (!z12) {
                                    f8Var2.getClass();
                                    break;
                                } else {
                                    f8Var2.y.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z13 = z10;
                                f8 f8Var3 = this.b;
                                if (!z13) {
                                    f8Var3.getClass();
                                    break;
                                } else {
                                    f8Var3.h.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
            } else {
                ImageView imageView2 = this.h;
                imageView2.setVisibility(0);
                imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.a8
                    public final /* synthetic */ f8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z11 = z10;
                                f8 f8Var = this.b;
                                if (!z11) {
                                    f8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    f8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z12 = z10;
                                f8 f8Var2 = this.b;
                                if (!z12) {
                                    f8Var2.getClass();
                                    break;
                                } else {
                                    f8Var2.y.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z13 = z10;
                                f8 f8Var3 = this.b;
                                if (!z13) {
                                    f8Var3.getClass();
                                    break;
                                } else {
                                    f8Var3.h.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
            }
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        TLRPC.Document document;
        this.f = z10;
        this.r = tL_messages_stickerSet;
        this.s = z11;
        org.telegram.ui.Components.k9 k9Var = this.d;
        k9Var.setVisibility(0);
        ec ecVar = this.b;
        ecVar.setTranslationY(0.0f);
        ecVar.setText(this.r.set.title);
        boolean z12 = this.r.set.archived;
        TextView textView = this.c;
        if (z12) {
            ecVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            k9Var.setAlpha(0.5f);
        } else {
            ecVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            k9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.x = z13;
        this.y.setVisibility(z13 ? 0 : 8);
        this.h.setVisibility(this.x ? 8 : 0);
        k9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList == null || arrayList.isEmpty()) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            textView.setText(bd.G(0, tL_messages_stickerSet2.set.emojis ? "EmojiCount" : "Stickers", new Object[0]));
            k9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.g5.g(h10.t0).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.d5() { // from class: org.telegram.ui.Cells.b8
                    @Override // org.telegram.ui.Components.d5
                    public final void a(TLRPC.Document document2) {
                        org.telegram.messenger.g0.h3(new ea(7, f8.this, document2));
                    }
                });
            }
        } else {
            textView.setText(bd.G(arrayList.size(), this.x ? "EmojiCount" : "Stickers", new Object[0]));
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    document = null;
                    break;
                }
                document = arrayList.get(i3);
                if (document != null && document.id == tL_messages_stickerSet.set.thumb_document_id) {
                    break;
                } else {
                    i3++;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            TLRPC.Document document2 = document;
            lc.e(1);
            TLObject w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document2;
            }
            jz d = org.telegram.messenger.t5.d(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.k6.a7, 1.0f, false);
            boolean z14 = w10 instanceof TLRPC.Document;
            ac c2 = z14 ? ac.c(org.telegram.messenger.w7.w(document2.thumbs, 90, false, null, false), document2) : ac.k((TLRPC.PhotoSize) w10, document2, tL_messages_stickerSet.set.thumb_version);
            String concat = "50_50".concat(!lc.e(this.x ? 16388 : 1) ? "_firstframe" : "");
            if (z14 && (zi.L2(document2, true) || zi.O4(document2))) {
                if (d != null) {
                    k9Var.p(ac.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    k9Var.l(ac.b(document2), concat, c2, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (zi.D4(document2)) {
                    k9Var.setColorFilter(org.telegram.ui.ActionBar.k6.v3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (c2 == null || c2.p != 1) {
                    k9Var.k(c2, concat, "webp", d, tL_messages_stickerSet2);
                } else {
                    k9Var.k(c2, concat, "tgs", d, tL_messages_stickerSet2);
                }
            }
        }
        if (this.s) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_messages_stickerSet2.set.emojis ? "t.me/addemoji/" : "t.me/addstickers/");
            sb2.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb2.toString());
        }
    }

    public final void e(int i3) {
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I = null;
        }
        vg.o0 o0Var = this.G;
        if (i3 == 1) {
            o0Var.b(bd.M0(2131743886, null), new z7(this, 0), false);
        } else if (i3 == 2) {
            o0Var.b(bd.M0(2131746092, null), new z7(this, 0), false);
        }
        o0Var.setEnabled(i3 == 1 || i3 == 2);
        boolean z10 = i3 == 3;
        TextView textView = this.E;
        textView.setEnabled(z10);
        boolean z11 = i3 == 4;
        TextView textView2 = this.F;
        textView2.setEnabled(z11);
        o0Var.setAlpha((i3 == 1 || i3 == 2) ? 1.0f : 0.0f);
        o0Var.setScaleX((i3 == 1 || i3 == 2) ? 1.0f : 0.6f);
        o0Var.setScaleY((i3 == 1 || i3 == 2) ? 1.0f : 0.6f);
        o0Var.setVisibility((i3 == 1 || i3 == 2) ? 0 : 8);
        textView.setAlpha(i3 == 3 ? 1.0f : 0.0f);
        textView.setScaleX(i3 == 3 ? 1.0f : 0.6f);
        textView.setScaleY(i3 == 3 ? 1.0f : 0.6f);
        textView.setVisibility(i3 == 3 ? 0 : 8);
        textView2.setAlpha(i3 == 4 ? 1.0f : 0.0f);
        textView2.setScaleX(i3 == 4 ? 1.0f : 0.6f);
        textView2.setScaleY(i3 != 4 ? 0.6f : 1.0f);
        textView2.setVisibility(i3 != 4 ? 8 : 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), TLObject.FLAG_30);
        FrameLayout frameLayout = this.y;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + org.telegram.messenger.g0.L(26.0f);
        boolean z12 = bd.a0;
        TextView textView3 = this.c;
        ec ecVar = this.b;
        if (z12) {
            ((ViewGroup.MarginLayoutParams) ecVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
        } else {
            ((ViewGroup.MarginLayoutParams) ecVar.getLayoutParams()).rightMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
        }
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            canvas.drawLine(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (bd.a0 ? org.telegram.messenger.g0.L(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.e;
        if (woVar == null || !woVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f) + (this.f ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.w;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.x && (frameLayout = this.y) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z10) {
        b(z10, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setVisibility(onClickListener == null ? 8 : 0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f = z10;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z10) {
        c(z10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
    }
}
