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
import di.xb;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.n10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h8 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView E;
    public final TextView F;
    public final ug.s0 G;
    public final ImageView H;
    public AnimatorSet I;
    public final int a;
    public final xb b;
    public final TextView c;
    public final org.telegram.ui.Components.q9 d;
    public final mp e;
    public boolean f;
    public final ImageView h;
    public final ImageView n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public final Rect w;
    public boolean x;
    public final FrameLayout y;

    public h8(Context context, int i7) {
        super(context);
        this.w = new Rect();
        this.a = i7;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.d = q9Var;
        q9Var.setAspectFit(true);
        q9Var.setLayerNum(1);
        boolean z10 = gd.a0;
        addView(q9Var, c8.ma.d(40, 40.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 13.0f, 9.0f, z10 ? 13.0f : 0.0f, 0.0f));
        if (i7 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i7 != 3) {
                int i10 = org.telegram.ui.ActionBar.n6.Mi;
                y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 1, -1);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
                imageView.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, null);
            }
            if (i7 == 1) {
                int i11 = org.telegram.ui.ActionBar.n6.Li;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.u6.s(imageView, i11, null, mode);
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(gd.M0(2131754839, null));
                addView(imageView, c8.ma.e(40, 40, (gd.a0 ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                org.telegram.ui.ActionBar.u6.s(imageView2, i11, null, mode);
                addView(imageView2, c8.ma.h(58.0f, 58.0f, 8388613));
                mp mpVar = new mp(21, context, null);
                this.e = mpVar;
                mpVar.b(-1, org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.k7);
                mpVar.setDrawUnchecked(false);
                mpVar.setDrawBackgroundAsArc(3);
                addView(mpVar, c8.ma.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i7 == 3) {
                org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.floating_check);
                boolean z11 = gd.a0;
                addView(imageView, c8.ma.d(40, 40.0f, (z11 ? 3 : 5) | 48, z11 ? 10 : 0, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.M0(2131754484, null));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
        int i12 = org.telegram.ui.ActionBar.n6.Fi;
        int v02 = org.telegram.ui.ActionBar.n6.v0(i12);
        int i13 = org.telegram.ui.ActionBar.n6.Hi;
        y d = org.telegram.ui.ActionBar.b6.d(v02, org.telegram.ui.ActionBar.n6.v0(i13), 14.0f);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i13);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.u6.j(textView, d, M2, M3, null);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new b8(this, 0));
        frameLayout.addView(textView, c8.ma.h(-2.0f, 28.0f, (gd.a0 ? 3 : 5) | 16));
        c8.ra.a(textView);
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(gd.M0(2131744620, null));
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Ii, null);
        y d2 = org.telegram.ui.ActionBar.b6.d(0, org.telegram.ui.ActionBar.n6.v0(i12) & 452984831, 14.0f);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i12, 26);
        textView2.setBackground(d2);
        org.telegram.ui.ActionBar.u6.j(textView2, d2, null, g10, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new b8(this, 0));
        frameLayout.addView(textView2, c8.ma.i(-2.0f, 32.0f, (gd.a0 ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        c8.ra.a(textView2);
        ug.s0 s0Var = new ug.s0(org.telegram.messenger.g0.L(4.0f), context, null, false);
        this.G = s0Var;
        s0Var.setIcon(R.raw.unlock_icon);
        s0Var.b(gd.M0(2131743639, null), new b8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) s0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            s0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.y.addView(this.G, c8.ma.h(-2.0f, 28.0f, (gd.a0 ? 3 : 5) | 16));
        c8.ra.a(this.G);
        this.y.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        addView(this.y, c8.ma.d(-2, -1.0f, gd.a0 ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new b8(this, 1));
        xb xbVar = new xb(context, 9);
        this.b = xbVar;
        ks.i(xbVar);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.G6, null);
        xbVar.setTextSize(1, 16.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setLines(1);
        xbVar.setMaxLines(1);
        xbVar.setSingleLine(true);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.setGravity(c8.ma.y());
        addView(xbVar, c8.ma.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.z6, null);
        n10.q(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(c8.ma.y());
        addView(textView3, c8.ma.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i7 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.H = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.y6, null, PorterDuff.Mode.SRC_IN);
            int i14 = org.telegram.ui.ActionBar.n6.i6;
            y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i14, false), 1, -1);
            org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i14);
            imageView3.setBackground(h03);
            org.telegram.ui.ActionBar.u6.j(imageView3, h03, null, M4, null);
            imageView3.setVisibility(8);
            boolean z12 = gd.a0;
            addView(imageView3, c8.ma.d(-2, -2.0f, (z12 ? 3 : 5) | 16, z12 ? 4.0f : 0.0f, 0.0f, z12 ? 0.0f : 4.0f, 0.0f));
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m6));
    }

    public final void b(boolean z10, boolean z11) {
        int i7 = this.a;
        if (i7 == 1) {
            this.e.a(z10, z11);
            return;
        }
        if (i7 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                imageView.animate().setListener(new e8(this, z10, 0)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
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
                frameLayout.animate().setListener(new e8(this, z10, 1)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
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
        final int i7 = 1;
        if (this.a == 1) {
            final int i10 = 2;
            final int i11 = 0;
            float[] fArr = {z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f};
            float[] fArr2 = {z10 ? 1.0f : 0.66f, z10 ? 0.66f : 1.0f};
            ImageView imageView = this.n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            lr lrVar = xs.a;
            duration.setInterpolator(lrVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.c8
                public final /* synthetic */ h8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            boolean z11 = z10;
                            h8 h8Var = this.b;
                            if (!z11) {
                                h8Var.n.setVisibility(8);
                                break;
                            } else {
                                h8Var.getClass();
                                break;
                            }
                        case 1:
                            boolean z12 = z10;
                            h8 h8Var2 = this.b;
                            if (!z12) {
                                h8Var2.getClass();
                                break;
                            } else {
                                h8Var2.y.setVisibility(8);
                                break;
                            }
                        default:
                            boolean z13 = z10;
                            h8 h8Var3 = this.b;
                            if (!z13) {
                                h8Var3.getClass();
                                break;
                            } else {
                                h8Var3.h.setVisibility(8);
                                break;
                            }
                    }
                }
            }).start();
            if (this.x) {
                FrameLayout frameLayout = this.y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(lrVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.c8
                    public final /* synthetic */ h8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                boolean z11 = z10;
                                h8 h8Var = this.b;
                                if (!z11) {
                                    h8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    h8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z12 = z10;
                                h8 h8Var2 = this.b;
                                if (!z12) {
                                    h8Var2.getClass();
                                    break;
                                } else {
                                    h8Var2.y.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z13 = z10;
                                h8 h8Var3 = this.b;
                                if (!z13) {
                                    h8Var3.getClass();
                                    break;
                                } else {
                                    h8Var3.h.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
            } else {
                ImageView imageView2 = this.h;
                imageView2.setVisibility(0);
                imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(lrVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.c8
                    public final /* synthetic */ h8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z11 = z10;
                                h8 h8Var = this.b;
                                if (!z11) {
                                    h8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    h8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z12 = z10;
                                h8 h8Var2 = this.b;
                                if (!z12) {
                                    h8Var2.getClass();
                                    break;
                                } else {
                                    h8Var2.y.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z13 = z10;
                                h8 h8Var3 = this.b;
                                if (!z13) {
                                    h8Var3.getClass();
                                    break;
                                } else {
                                    h8Var3.h.setVisibility(8);
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
        org.telegram.ui.Components.q9 q9Var = this.d;
        q9Var.setVisibility(0);
        xb xbVar = this.b;
        xbVar.setTranslationY(0.0f);
        xbVar.setText(this.r.set.title);
        boolean z12 = this.r.set.archived;
        TextView textView = this.c;
        if (z12) {
            xbVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            q9Var.setAlpha(0.5f);
        } else {
            xbVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            q9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.x = z13;
        this.y.setVisibility(z13 ? 0 : 8);
        this.h.setVisibility(this.x ? 8 : 0);
        q9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList == null || arrayList.isEmpty()) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            textView.setText(gd.G(0, tL_messages_stickerSet2.set.emojis ? "EmojiCount" : "Stickers", new Object[0]));
            q9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.o5.g(j10.t0).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.l5() { // from class: org.telegram.ui.Cells.d8
                    @Override // org.telegram.ui.Components.l5
                    public final void a(TLRPC.Document document2) {
                        org.telegram.messenger.g0.g3(new ga(7, h8.this, document2));
                    }
                });
            }
        } else {
            textView.setText(gd.G(arrayList.size(), this.x ? "EmojiCount" : "Stickers", new Object[0]));
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
            pc.e(1);
            TLObject w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document2;
            }
            lz d = org.telegram.messenger.u5.d(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.n6.a7, 1.0f, false);
            boolean z14 = w10 instanceof TLRPC.Document;
            fc c10 = z14 ? fc.c(org.telegram.messenger.w7.w(document2.thumbs, 90, false, null, false), document2) : fc.k((TLRPC.PhotoSize) w10, document2, tL_messages_stickerSet.set.thumb_version);
            String concat = "50_50".concat(!pc.e(this.x ? 16388 : 1) ? "_firstframe" : "");
            if (z14 && (fj.K2(document2, true) || fj.N4(document2))) {
                if (d != null) {
                    q9Var.p(fc.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    q9Var.l(fc.b(document2), concat, c10, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (fj.C4(document2)) {
                    q9Var.setColorFilter(org.telegram.ui.ActionBar.n6.v3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (c10 == null || c10.p != 1) {
                    q9Var.k(c10, concat, "webp", d, tL_messages_stickerSet2);
                } else {
                    q9Var.k(c10, concat, "tgs", d, tL_messages_stickerSet2);
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
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I = null;
        }
        ug.s0 s0Var = this.G;
        if (i7 == 1) {
            s0Var.b(gd.M0(2131743639, null), new b8(this, 0), false);
        } else if (i7 == 2) {
            s0Var.b(gd.M0(2131745887, null), new b8(this, 0), false);
        }
        s0Var.setEnabled(i7 == 1 || i7 == 2);
        boolean z10 = i7 == 3;
        TextView textView = this.E;
        textView.setEnabled(z10);
        boolean z11 = i7 == 4;
        TextView textView2 = this.F;
        textView2.setEnabled(z11);
        s0Var.setAlpha((i7 == 1 || i7 == 2) ? 1.0f : 0.0f);
        s0Var.setScaleX((i7 == 1 || i7 == 2) ? 1.0f : 0.6f);
        s0Var.setScaleY((i7 == 1 || i7 == 2) ? 1.0f : 0.6f);
        s0Var.setVisibility((i7 == 1 || i7 == 2) ? 0 : 8);
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
        boolean z12 = gd.a0;
        TextView textView3 = this.c;
        xb xbVar = this.b;
        if (z12) {
            ((ViewGroup.MarginLayoutParams) xbVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
        } else {
            ((ViewGroup.MarginLayoutParams) xbVar.getLayoutParams()).rightMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
        }
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            canvas.drawLine(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (gd.a0 ? org.telegram.messenger.g0.L(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        mp mpVar = this.e;
        if (mpVar == null || !mpVar.a.q) {
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
    }
}
