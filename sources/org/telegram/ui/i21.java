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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i21 extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ i31 c;

    public i21(i31 i31Var) {
        this.c = i31Var;
    }

    @Override // org.telegram.ui.Components.sk0
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
        i31 i31Var = this.c;
        if (i10 == i31Var.a) {
            return 7;
        }
        if (i10 >= i31Var.b && i10 < i31Var.c) {
            return 1;
        }
        if (i10 >= i31Var.d && i10 < i31Var.e) {
            return 1;
        }
        if (i10 >= i31Var.E && i10 < i31Var.F) {
            return 1;
        }
        if (i10 >= i31Var.r && i10 < i31Var.s) {
            return 3;
        }
        if (i31Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (i31Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == i31Var.w) {
            return 6;
        }
        if (i31Var.w0.indexOfKey(i10) >= 0 || i10 == i31Var.f || i10 == i31Var.D || i10 == i31Var.n || i10 == i31Var.h || i10 == i31Var.y) {
            return 0;
        }
        return i10 == i31Var.x ? 8 : 3;
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
        i31 i31Var = this.c;
        ArrayList arrayList = i31Var.G0;
        ArrayList arrayList2 = i31Var.K0;
        ArrayList arrayList3 = i31Var.F0;
        SparseIntArray sparseIntArray = i31Var.w0;
        boolean z13 = i31Var.N0;
        ArrayList arrayList4 = i31Var.D0;
        int i14 = i31Var.W;
        ArrayList arrayList5 = i31Var.M0;
        g21 g21Var = i31Var.h0;
        HashSet hashSet = i31Var.K;
        ArrayList arrayList6 = i31Var.E0;
        int i15 = i31Var.V;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 8) {
            s21 s21Var = (s21) view;
            s21Var.c = i10;
            s21Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = i31Var.V1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i16 == 6) {
            TextView textView = (TextView) view;
            if (i31Var.P0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i17 = calendar.get(6);
                    int i18 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i17 && i18 == calendar.get(1)) ? org.telegram.messenger.cd.a0(null, null, 2131744136, org.telegram.messenger.cd.D0().o0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? org.telegram.messenger.cd.D0().v0().format(new Date(intValue)) : org.telegram.messenger.cd.D0().h0().format(new Date(intValue));
                    i13 = 1;
                } catch (Exception e) {
                    i13 = 1;
                    org.telegram.messenger.f8.g(e, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i13];
                objArr[0] = str;
                textView.setText(org.telegram.messenger.cd.a0("EmojiStatusExpireHint", null, 2131751166, objArr));
                return;
            }
            return;
        }
        if (i16 == 0) {
            o21 o21Var = (o21) view;
            if (i10 == i31Var.y) {
                o21Var.a(org.telegram.messenger.cd.L0(2131745665, null), false);
                o21Var.c.setVisibility(8);
                return;
            }
            if (i10 == i31Var.f) {
                o21Var.a(org.telegram.messenger.cd.L0(2131746376, null), false);
                o21Var.c.setVisibility(8);
                return;
            }
            if (i10 == i31Var.D) {
                o21Var.a(org.telegram.messenger.cd.L0(2131744894, null), false);
                o21Var.c.setVisibility(8);
                return;
            }
            o21Var.c.setVisibility(8);
            if (i10 == i31Var.h) {
                o21Var.a(org.telegram.messenger.cd.L0(2131747116, null), false);
                return;
            }
            if (i10 == i31Var.n) {
                o21Var.a(org.telegram.messenger.cd.L0(2131751176, null), false);
                return;
            }
            int i19 = sparseIntArray.get(i10);
            if (i19 < 0) {
                o21Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.ix ixVar2 = (org.telegram.ui.Components.ix) arrayList5.get(i19);
            if (ixVar2.d != null) {
                org.telegram.messenger.ui.b0(i15).m0(ixVar2.d, false);
                ixVar2.d = null;
            }
            o21Var.a(ixVar2.b.title, (i14 == 5 || i14 == 7 || i14 == 6 || ixVar2.e || org.telegram.messenger.d20.i(i15).q()) ? false : true);
            return;
        }
        if (i16 == 1) {
            s21 s21Var2 = (s21) view;
            s21Var2.c = i10;
            ImageReceiver imageReceiver = s21Var2.n;
            int i20 = i31Var.b;
            if (i10 < i20 || i10 >= i31Var.c) {
                int i21 = i31Var.E;
                o0Var = (i10 < i21 || i10 >= i31Var.F) ? (sg.o0) i31Var.H0.get(i10 - i31Var.d) : (sg.o0) i31Var.J0.get(i10 - i21);
            } else {
                o0Var = (sg.o0) i31Var.I0.get(i10 - i20);
            }
            if (i14 == 13) {
                s21Var2.b = false;
                s21Var2.D = true;
                s21Var2.y = o0Var;
                s21Var2.setDrawable(org.telegram.messenger.k6.g(o0Var.f));
                s21Var2.d(i31Var.J.contains(o0Var), false);
                return;
            }
            s21Var2.a(g21Var);
            s21Var2.D = true;
            s21Var2.y = o0Var;
            s21Var2.d(i31Var.J.contains(o0Var), false);
            s21Var2.b = false;
            if (o0Var.b || o0Var.f == null) {
                s21Var2.s = false;
                s21Var2.e = new org.telegram.ui.Components.o5(o0Var.g, (Paint.FontMetricsInt) null);
                s21Var2.d = null;
                s21Var2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) g21Var.k3.get(s21Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = i31Var.getCacheType();
                    if (cacheType3 == 3 && o0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.f5.m(i15, s21Var2.e.getDocumentId(), null, cacheType3);
                    g21Var.k3.put(s21Var2.e.getDocumentId(), drawable);
                }
                s21Var2.setDrawable(drawable);
            } else {
                s21Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i15).r.get(o0Var.f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.c00 f7 = org.telegram.messenger.v5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.t6.m6, 0.2f, null);
                    if (org.telegram.messenger.sc.e(8200)) {
                        sg.o0 o0Var2 = o0Var;
                        s21Var2.h.u0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f7, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    } else {
                        s21Var2.h.r0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f7, 0L, "tgs", o0Var, 0);
                    }
                    org.telegram.messenger.ui.b0(i15);
                    org.telegram.messenger.ui.m1(imageReceiver, org.telegram.messenger.ic.b(tL_availableReaction.around_animation), sg.k0.a());
                } else {
                    s21Var2.h.f();
                    imageReceiver.f();
                }
                s21Var2.e = null;
                s21Var2.d = null;
                s21Var2.setDrawable(null);
                r21 r21Var = s21Var2.J;
                if (r21Var != null) {
                    r21Var.setVisibility(8);
                    s21Var2.J.setImageReceiver(null);
                }
            }
            if (!org.telegram.messenger.d20.i(i15).q() && i14 == 14 && o0Var.b && o0Var.d) {
                s21Var2.b();
                s21Var2.J.setVisibility(0);
                s21Var2.setEmojicon(null);
                return;
            }
            if (o0Var.e) {
                s21Var2.setEmojicon(o0Var.f);
            } else {
                s21Var2.setEmojicon(null);
            }
            r21 r21Var2 = s21Var2.J;
            if (r21Var2 != null) {
                r21Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i16 == 4) {
            n21 n21Var = (n21) view;
            int i22 = i31Var.y0.get(i10);
            org.telegram.ui.Components.ix ixVar3 = (i22 < 0 || i22 >= arrayList5.size()) ? null : (org.telegram.ui.Components.ix) arrayList5.get(i22);
            if (i22 == -1) {
                i31Var.G = n21Var;
                n21Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (ixVar3 == null) {
                if (i31Var.G == n21Var) {
                    i31Var.G = null;
                    return;
                }
                return;
            } else {
                if (i31Var.G == n21Var) {
                    i31Var.G = null;
                }
                TextView textView2 = n21Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(ixVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i16 == 5) {
            m21 m21Var = (m21) view;
            int i23 = i31Var.z0.get(i10);
            if (i23 < 0 || i23 >= arrayList5.size() || (ixVar = (org.telegram.ui.Components.ix) arrayList5.get(i23)) == null) {
                return;
            }
            String str2 = ixVar.b.title;
            boolean z14 = (ixVar.e || org.telegram.messenger.d20.i(i15).q()) ? false : true;
            boolean z15 = ixVar.f;
            jg.w1 w1Var = new jg.w1(this, ixVar, i23, 18);
            kg.x0 x0Var = m21Var.c;
            FrameLayout frameLayout = m21Var.a;
            m21Var.d = str2;
            if (z14) {
                i12 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                x0Var.setVisibility(0);
                r12 = 0;
                x0Var.b(org.telegram.messenger.cd.a0("UnlockPremiumEmojiPack", null, 2131743887, str2), w1Var, false);
            } else {
                i12 = 8;
                r92 = 0;
                r12 = 0;
                x0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(w1Var);
            }
            if (z15) {
                a02 = org.telegram.messenger.cd.L0(2131754362, r12);
                z12 = true;
            } else {
                z12 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r92] = m21Var.d;
                a02 = org.telegram.messenger.cd.a0("AddStickersCount", r12, 2131754388, objArr2);
            }
            m21Var.b.c(a02, r92, z12);
            frameLayout.setContentDescription(a02);
            ValueAnimator valueAnimator2 = m21Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                m21Var.e = r12;
            }
            frameLayout.setEnabled(!z15);
            frameLayout.setAlpha(z15 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = m21Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                m21Var.n = null;
            }
            Boolean bool = m21Var.h;
            if (bool == null || bool.booleanValue() != z14) {
                m21Var.h = Boolean.valueOf(z14);
                float f10 = z14 ? 1.0f : 0.0f;
                m21Var.f = f10;
                frameLayout.setAlpha(1.0f - f10);
                x0Var.setAlpha(m21Var.f);
                x0Var.setScaleX(m21Var.f);
                x0Var.setScaleY(m21Var.f);
                x0Var.setVisibility(m21Var.h.booleanValue() ? 0 : i12);
                return;
            }
            return;
        }
        if (i16 == 7 || i16 == 9) {
            return;
        }
        s21 s21Var3 = (s21) view;
        s21Var3.w = null;
        s21Var3.x = null;
        s21Var3.a = false;
        s21Var3.c = i10;
        s21Var3.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
        if ((i14 == 4 && i31Var.Q) || i14 == 6) {
            size = arrayList3.size();
        } else if (i14 == 4 || i14 == 3) {
            size = arrayList4.size();
        } else {
            size = (arrayList4.size() <= 40 || i31Var.C0) ? arrayList4.size() + (z13 ? 1 : 0) : 40;
        }
        if (z13) {
            if (i10 == (i31Var.a != -1 ? 1 : 0) + (i31Var.w != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                s21Var3.a = true;
                s21Var3.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f));
                s21Var3.e = null;
                s21Var3.d = null;
                s21Var3.Q = false;
                ImageReceiver imageReceiver2 = s21Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.f();
                }
                o5Var = s21Var3.e;
                if (o5Var == null) {
                    org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) g21Var.k3.get(o5Var.getDocumentId());
                    if (f5Var == null) {
                        if (s21Var3.e.document != null) {
                            cacheType2 = i31Var.getCacheType();
                            f5Var = org.telegram.ui.Components.f5.l(i15, cacheType2, s21Var3.e.document);
                        } else {
                            cacheType = i31Var.getCacheType();
                            f5Var = org.telegram.ui.Components.f5.m(i15, s21Var3.e.getDocumentId(), null, cacheType);
                        }
                        g21Var.k3.put(s21Var3.e.getDocumentId(), f5Var);
                    }
                    s21Var3.setDrawable(f5Var);
                } else {
                    s21Var3.setDrawable(null);
                }
                s21Var3.d(z11, false);
            }
        }
        if (i14 == 13) {
            if ((i10 - (i31Var.a != -1 ? 1 : 0)) - (i31Var.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i10 - (i31Var.a != -1 ? 1 : 0)) - (i31Var.w != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                s21Var3.b = false;
                s21Var3.D = false;
                s21Var3.y = sg.o0.b(str3);
                s21Var3.setDrawable(org.telegram.messenger.k6.g(str3));
                s21Var3.d(i31Var.J.contains(s21Var3.y), false);
                return;
            }
        }
        int i24 = i31Var.a;
        int i25 = i10 - (i24 != -1 ? 1 : 0);
        int i26 = i31Var.w;
        if (i25 - (i26 != -1 ? 1 : 0) < size) {
            int i27 = ((i10 - (i24 != -1 ? 1 : 0)) - (i26 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i14 == 4 && i31Var.Q) {
                s21Var3.c((TLRPC.Document) arrayList3.get(i27), g21Var);
            } else {
                if (i14 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i27);
                    s21Var3.c(document2, g21Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.o5 o5Var2 = (org.telegram.ui.Components.o5) arrayList4.get(i27);
                    s21Var3.e = o5Var2;
                    s21Var3.d = o5Var2 == null ? null : o5Var2.document;
                    z10 = o5Var2 != null && hashSet.contains(Long.valueOf(o5Var2.getDocumentId()));
                    s21Var3.Q = false;
                    ImageReceiver imageReceiver3 = s21Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.f();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - i31Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (i31Var.a != -1 ? 1 : 0)) - (i31Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (i31Var.a != -1 ? 1 : 0)) - (i31Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.o5 o5Var3 = (org.telegram.ui.Components.o5) arrayList2.get(((((i10 - (i31Var.a != -1 ? 1 : 0)) - (i31Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            s21Var3.e = o5Var3;
                            s21Var3.d = o5Var3 == null ? null : o5Var3.document;
                            z10 = o5Var3 != null && hashSet.contains(Long.valueOf(o5Var3.getDocumentId()));
                            s21Var3.Q = false;
                            ImageReceiver imageReceiver4 = s21Var3.h;
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
                            if (i31Var.Q) {
                                s21Var3.c(document, i31Var.i0);
                            } else {
                                s21Var3.Q = false;
                                ImageReceiver imageReceiver5 = s21Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.f();
                                }
                                s21Var3.e = new org.telegram.ui.Components.o5(document, (Paint.FontMetricsInt) null);
                            }
                            s21Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.o5 o5Var4 = s21Var3.e;
                if (o5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - i31Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                s21Var3.e = new org.telegram.ui.Components.o5(document3, (Paint.FontMetricsInt) null);
                s21Var3.d = document3;
                s21Var3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    s21Var3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = s21Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                s21Var3.Q = false;
                ImageReceiver imageReceiver6 = s21Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.f();
                }
            }
            z11 = z10;
        }
        o5Var = s21Var3.e;
        if (o5Var == null) {
        }
        s21Var3.d(z11, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        i31 i31Var = this.c;
        int i11 = i31Var.W;
        org.telegram.ui.ActionBar.p6 p6Var = i31Var.Z0;
        if (i10 == 0) {
            view = new o21(i31Var, i31Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(i31Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            s21 s21Var = new s21(i31Var, i31Var.getContext());
            if (i10 == 8) {
                s21Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(s21Var);
                s21Var.h = imageReceiver;
                s21Var.r = imageReceiver;
                imageReceiver.w0(i31Var.N);
                i31Var.O = s21Var;
                s21Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            }
            view = s21Var;
        } else if (i10 == 4) {
            Context context = i31Var.getContext();
            n21 n21Var = new n21(context);
            TextView textView = new TextView(context);
            n21Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int w9 = i31Var.g1 ? org.telegram.ui.ActionBar.t6.w(i31Var.f1, org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false))) : i0.b.o(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.If), 99);
            if (i31Var.g1) {
                textView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(11.0f), w9));
            } else {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(11.0f), w9);
                org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.If, 99);
                textView.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(textView, d02, h, null, null);
            }
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f));
            n21Var.addView(textView, w7.b6.e(-2, -2, 17));
            view = n21Var;
        } else if (i10 == 5) {
            m21 m21Var = new m21(i31Var.getContext());
            org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(m21Var.getContext(), false, false, false, 4);
            m21Var.b = y3Var;
            y3Var.b(0.3f, 250L, org.telegram.ui.Components.gr.h);
            y3Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
            y3Var.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.Z(y3Var, org.telegram.ui.ActionBar.t6.Gi, p6Var);
            y3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(m21Var.getContext());
            m21Var.a = frameLayout;
            int i12 = org.telegram.ui.ActionBar.t6.Ci;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 8.0f);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            org.telegram.ui.ActionBar.w6 f7 = org.telegram.ui.ActionBar.a7.f(i12);
            frameLayout.setBackground(e);
            org.telegram.ui.ActionBar.a7.k(frameLayout, e, N, f7, p6Var);
            frameLayout.addView(y3Var, w7.b6.e(-1, -2, 17));
            m21Var.addView(frameLayout, w7.b6.c(-1.0f, -1));
            kg.x0 x0Var = new kg.x0(m21Var.getContext(), p6Var, false);
            m21Var.c = x0Var;
            x0Var.setIcon(R.raw.unlock_icon);
            m21Var.addView(x0Var, w7.b6.c(-1.0f, -1));
            view = m21Var;
        } else if (i10 == 6) {
            el0 el0Var = new el0(i31Var.getContext(), 1);
            el0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                el0Var.setText(org.telegram.messenger.cd.L0(2131745665, null));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                el0Var.setText(org.telegram.messenger.cd.L0(2131751177, null));
            } else {
                el0Var.setText(org.telegram.messenger.cd.L0(2131746395, null));
            }
            el0Var.setGravity(17);
            org.telegram.ui.ActionBar.a7.V(el0Var, org.telegram.ui.ActionBar.t6.y6, p6Var);
            view = el0Var;
        } else if (i10 == 7) {
            View x3Var = new org.telegram.ui.Cells.x3(i31Var.getContext(), 52);
            x3Var.setTag("searchbox");
            view = x3Var;
        } else {
            view = new s21(i31Var, i31Var.getContext());
        }
        if (i31.c(i31Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.ck0(view);
    }
}
