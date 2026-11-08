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
import bi.md;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g8 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final TextView D;
    public final TextView E;
    public final ug.p0 F;
    public final ImageView G;
    public AnimatorSet H;
    public final int a;
    public final md b;
    public final TextView c;
    public final org.telegram.ui.Components.l9 d;
    public final wo e;
    public boolean f;
    public final ImageView h;
    public final ImageView n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public final Rect w;
    public boolean x;
    public final FrameLayout y;

    public g8(Context context, int i7) {
        super(context);
        this.w = new Rect();
        this.a = i7;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setLayerNum(1);
        boolean z9 = id.a0;
        addView(l9Var, c8.ha.d(40, 40.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 13.0f, 9.0f, z9 ? 13.0f : 0.0f, 0.0f));
        if (i7 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i7 != 3) {
                int i10 = org.telegram.ui.ActionBar.k6.Ji;
                y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
                imageView.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
            }
            if (i7 == 1) {
                int i11 = org.telegram.ui.ActionBar.k6.Ii;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.r6.t(imageView, i11, null, mode);
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(id.M0(2131754839, null));
                addView(imageView, c8.ha.e(40, 40, (id.a0 ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                org.telegram.ui.ActionBar.r6.t(imageView2, i11, null, mode);
                addView(imageView2, c8.ha.h(58.0f, 58.0f, 8388613));
                wo woVar = new wo(21, context, null);
                this.e = woVar;
                woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
                woVar.setDrawUnchecked(false);
                woVar.setDrawBackgroundAsArc(3);
                addView(woVar, c8.ha.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i7 == 3) {
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.floating_check);
                boolean z10 = id.a0;
                addView(imageView, c8.ha.d(40, 40.0f, (z10 ? 3 : 5) | 48, z10 ? 10 : 0, 9.0f, z10 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(id.M0(2131754486, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i12);
        int i13 = org.telegram.ui.ActionBar.k6.Ei;
        y d = org.telegram.ui.ActionBar.z5.d(v02, org.telegram.ui.ActionBar.k6.v0(i13), 14.0f);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i13);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.r6.k(textView, d, N2, N3, null);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new a8(this, 0));
        frameLayout.addView(textView, c8.ha.h(-2.0f, 28.0f, (id.a0 ? 3 : 5) | 16));
        c8.ka.a(textView);
        TextView textView2 = new TextView(context);
        this.E = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(id.M0(2131744858, null));
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Fi, null);
        y d2 = org.telegram.ui.ActionBar.z5.d(0, org.telegram.ui.ActionBar.k6.v0(i12) & 452984831, 14.0f);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 26);
        textView2.setBackground(d2);
        org.telegram.ui.ActionBar.r6.k(textView2, d2, null, h, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new a8(this, 0));
        frameLayout.addView(textView2, c8.ha.i(-2.0f, 32.0f, (id.a0 ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        c8.ka.a(textView2);
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(4.0f), context, null, false);
        this.F = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.b(id.M0(2131743879, null), new a8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            p0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.y.addView(this.F, c8.ha.h(-2.0f, 28.0f, (id.a0 ? 3 : 5) | 16));
        c8.ka.a(this.F);
        this.y.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        addView(this.y, c8.ha.d(-2, -1.0f, id.a0 ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new a8(this, 1));
        md mdVar = new md(context, 9);
        this.b = mdVar;
        qs.i(mdVar);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.G6, null);
        mdVar.setTextSize(1, 16.0f);
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        mdVar.setLines(1);
        mdVar.setMaxLines(1);
        mdVar.setSingleLine(true);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setGravity(c8.ha.y());
        addView(mdVar, c8.ha.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.z6, null);
        org.telegram.messenger.camera.q.n(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(c8.ha.y());
        addView(textView3, c8.ha.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i7 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.G = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.y6, null, PorterDuff.Mode.SRC_IN);
            int i14 = org.telegram.ui.ActionBar.k6.i6;
            y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1);
            org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i14);
            imageView3.setBackground(h03);
            org.telegram.ui.ActionBar.r6.k(imageView3, h03, null, N4, null);
            imageView3.setVisibility(8);
            boolean z11 = id.a0;
            addView(imageView3, c8.ha.d(-2, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 4.0f : 0.0f, 0.0f, z11 ? 0.0f : 4.0f, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i7 = this.a;
        if (i7 == 1) {
            return this.e.a.q;
        }
        if (i7 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.x || this.y.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
    }

    public final void b(boolean z9, boolean z10) {
        int i7 = this.a;
        if (i7 == 1) {
            this.e.a(z9, z10);
            return;
        }
        if (i7 == 3) {
            ImageView imageView = this.h;
            if (z10) {
                imageView.animate().cancel();
                imageView.animate().setListener(new d8(this, z9, 0)).alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.1f).scaleY(z9 ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            imageView.setVisibility(z9 ? 0 : 4);
            if (z9) {
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
            if (z10) {
                frameLayout.animate().cancel();
                frameLayout.animate().setListener(new d8(this, z9, 1)).alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.1f).scaleY(z9 ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            frameLayout.setVisibility(z9 ? 0 : 4);
            if (z9) {
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

    public final void c(final boolean z9) {
        final int i7 = 1;
        if (this.a == 1) {
            final int i10 = 2;
            final int i11 = 0;
            float[] fArr = {z9 ? 1.0f : 0.0f, z9 ? 0.0f : 1.0f};
            float[] fArr2 = {z9 ? 1.0f : 0.66f, z9 ? 0.66f : 1.0f};
            ImageView imageView = this.n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            xq xqVar = ks.a;
            duration.setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.b8
                public final /* synthetic */ g8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            boolean z10 = z9;
                            g8 g8Var = this.b;
                            if (!z10) {
                                g8Var.n.setVisibility(8);
                                break;
                            } else {
                                g8Var.getClass();
                                break;
                            }
                        case 1:
                            boolean z11 = z9;
                            g8 g8Var2 = this.b;
                            if (!z11) {
                                g8Var2.getClass();
                                break;
                            } else {
                                g8Var2.y.setVisibility(8);
                                break;
                            }
                        default:
                            boolean z12 = z9;
                            g8 g8Var3 = this.b;
                            if (!z12) {
                                g8Var3.getClass();
                                break;
                            } else {
                                g8Var3.h.setVisibility(8);
                                break;
                            }
                    }
                }
            }).start();
            if (this.x) {
                FrameLayout frameLayout = this.y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.b8
                    public final /* synthetic */ g8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                boolean z10 = z9;
                                g8 g8Var = this.b;
                                if (!z10) {
                                    g8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    g8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z11 = z9;
                                g8 g8Var2 = this.b;
                                if (!z11) {
                                    g8Var2.getClass();
                                    break;
                                } else {
                                    g8Var2.y.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z12 = z9;
                                g8 g8Var3 = this.b;
                                if (!z12) {
                                    g8Var3.getClass();
                                    break;
                                } else {
                                    g8Var3.h.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
            } else {
                ImageView imageView2 = this.h;
                imageView2.setVisibility(0);
                imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.b8
                    public final /* synthetic */ g8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = z9;
                                g8 g8Var = this.b;
                                if (!z10) {
                                    g8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    g8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z11 = z9;
                                g8 g8Var2 = this.b;
                                if (!z11) {
                                    g8Var2.getClass();
                                    break;
                                } else {
                                    g8Var2.y.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z12 = z9;
                                g8 g8Var3 = this.b;
                                if (!z12) {
                                    g8Var3.getClass();
                                    break;
                                } else {
                                    g8Var3.h.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
            }
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z9, boolean z10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        TLRPC.Document document;
        this.f = z9;
        this.r = tL_messages_stickerSet;
        this.s = z10;
        org.telegram.ui.Components.l9 l9Var = this.d;
        l9Var.setVisibility(0);
        md mdVar = this.b;
        mdVar.setTranslationY(0.0f);
        mdVar.setText(this.r.set.title);
        boolean z11 = this.r.set.archived;
        TextView textView = this.c;
        if (z11) {
            mdVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            l9Var.setAlpha(0.5f);
        } else {
            mdVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            l9Var.setAlpha(1.0f);
        }
        boolean z12 = tL_messages_stickerSet.set.emojis;
        this.x = z12;
        this.y.setVisibility(z12 ? 0 : 8);
        this.h.setVisibility(this.x ? 8 : 0);
        l9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList == null || arrayList.isEmpty()) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            textView.setText(id.G(0, tL_messages_stickerSet2.set.emojis ? "EmojiCount" : "Stickers", new Object[0]));
            l9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.i5.g(p10.s0).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.f5() { // from class: org.telegram.ui.Cells.c8
                    @Override // org.telegram.ui.Components.f5
                    public final void a(TLRPC.Document document2) {
                        org.telegram.messenger.g0.h3(new ea(7, g8.this, document2));
                    }
                });
            }
        } else {
            textView.setText(id.G(arrayList.size(), this.x ? "EmojiCount" : "Stickers", new Object[0]));
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    document = null;
                    break;
                }
                document = arrayList.get(i7);
                if (document != null && document.id == tL_messages_stickerSet.set.thumb_document_id) {
                    break;
                } else {
                    i7++;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            TLRPC.Document document2 = document;
            sc.e(1);
            TLObject w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document2;
            }
            rz d = org.telegram.messenger.t5.d(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.k6.a7, 1.0f, false);
            boolean z13 = w10 instanceof TLRPC.Document;
            hc c10 = z13 ? hc.c(org.telegram.messenger.w7.w(document2.thumbs, 90, false, null, false), document2) : hc.k((TLRPC.PhotoSize) w10, document2, tL_messages_stickerSet.set.thumb_version);
            String concat = "50_50".concat(!sc.e(this.x ? 16388 : 1) ? "_firstframe" : "");
            if (z13 && (ij.L2(document2, true) || ij.O4(document2))) {
                if (d != null) {
                    l9Var.p(hc.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    l9Var.l(hc.b(document2), concat, c10, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (ij.D4(document2)) {
                    l9Var.setColorFilter(org.telegram.ui.ActionBar.k6.v3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (c10 == null || c10.p != 1) {
                    l9Var.k(c10, concat, "webp", d, tL_messages_stickerSet2);
                } else {
                    l9Var.k(c10, concat, "tgs", d, tL_messages_stickerSet2);
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

    public final void e(int i7) {
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H = null;
        }
        ug.p0 p0Var = this.F;
        if (i7 == 1) {
            p0Var.b(id.M0(2131743879, null), new a8(this, 0), false);
        } else if (i7 == 2) {
            p0Var.b(id.M0(2131746085, null), new a8(this, 0), false);
        }
        p0Var.setEnabled(i7 == 1 || i7 == 2);
        boolean z9 = i7 == 3;
        TextView textView = this.D;
        textView.setEnabled(z9);
        boolean z10 = i7 == 4;
        TextView textView2 = this.E;
        textView2.setEnabled(z10);
        p0Var.setAlpha((i7 == 1 || i7 == 2) ? 1.0f : 0.0f);
        p0Var.setScaleX((i7 == 1 || i7 == 2) ? 1.0f : 0.6f);
        p0Var.setScaleY((i7 == 1 || i7 == 2) ? 1.0f : 0.6f);
        p0Var.setVisibility((i7 == 1 || i7 == 2) ? 0 : 8);
        textView.setAlpha(i7 == 3 ? 1.0f : 0.0f);
        textView.setScaleX(i7 == 3 ? 1.0f : 0.6f);
        textView.setScaleY(i7 == 3 ? 1.0f : 0.6f);
        textView.setVisibility(i7 == 3 ? 0 : 8);
        textView2.setAlpha(i7 == 4 ? 1.0f : 0.0f);
        textView2.setScaleX(i7 == 4 ? 1.0f : 0.6f);
        textView2.setScaleY(i7 != 4 ? 0.6f : 1.0f);
        textView2.setVisibility(i7 != 4 ? 8 : 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), TLObject.FLAG_30);
        FrameLayout frameLayout = this.y;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + org.telegram.messenger.g0.L(26.0f);
        boolean z11 = id.a0;
        TextView textView3 = this.c;
        md mdVar = this.b;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) mdVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
        } else {
            ((ViewGroup.MarginLayoutParams) mdVar.getLayoutParams()).rightMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
        }
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            canvas.drawLine(id.a0 ? 0.0f : org.telegram.messenger.g0.L(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (id.a0 ? org.telegram.messenger.g0.L(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f) + (this.f ? 1 : 0), TLObject.FLAG_30));
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

    public void setChecked(boolean z9) {
        b(z9, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        ImageView imageView = this.G;
        if (imageView != null) {
            imageView.setVisibility(onClickListener == null ? 8 : 0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z9) {
        this.f = z9;
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

    public void setReorderable(boolean z9) {
        c(z9);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
    }
}
