package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g21 extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ g31 c;

    public g21(g31 g31Var) {
        this.c = g31Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.u0;
    }

    @Override // s4.g0
    public final long c(int i10) {
        return Math.abs(((Long) this.c.v0.get(i10)).longValue());
    }

    @Override // s4.g0
    public final int d(int i10) {
        g31 g31Var = this.c;
        if (i10 == g31Var.a) {
            return 7;
        }
        if (i10 >= g31Var.b && i10 < g31Var.c) {
            return 1;
        }
        if (i10 >= g31Var.d && i10 < g31Var.e) {
            return 1;
        }
        if (i10 >= g31Var.E && i10 < g31Var.F) {
            return 1;
        }
        if (i10 >= g31Var.r && i10 < g31Var.s) {
            return 3;
        }
        if (g31Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (g31Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == g31Var.w) {
            return 6;
        }
        if (g31Var.w0.indexOfKey(i10) >= 0 || i10 == g31Var.f || i10 == g31Var.D || i10 == g31Var.n || i10 == g31Var.h || i10 == g31Var.y) {
            return 0;
        }
        return i10 == g31Var.x ? 8 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:420:0x07ad, code lost:
    
        if (r13.contains(java.lang.Long.valueOf(r0.getDocumentId())) != false) goto L308;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07f9  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.animation.ValueAnimator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i11;
        boolean z11;
        org.telegram.ui.Components.o5 o5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.ix ixVar;
        int i12;
        ?? r92;
        ?? r12;
        boolean z12;
        String a02;
        sg.o0 o0Var;
        int cacheType3;
        int i13;
        String str;
        g31 g31Var = this.c;
        ArrayList arrayList = g31Var.G0;
        ArrayList arrayList2 = g31Var.K0;
        ArrayList arrayList3 = g31Var.F0;
        SparseIntArray sparseIntArray = g31Var.w0;
        boolean z13 = g31Var.N0;
        ArrayList arrayList4 = g31Var.D0;
        int i14 = g31Var.W;
        ArrayList arrayList5 = g31Var.M0;
        e21 e21Var = g31Var.h0;
        HashSet hashSet = g31Var.K;
        ArrayList arrayList6 = g31Var.E0;
        int i15 = g31Var.V;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 8) {
            q21 q21Var = (q21) view;
            q21Var.c = i10;
            q21Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = g31Var.V1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i16 == 6) {
            TextView textView = (TextView) view;
            if (g31Var.P0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i17 = calendar.get(6);
                    int i18 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i17 && i18 == calendar.get(1)) ? org.telegram.messenger.dd.a0(null, null, 2131744136, org.telegram.messenger.dd.D0().o0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? org.telegram.messenger.dd.D0().v0().format(new Date(intValue)) : org.telegram.messenger.dd.D0().h0().format(new Date(intValue));
                    i13 = 1;
                } catch (Exception e) {
                    i13 = 1;
                    org.telegram.messenger.f8.g(e, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i13];
                objArr[0] = str;
                textView.setText(org.telegram.messenger.dd.a0("EmojiStatusExpireHint", null, 2131751166, objArr));
                return;
            }
            return;
        }
        if (i16 == 0) {
            m21 m21Var = (m21) view;
            if (i10 == g31Var.y) {
                m21Var.a(org.telegram.messenger.dd.L0(2131745665, null), false);
                m21Var.c.setVisibility(8);
                return;
            }
            if (i10 == g31Var.f) {
                m21Var.a(org.telegram.messenger.dd.L0(2131746376, null), false);
                m21Var.c.setVisibility(8);
                return;
            }
            if (i10 == g31Var.D) {
                m21Var.a(org.telegram.messenger.dd.L0(2131744894, null), false);
                m21Var.c.setVisibility(8);
                return;
            }
            m21Var.c.setVisibility(8);
            if (i10 == g31Var.h) {
                m21Var.a(org.telegram.messenger.dd.L0(2131747116, null), false);
                return;
            }
            if (i10 == g31Var.n) {
                m21Var.a(org.telegram.messenger.dd.L0(2131751176, null), false);
                return;
            }
            int i19 = sparseIntArray.get(i10);
            if (i19 < 0) {
                m21Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.ix ixVar2 = (org.telegram.ui.Components.ix) arrayList5.get(i19);
            if (ixVar2.d != null) {
                org.telegram.messenger.vi.b0(i15).m0(ixVar2.d, false);
                ixVar2.d = null;
            }
            m21Var.a(ixVar2.b.title, (i14 == 5 || i14 == 7 || i14 == 6 || ixVar2.e || org.telegram.messenger.e20.i(i15).q()) ? false : true);
            return;
        }
        if (i16 == 1) {
            q21 q21Var2 = (q21) view;
            q21Var2.c = i10;
            ImageReceiver imageReceiver = q21Var2.n;
            int i20 = g31Var.b;
            if (i10 < i20 || i10 >= g31Var.c) {
                int i21 = g31Var.E;
                o0Var = (i10 < i21 || i10 >= g31Var.F) ? (sg.o0) g31Var.H0.get(i10 - g31Var.d) : (sg.o0) g31Var.J0.get(i10 - i21);
            } else {
                o0Var = (sg.o0) g31Var.I0.get(i10 - i20);
            }
            if (i14 == 13) {
                q21Var2.b = false;
                q21Var2.D = true;
                q21Var2.y = o0Var;
                q21Var2.setDrawable(org.telegram.messenger.k6.g(o0Var.f));
                q21Var2.d(g31Var.J.contains(o0Var), false);
                return;
            }
            q21Var2.a(e21Var);
            q21Var2.D = true;
            q21Var2.y = o0Var;
            q21Var2.d(g31Var.J.contains(o0Var), false);
            q21Var2.b = false;
            if (o0Var.b || o0Var.f == null) {
                q21Var2.s = false;
                q21Var2.e = new org.telegram.ui.Components.o5(o0Var.g, (Paint.FontMetricsInt) null);
                q21Var2.d = null;
                q21Var2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) e21Var.k3.get(q21Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = g31Var.getCacheType();
                    if (cacheType3 == 3 && o0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.f5.m(i15, q21Var2.e.getDocumentId(), null, cacheType3);
                    e21Var.k3.put(q21Var2.e.getDocumentId(), drawable);
                }
                q21Var2.setDrawable(drawable);
            } else {
                q21Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.vi.b0(i15).r.get(o0Var.f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.d00 f7 = org.telegram.messenger.v5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.t6.m6, 0.2f, null);
                    if (org.telegram.messenger.tc.e(8200)) {
                        sg.o0 o0Var2 = o0Var;
                        q21Var2.h.u0(org.telegram.messenger.jc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.jc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f7, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    } else {
                        q21Var2.h.r0(org.telegram.messenger.jc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f7, 0L, "tgs", o0Var, 0);
                    }
                    org.telegram.messenger.vi.b0(i15);
                    org.telegram.messenger.vi.m1(imageReceiver, org.telegram.messenger.jc.b(tL_availableReaction.around_animation), sg.k0.a());
                } else {
                    q21Var2.h.f();
                    imageReceiver.f();
                }
                q21Var2.e = null;
                q21Var2.d = null;
                q21Var2.setDrawable(null);
                p21 p21Var = q21Var2.J;
                if (p21Var != null) {
                    p21Var.setVisibility(8);
                    q21Var2.J.setImageReceiver(null);
                }
            }
            if (!org.telegram.messenger.e20.i(i15).q() && i14 == 14 && o0Var.b && o0Var.d) {
                q21Var2.b();
                q21Var2.J.setVisibility(0);
                q21Var2.setEmojicon(null);
                return;
            }
            if (o0Var.e) {
                q21Var2.setEmojicon(o0Var.f);
            } else {
                q21Var2.setEmojicon(null);
            }
            p21 p21Var2 = q21Var2.J;
            if (p21Var2 != null) {
                p21Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i16 == 4) {
            l21 l21Var = (l21) view;
            int i22 = g31Var.y0.get(i10);
            org.telegram.ui.Components.ix ixVar3 = (i22 < 0 || i22 >= arrayList5.size()) ? null : (org.telegram.ui.Components.ix) arrayList5.get(i22);
            if (i22 == -1) {
                g31Var.G = l21Var;
                l21Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (ixVar3 == null) {
                if (g31Var.G == l21Var) {
                    g31Var.G = null;
                    return;
                }
                return;
            } else {
                if (g31Var.G == l21Var) {
                    g31Var.G = null;
                }
                TextView textView2 = l21Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(ixVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i16 == 5) {
            k21 k21Var = (k21) view;
            int i23 = g31Var.z0.get(i10);
            if (i23 < 0 || i23 >= arrayList5.size() || (ixVar = (org.telegram.ui.Components.ix) arrayList5.get(i23)) == null) {
                return;
            }
            String str2 = ixVar.b.title;
            boolean z14 = (ixVar.e || org.telegram.messenger.e20.i(i15).q()) ? false : true;
            boolean z15 = ixVar.f;
            jg.w1 w1Var = new jg.w1(this, ixVar, i23, 18);
            kg.x0 x0Var = k21Var.c;
            FrameLayout frameLayout = k21Var.a;
            k21Var.d = str2;
            if (z14) {
                i12 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                x0Var.setVisibility(0);
                r12 = 0;
                x0Var.b(org.telegram.messenger.dd.a0("UnlockPremiumEmojiPack", null, 2131743887, str2), w1Var, false);
            } else {
                i12 = 8;
                r92 = 0;
                r12 = 0;
                x0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(w1Var);
            }
            if (z15) {
                a02 = org.telegram.messenger.dd.L0(2131754362, r12);
                z12 = true;
            } else {
                z12 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r92] = k21Var.d;
                a02 = org.telegram.messenger.dd.a0("AddStickersCount", r12, 2131754388, objArr2);
            }
            k21Var.b.c(a02, r92, z12);
            frameLayout.setContentDescription(a02);
            ValueAnimator valueAnimator2 = k21Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                k21Var.e = r12;
            }
            frameLayout.setEnabled(!z15);
            frameLayout.setAlpha(z15 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = k21Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                k21Var.n = null;
            }
            Boolean bool = k21Var.h;
            if (bool == null || bool.booleanValue() != z14) {
                k21Var.h = Boolean.valueOf(z14);
                float f10 = z14 ? 1.0f : 0.0f;
                k21Var.f = f10;
                frameLayout.setAlpha(1.0f - f10);
                x0Var.setAlpha(k21Var.f);
                x0Var.setScaleX(k21Var.f);
                x0Var.setScaleY(k21Var.f);
                x0Var.setVisibility(k21Var.h.booleanValue() ? 0 : i12);
                return;
            }
            return;
        }
        if (i16 == 7 || i16 == 9) {
            return;
        }
        q21 q21Var3 = (q21) view;
        q21Var3.w = null;
        q21Var3.x = null;
        q21Var3.a = false;
        q21Var3.c = i10;
        q21Var3.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
        if ((i14 == 4 && g31Var.Q) || i14 == 6) {
            size = arrayList3.size();
        } else if (i14 == 4 || i14 == 3) {
            size = arrayList4.size();
        } else {
            size = (arrayList4.size() <= 40 || g31Var.C0) ? arrayList4.size() + (z13 ? 1 : 0) : 40;
        }
        if (z13) {
            if (i10 == (g31Var.a != -1 ? 1 : 0) + (g31Var.w != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                q21Var3.a = true;
                q21Var3.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f));
                q21Var3.e = null;
                q21Var3.d = null;
                q21Var3.Q = false;
                ImageReceiver imageReceiver2 = q21Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.f();
                }
                o5Var = q21Var3.e;
                if (o5Var == null) {
                    org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) e21Var.k3.get(o5Var.getDocumentId());
                    if (f5Var == null) {
                        if (q21Var3.e.document != null) {
                            cacheType2 = g31Var.getCacheType();
                            f5Var = org.telegram.ui.Components.f5.l(i15, cacheType2, q21Var3.e.document);
                        } else {
                            cacheType = g31Var.getCacheType();
                            f5Var = org.telegram.ui.Components.f5.m(i15, q21Var3.e.getDocumentId(), null, cacheType);
                        }
                        e21Var.k3.put(q21Var3.e.getDocumentId(), f5Var);
                    }
                    q21Var3.setDrawable(f5Var);
                } else {
                    q21Var3.setDrawable(null);
                }
                q21Var3.d(z11, false);
            }
        }
        if (i14 == 13) {
            if ((i10 - (g31Var.a != -1 ? 1 : 0)) - (g31Var.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i10 - (g31Var.a != -1 ? 1 : 0)) - (g31Var.w != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                q21Var3.b = false;
                q21Var3.D = false;
                q21Var3.y = sg.o0.b(str3);
                q21Var3.setDrawable(org.telegram.messenger.k6.g(str3));
                q21Var3.d(g31Var.J.contains(q21Var3.y), false);
                return;
            }
        }
        int i24 = g31Var.a;
        int i25 = i10 - (i24 != -1 ? 1 : 0);
        int i26 = g31Var.w;
        if (i25 - (i26 != -1 ? 1 : 0) < size) {
            int i27 = ((i10 - (i24 != -1 ? 1 : 0)) - (i26 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i14 == 4 && g31Var.Q) {
                q21Var3.c((TLRPC.Document) arrayList3.get(i27), e21Var);
            } else {
                if (i14 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i27);
                    q21Var3.c(document2, e21Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.o5 o5Var2 = (org.telegram.ui.Components.o5) arrayList4.get(i27);
                    q21Var3.e = o5Var2;
                    q21Var3.d = o5Var2 == null ? null : o5Var2.document;
                    z10 = o5Var2 != null && hashSet.contains(Long.valueOf(o5Var2.getDocumentId()));
                    q21Var3.Q = false;
                    ImageReceiver imageReceiver3 = q21Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.f();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - g31Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (g31Var.a != -1 ? 1 : 0)) - (g31Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (g31Var.a != -1 ? 1 : 0)) - (g31Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.o5 o5Var3 = (org.telegram.ui.Components.o5) arrayList2.get(((((i10 - (g31Var.a != -1 ? 1 : 0)) - (g31Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            q21Var3.e = o5Var3;
                            q21Var3.d = o5Var3 == null ? null : o5Var3.document;
                            z10 = o5Var3 != null && hashSet.contains(Long.valueOf(o5Var3.getDocumentId()));
                            q21Var3.Q = false;
                            ImageReceiver imageReceiver4 = q21Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.f();
                            }
                        }
                    }
                }
                for (int i28 = 0; i28 < sparseIntArray.size(); i28++) {
                    int keyAt = sparseIntArray.keyAt(i28);
                    int valueAt = sparseIntArray.valueAt(i28);
                    org.telegram.ui.Components.ix ixVar4 = valueAt >= 0 ? (org.telegram.ui.Components.ix) arrayList5.get(valueAt) : null;
                    if (ixVar4 != null) {
                        int size2 = ixVar4.h ? ixVar4.c.size() : Math.min(ixVar4.c.size(), 24);
                        int i29 = (i10 - keyAt) - 1;
                        if (i29 >= 0 && i29 < size2 && (document = (TLRPC.Document) ixVar4.c.get(i29)) != null) {
                            if (g31Var.Q) {
                                q21Var3.c(document, g31Var.i0);
                            } else {
                                q21Var3.Q = false;
                                ImageReceiver imageReceiver5 = q21Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.f();
                                }
                                q21Var3.e = new org.telegram.ui.Components.o5(document, (Paint.FontMetricsInt) null);
                            }
                            q21Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.o5 o5Var4 = q21Var3.e;
                if (o5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - g31Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                q21Var3.e = new org.telegram.ui.Components.o5(document3, (Paint.FontMetricsInt) null);
                q21Var3.d = document3;
                q21Var3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    q21Var3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = q21Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                q21Var3.Q = false;
                ImageReceiver imageReceiver6 = q21Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.f();
                }
            }
            z11 = z10;
        }
        o5Var = q21Var3.e;
        if (o5Var == null) {
        }
        q21Var3.d(z11, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        g31 g31Var = this.c;
        int i11 = g31Var.W;
        org.telegram.ui.ActionBar.p6 p6Var = g31Var.Z0;
        if (i10 == 0) {
            view = new m21(g31Var, g31Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(g31Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            q21 q21Var = new q21(g31Var, g31Var.getContext());
            if (i10 == 8) {
                q21Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(q21Var);
                q21Var.h = imageReceiver;
                q21Var.r = imageReceiver;
                imageReceiver.w0(g31Var.N);
                g31Var.O = q21Var;
                q21Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            }
            view = q21Var;
        } else if (i10 == 4) {
            Context context = g31Var.getContext();
            l21 l21Var = new l21(context);
            TextView textView = new TextView(context);
            l21Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int w9 = g31Var.g1 ? org.telegram.ui.ActionBar.t6.w(g31Var.f1, org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false))) : i0.b.o(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.If), 99);
            if (g31Var.g1) {
                textView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(11.0f), w9));
            } else {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(11.0f), w9);
                org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.If, 99);
                textView.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(textView, d02, h, null, null);
            }
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f));
            l21Var.addView(textView, w7.b6.e(-2, -2, 17));
            view = l21Var;
        } else if (i10 == 5) {
            k21 k21Var = new k21(g31Var.getContext());
            org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(k21Var.getContext(), false, false, false, 4);
            k21Var.b = y3Var;
            y3Var.b(0.3f, 250L, org.telegram.ui.Components.gr.h);
            y3Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
            y3Var.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.Z(y3Var, org.telegram.ui.ActionBar.t6.Gi, p6Var);
            y3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(k21Var.getContext());
            k21Var.a = frameLayout;
            int i12 = org.telegram.ui.ActionBar.t6.Ci;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 8.0f);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            org.telegram.ui.ActionBar.w6 f7 = org.telegram.ui.ActionBar.a7.f(i12);
            frameLayout.setBackground(e);
            org.telegram.ui.ActionBar.a7.k(frameLayout, e, N, f7, p6Var);
            frameLayout.addView(y3Var, w7.b6.e(-1, -2, 17));
            k21Var.addView(frameLayout, w7.b6.c(-1.0f, -1));
            kg.x0 x0Var = new kg.x0(k21Var.getContext(), p6Var, false);
            k21Var.c = x0Var;
            x0Var.setIcon(R.raw.unlock_icon);
            k21Var.addView(x0Var, w7.b6.c(-1.0f, -1));
            view = k21Var;
        } else if (i10 == 6) {
            cl0 cl0Var = new cl0(g31Var.getContext(), 1);
            cl0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                cl0Var.setText(org.telegram.messenger.dd.L0(2131745665, null));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                cl0Var.setText(org.telegram.messenger.dd.L0(2131751177, null));
            } else {
                cl0Var.setText(org.telegram.messenger.dd.L0(2131746395, null));
            }
            cl0Var.setGravity(17);
            org.telegram.ui.ActionBar.a7.V(cl0Var, org.telegram.ui.ActionBar.t6.y6, p6Var);
            view = cl0Var;
        } else if (i10 == 7) {
            View x3Var = new org.telegram.ui.Cells.x3(g31Var.getContext(), 52);
            x3Var.setTag("searchbox");
            view = x3Var;
        } else {
            view = new q21(g31Var, g31Var.getContext());
        }
        if (g31.c(g31Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.dk0(view);
    }
}
