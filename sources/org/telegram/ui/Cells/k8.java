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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.sc;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k8 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView D;
    public final TextView E;
    public final kg.x0 F;
    public final ImageView G;
    public AnimatorSet H;
    public final int a;
    public final ag.j3 b;
    public final TextView c;
    public final org.telegram.ui.Components.g9 d;
    public final ep e;
    public boolean f;
    public final ImageView h;
    public final ImageView n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public final Rect w;
    public boolean x;
    public final FrameLayout y;

    public k8(Context context, int i10) {
        super(context);
        this.w = new Rect();
        this.a = i10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.d = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setLayerNum(1);
        boolean z10 = cd.X;
        addView(g9Var, w7.b6.d(40, 40.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 13.0f, 9.0f, z10 ? 13.0f : 0.0f, 0.0f));
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i10 != 3) {
                int i11 = org.telegram.ui.ActionBar.t6.Ji;
                y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 1, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
                imageView.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
            }
            if (i10 == 1) {
                int i12 = org.telegram.ui.ActionBar.t6.Ii;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.a7.t(imageView, i12, null, mode);
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(cd.L0(2131754839, null));
                addView(imageView, w7.b6.e(40, 40, (cd.X ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                org.telegram.ui.ActionBar.a7.t(imageView2, i12, null, mode);
                addView(imageView2, w7.b6.h(58.0f, 58.0f, 8388613));
                ep epVar = new ep(21, context, null);
                this.e = epVar;
                epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
                epVar.setDrawUnchecked(false);
                epVar.setDrawBackgroundAsArc(3);
                addView(epVar, w7.b6.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i10 == 3) {
                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.floating_check);
                boolean z11 = cd.X;
                addView(imageView, w7.b6.d(40, 40.0f, (z11 ? 3 : 5) | 48, z11 ? 10 : 0, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(cd.L0(2131754486, null));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        int i13 = org.telegram.ui.ActionBar.t6.Ci;
        int v02 = org.telegram.ui.ActionBar.t6.v0(i13);
        int i14 = org.telegram.ui.ActionBar.t6.Ei;
        y d = org.telegram.ui.ActionBar.j6.d(v02, org.telegram.ui.ActionBar.t6.v0(i14), 14.0f);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i14);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.a7.k(textView, d, N2, N3, null);
        textView.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new e8(this, 0));
        frameLayout.addView(textView, w7.b6.h(-2.0f, 28.0f, (cd.X ? 3 : 5) | 16));
        w7.e6.a(textView);
        TextView textView2 = new TextView(context);
        this.E = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(cd.L0(2131744873, null));
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Fi, null);
        y d10 = org.telegram.ui.ActionBar.j6.d(0, org.telegram.ui.ActionBar.t6.v0(i13) & 452984831, 14.0f);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i13, 26);
        textView2.setBackground(d10);
        org.telegram.ui.ActionBar.a7.k(textView2, d10, null, h, null);
        textView2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new e8(this, 0));
        frameLayout.addView(textView2, w7.b6.i(-2.0f, 32.0f, (cd.X ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        w7.e6.a(textView2);
        kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(4.0f), context, null, false);
        this.F = x0Var;
        x0Var.setIcon(R.raw.unlock_icon);
        x0Var.b(cd.L0(2131743901, null), new e8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.i0.L(1.0f);
            int L = org.telegram.messenger.i0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) x0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(3.0f);
            x0Var.getChildAt(0).setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.y.addView(this.F, w7.b6.h(-2.0f, 28.0f, (cd.X ? 3 : 5) | 16));
        w7.e6.a(this.F);
        this.y.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        addView(this.y, w7.b6.d(-2, -1.0f, cd.X ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new e8(this, 1));
        ag.j3 j3Var = new ag.j3(context, 6);
        this.b = j3Var;
        zs.i(j3Var);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.G6, null);
        j3Var.setTextSize(1, 16.0f);
        j3Var.setTypeface(org.telegram.messenger.i0.o());
        j3Var.setLines(1);
        j3Var.setMaxLines(1);
        j3Var.setSingleLine(true);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        j3Var.setGravity(w7.b6.y());
        addView(j3Var, w7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.z6, null);
        z20.o(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(w7.b6.y());
        addView(textView3, w7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i10 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.G = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            org.telegram.ui.ActionBar.a7.t(imageView3, org.telegram.ui.ActionBar.t6.y6, null, PorterDuff.Mode.SRC_IN);
            int i15 = org.telegram.ui.ActionBar.t6.i6;
            y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i15, false), 1, -1);
            org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i15);
            imageView3.setBackground(h03);
            org.telegram.ui.ActionBar.a7.k(imageView3, h03, null, N4, null);
            imageView3.setVisibility(8);
            boolean z12 = cd.X;
            addView(imageView3, w7.b6.d(-2, -2.0f, (z12 ? 3 : 5) | 16, z12 ? 4.0f : 0.0f, 0.0f, z12 ? 0.0f : 4.0f, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i10 = this.a;
        if (i10 == 1) {
            return this.e.a.q;
        }
        if (i10 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.x || this.y.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
    }

    public final void b(boolean z10, boolean z11) {
        int i10 = this.a;
        if (i10 == 1) {
            this.e.a(z10, z11);
            return;
        }
        if (i10 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                imageView.animate().setListener(new h8(this, z10, 0)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
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
                frameLayout.animate().setListener(new h8(this, z10, 1)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
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
        final int i10 = 1;
        if (this.a == 1) {
            final int i11 = 2;
            final int i12 = 0;
            float[] fArr = {z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f};
            float[] fArr2 = {z10 ? 1.0f : 0.66f, z10 ? 0.66f : 1.0f};
            ImageView imageView = this.n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            gr grVar = vs.a;
            duration.setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.f8
                public final /* synthetic */ k8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            boolean z11 = z10;
                            k8 k8Var = this.b;
                            if (!z11) {
                                k8Var.n.setVisibility(8);
                                break;
                            } else {
                                k8Var.getClass();
                                break;
                            }
                        case 1:
                            boolean z12 = z10;
                            k8 k8Var2 = this.b;
                            if (!z12) {
                                k8Var2.getClass();
                                break;
                            } else {
                                k8Var2.y.setVisibility(8);
                                break;
                            }
                        default:
                            boolean z13 = z10;
                            k8 k8Var3 = this.b;
                            if (!z13) {
                                k8Var3.getClass();
                                break;
                            } else {
                                k8Var3.h.setVisibility(8);
                                break;
                            }
                    }
                }
            }).start();
            if (this.x) {
                FrameLayout frameLayout = this.y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.f8
                    public final /* synthetic */ k8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z11 = z10;
                                k8 k8Var = this.b;
                                if (!z11) {
                                    k8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    k8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z12 = z10;
                                k8 k8Var2 = this.b;
                                if (!z12) {
                                    k8Var2.getClass();
                                    break;
                                } else {
                                    k8Var2.y.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z13 = z10;
                                k8 k8Var3 = this.b;
                                if (!z13) {
                                    k8Var3.getClass();
                                    break;
                                } else {
                                    k8Var3.h.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
            } else {
                ImageView imageView2 = this.h;
                imageView2.setVisibility(0);
                imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.f8
                    public final /* synthetic */ k8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z11 = z10;
                                k8 k8Var = this.b;
                                if (!z11) {
                                    k8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    k8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z12 = z10;
                                k8 k8Var2 = this.b;
                                if (!z12) {
                                    k8Var2.getClass();
                                    break;
                                } else {
                                    k8Var2.y.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z13 = z10;
                                k8 k8Var3 = this.b;
                                if (!z13) {
                                    k8Var3.getClass();
                                    break;
                                } else {
                                    k8Var3.h.setVisibility(8);
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
        org.telegram.ui.Components.g9 g9Var = this.d;
        g9Var.setVisibility(0);
        ag.j3 j3Var = this.b;
        j3Var.setTranslationY(0.0f);
        j3Var.setText(this.r.set.title);
        boolean z12 = this.r.set.archived;
        TextView textView = this.c;
        if (z12) {
            j3Var.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            g9Var.setAlpha(0.5f);
        } else {
            j3Var.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            g9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.x = z13;
        this.y.setVisibility(z13 ? 0 : 8);
        this.h.setVisibility(this.x ? 8 : 0);
        g9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList == null || arrayList.isEmpty()) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            textView.setText(cd.G(0, tL_messages_stickerSet2.set.emojis ? "EmojiCount" : "Stickers", new Object[0]));
            g9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.f5.g(d20.s0).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.c5() { // from class: org.telegram.ui.Cells.g8
                    @Override // org.telegram.ui.Components.c5
                    public final void a(TLRPC.Document document2) {
                        org.telegram.messenger.i0.g3(new ea(7, k8.this, document2));
                    }
                });
            }
        } else {
            textView.setText(cd.G(arrayList.size(), this.x ? "EmojiCount" : "Stickers", new Object[0]));
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    document = null;
                    break;
                }
                document = arrayList.get(i10);
                if (document != null && document.id == tL_messages_stickerSet.set.thumb_document_id) {
                    break;
                } else {
                    i10++;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            TLRPC.Document document2 = document;
            sc.e(1);
            TLObject w9 = org.telegram.messenger.b8.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w9 == null) {
                w9 = document2;
            }
            c00 d = org.telegram.messenger.v5.d(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.t6.a7, 1.0f, false);
            boolean z14 = w9 instanceof TLRPC.Document;
            ic c10 = z14 ? ic.c(org.telegram.messenger.b8.w(document2.thumbs, 90, false, null, false), document2) : ic.k((TLRPC.PhotoSize) w9, document2, tL_messages_stickerSet.set.thumb_version);
            String concat = "50_50".concat(!sc.e(this.x ? 16388 : 1) ? "_firstframe" : "");
            if (z14 && (jj.K2(document2, true) || jj.N4(document2))) {
                if (d != null) {
                    g9Var.p(ic.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    g9Var.l(ic.b(document2), concat, c10, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (jj.C4(document2)) {
                    g9Var.setColorFilter(org.telegram.ui.ActionBar.t6.v3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (c10 == null || c10.p != 1) {
                    g9Var.k(c10, concat, "webp", d, tL_messages_stickerSet2);
                } else {
                    g9Var.k(c10, concat, "tgs", d, tL_messages_stickerSet2);
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

    public final void e(int i10) {
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H = null;
        }
        kg.x0 x0Var = this.F;
        if (i10 == 1) {
            x0Var.b(cd.L0(2131743901, null), new e8(this, 0), false);
        } else if (i10 == 2) {
            x0Var.b(cd.L0(2131746099, null), new e8(this, 0), false);
        }
        x0Var.setEnabled(i10 == 1 || i10 == 2);
        boolean z10 = i10 == 3;
        TextView textView = this.D;
        textView.setEnabled(z10);
        boolean z11 = i10 == 4;
        TextView textView2 = this.E;
        textView2.setEnabled(z11);
        x0Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
        x0Var.setScaleX((i10 == 1 || i10 == 2) ? 1.0f : 0.6f);
        x0Var.setScaleY((i10 == 1 || i10 == 2) ? 1.0f : 0.6f);
        x0Var.setVisibility((i10 == 1 || i10 == 2) ? 0 : 8);
        textView.setAlpha(i10 == 3 ? 1.0f : 0.0f);
        textView.setScaleX(i10 == 3 ? 1.0f : 0.6f);
        textView.setScaleY(i10 == 3 ? 1.0f : 0.6f);
        textView.setVisibility(i10 == 3 ? 0 : 8);
        textView2.setAlpha(i10 == 4 ? 1.0f : 0.0f);
        textView2.setScaleX(i10 == 4 ? 1.0f : 0.6f);
        textView2.setScaleY(i10 != 4 ? 0.6f : 1.0f);
        textView2.setVisibility(i10 != 4 ? 8 : 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), TLObject.FLAG_30);
        FrameLayout frameLayout = this.y;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + org.telegram.messenger.i0.L(26.0f);
        boolean z12 = cd.X;
        TextView textView3 = this.c;
        ag.j3 j3Var = this.b;
        if (z12) {
            ((ViewGroup.MarginLayoutParams) j3Var.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
        } else {
            ((ViewGroup.MarginLayoutParams) j3Var.getLayoutParams()).rightMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
        }
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (cd.X ? org.telegram.messenger.i0.L(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ep epVar = this.e;
        if (epVar == null || !epVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f) + (this.f ? 1 : 0), TLObject.FLAG_30));
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
        ImageView imageView = this.G;
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
    }
}
