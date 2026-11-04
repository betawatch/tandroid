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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g01 extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ g11 c;

    public g01(g11 g11Var) {
        this.c = g11Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 2 || i3 == 1 || i3 == 3 || i3 == 8;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.v0;
    }

    @Override // u4.h0
    public final long c(int i3) {
        return Math.abs(((Long) this.c.w0.get(i3)).longValue());
    }

    @Override // u4.h0
    public final int d(int i3) {
        g11 g11Var = this.c;
        if (i3 == g11Var.a) {
            return 7;
        }
        if (i3 >= g11Var.b && i3 < g11Var.c) {
            return 1;
        }
        if (i3 >= g11Var.d && i3 < g11Var.e) {
            return 1;
        }
        if (i3 >= g11Var.F && i3 < g11Var.G) {
            return 1;
        }
        if (i3 >= g11Var.r && i3 < g11Var.s) {
            return 3;
        }
        if (g11Var.z0.indexOfKey(i3) >= 0) {
            return 4;
        }
        if (g11Var.A0.indexOfKey(i3) >= 0) {
            return 5;
        }
        if (i3 == g11Var.w) {
            return 6;
        }
        if (g11Var.x0.indexOfKey(i3) >= 0 || i3 == g11Var.f || i3 == g11Var.E || i3 == g11Var.n || i3 == g11Var.h || i3 == g11Var.y) {
            return 0;
        }
        return i3 == g11Var.x ? 8 : 3;
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i10;
        boolean z11;
        org.telegram.ui.Components.p5 p5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.sw swVar;
        int i11;
        ?? r9;
        ?? r12;
        boolean z12;
        String a02;
        dh.n0 n0Var;
        int cacheType3;
        int i12;
        String str;
        g11 g11Var = this.c;
        ArrayList arrayList = g11Var.H0;
        ArrayList arrayList2 = g11Var.L0;
        ArrayList arrayList3 = g11Var.G0;
        SparseIntArray sparseIntArray = g11Var.x0;
        boolean z13 = g11Var.O0;
        ArrayList arrayList4 = g11Var.E0;
        int i13 = g11Var.a0;
        ArrayList arrayList5 = g11Var.N0;
        e01 e01Var = g11Var.i0;
        HashSet hashSet = g11Var.L;
        ArrayList arrayList6 = g11Var.F0;
        int i14 = g11Var.W;
        int i15 = d1Var.f;
        View view = d1Var.a;
        if (i15 == 8) {
            q01 q01Var = (q01) view;
            q01Var.c = i3;
            q01Var.M = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = g11Var.W1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (g11Var.Q0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i16 = calendar.get(6);
                    int i17 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i16 && i17 == calendar.get(1)) ? org.telegram.messenger.bd.a0(null, null, 2131744121, org.telegram.messenger.bd.E0().p0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? org.telegram.messenger.bd.E0().w0().format(new Date(intValue)) : org.telegram.messenger.bd.E0().h0().format(new Date(intValue));
                    i12 = 1;
                } catch (Exception e10) {
                    i12 = 1;
                    org.telegram.messenger.a8.g(e10, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i12];
                objArr[0] = str;
                textView.setText(org.telegram.messenger.bd.a0("EmojiStatusExpireHint", null, 2131751166, objArr));
                return;
            }
            return;
        }
        if (i15 == 0) {
            m01 m01Var = (m01) view;
            if (i3 == g11Var.y) {
                m01Var.a(org.telegram.messenger.bd.M0(2131745658, null), false);
                m01Var.c.setVisibility(8);
                return;
            }
            if (i3 == g11Var.f) {
                m01Var.a(org.telegram.messenger.bd.M0(2131746369, null), false);
                m01Var.c.setVisibility(8);
                return;
            }
            if (i3 == g11Var.E) {
                m01Var.a(org.telegram.messenger.bd.M0(2131744886, null), false);
                m01Var.c.setVisibility(8);
                return;
            }
            m01Var.c.setVisibility(8);
            if (i3 == g11Var.h) {
                m01Var.a(org.telegram.messenger.bd.M0(2131747109, null), false);
                return;
            }
            if (i3 == g11Var.n) {
                m01Var.a(org.telegram.messenger.bd.M0(2131751176, null), false);
                return;
            }
            int i18 = sparseIntArray.get(i3);
            if (i18 < 0) {
                m01Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.sw swVar2 = (org.telegram.ui.Components.sw) arrayList5.get(i18);
            if (swVar2.d != null) {
                org.telegram.messenger.li.b0(i14).m0(swVar2.d, false);
                swVar2.d = null;
            }
            m01Var.a(swVar2.b.title, (i13 == 5 || i13 == 7 || i13 == 6 || swVar2.e || org.telegram.messenger.h10.i(i14).q()) ? false : true);
            return;
        }
        if (i15 == 1) {
            q01 q01Var2 = (q01) view;
            q01Var2.c = i3;
            ImageReceiver imageReceiver = q01Var2.n;
            int i19 = g11Var.b;
            if (i3 < i19 || i3 >= g11Var.c) {
                int i20 = g11Var.F;
                n0Var = (i3 < i20 || i3 >= g11Var.G) ? (dh.n0) g11Var.I0.get(i3 - g11Var.d) : (dh.n0) g11Var.K0.get(i3 - i20);
            } else {
                n0Var = (dh.n0) g11Var.J0.get(i3 - i19);
            }
            if (i13 == 13) {
                q01Var2.b = false;
                q01Var2.E = true;
                q01Var2.y = n0Var;
                q01Var2.setDrawable(org.telegram.messenger.i6.g(n0Var.f));
                q01Var2.d(g11Var.K.contains(n0Var), false);
                return;
            }
            q01Var2.a(e01Var);
            q01Var2.E = true;
            q01Var2.y = n0Var;
            q01Var2.d(g11Var.K.contains(n0Var), false);
            q01Var2.b = false;
            if (n0Var.b || n0Var.f == null) {
                q01Var2.s = false;
                q01Var2.e = new org.telegram.ui.Components.p5(n0Var.g, (Paint.FontMetricsInt) null);
                q01Var2.d = null;
                q01Var2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) e01Var.l3.get(q01Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = g11Var.getCacheType();
                    if (cacheType3 == 3 && n0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.g5.m(i14, q01Var2.e.getDocumentId(), null, cacheType3);
                    e01Var.l3.put(q01Var2.e.getDocumentId(), drawable);
                }
                q01Var2.setDrawable(drawable);
            } else {
                q01Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(i14).r.get(n0Var.f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.jz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.m6, 0.2f, null);
                    if (org.telegram.messenger.lc.e(8200)) {
                        dh.n0 n0Var2 = n0Var;
                        q01Var2.h.u0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", n0Var2, 0);
                        n0Var = n0Var2;
                    } else {
                        q01Var2.h.r0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", n0Var, 0);
                    }
                    org.telegram.messenger.li.b0(i14);
                    org.telegram.messenger.li.m1(imageReceiver, org.telegram.messenger.ac.b(tL_availableReaction.around_animation), dh.j0.a());
                } else {
                    q01Var2.h.f();
                    imageReceiver.f();
                }
                q01Var2.e = null;
                q01Var2.d = null;
                q01Var2.setDrawable(null);
                p01 p01Var = q01Var2.K;
                if (p01Var != null) {
                    p01Var.setVisibility(8);
                    q01Var2.K.setImageReceiver(null);
                }
            }
            if (!org.telegram.messenger.h10.i(i14).q() && i13 == 14 && n0Var.b && n0Var.d) {
                q01Var2.b();
                q01Var2.K.setVisibility(0);
                q01Var2.setEmojicon(null);
                return;
            }
            if (n0Var.e) {
                q01Var2.setEmojicon(n0Var.f);
            } else {
                q01Var2.setEmojicon(null);
            }
            p01 p01Var2 = q01Var2.K;
            if (p01Var2 != null) {
                p01Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            l01 l01Var = (l01) view;
            int i21 = g11Var.z0.get(i3);
            org.telegram.ui.Components.sw swVar3 = (i21 < 0 || i21 >= arrayList5.size()) ? null : (org.telegram.ui.Components.sw) arrayList5.get(i21);
            if (i21 == -1) {
                g11Var.H = l01Var;
                l01Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (swVar3 == null) {
                if (g11Var.H == l01Var) {
                    g11Var.H = null;
                    return;
                }
                return;
            } else {
                if (g11Var.H == l01Var) {
                    g11Var.H = null;
                }
                TextView textView2 = l01Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(swVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            k01 k01Var = (k01) view;
            int i22 = g11Var.A0.get(i3);
            if (i22 < 0 || i22 >= arrayList5.size() || (swVar = (org.telegram.ui.Components.sw) arrayList5.get(i22)) == null) {
                return;
            }
            String str2 = swVar.b.title;
            boolean z14 = (swVar.e || org.telegram.messenger.h10.i(i14).q()) ? false : true;
            boolean z15 = swVar.f;
            ai.h3 h3Var = new ai.h3(this, swVar, i22, 20);
            vg.o0 o0Var = k01Var.c;
            FrameLayout frameLayout = k01Var.a;
            k01Var.d = str2;
            if (z14) {
                i11 = 8;
                frameLayout.setVisibility(8);
                r9 = 0;
                o0Var.setVisibility(0);
                r12 = 0;
                o0Var.b(org.telegram.messenger.bd.a0("UnlockPremiumEmojiPack", null, 2131743872, str2), h3Var, false);
            } else {
                i11 = 8;
                r9 = 0;
                r12 = 0;
                o0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(h3Var);
            }
            if (z15) {
                a02 = org.telegram.messenger.bd.M0(2131754362, r12);
                z12 = true;
            } else {
                z12 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r9] = k01Var.d;
                a02 = org.telegram.messenger.bd.a0("AddStickersCount", r12, 2131754388, objArr2);
            }
            k01Var.b.c(a02, r9, z12);
            frameLayout.setContentDescription(a02);
            ValueAnimator valueAnimator2 = k01Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                k01Var.e = r12;
            }
            frameLayout.setEnabled(!z15);
            frameLayout.setAlpha(z15 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = k01Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                k01Var.n = null;
            }
            Boolean bool = k01Var.h;
            if (bool == null || bool.booleanValue() != z14) {
                k01Var.h = Boolean.valueOf(z14);
                float f11 = z14 ? 1.0f : 0.0f;
                k01Var.f = f11;
                frameLayout.setAlpha(1.0f - f11);
                o0Var.setAlpha(k01Var.f);
                o0Var.setScaleX(k01Var.f);
                o0Var.setScaleY(k01Var.f);
                o0Var.setVisibility(k01Var.h.booleanValue() ? 0 : i11);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        q01 q01Var3 = (q01) view;
        q01Var3.w = null;
        q01Var3.x = null;
        q01Var3.a = false;
        q01Var3.c = i3;
        q01Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        if ((i13 == 4 && g11Var.R) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = (arrayList4.size() <= 40 || g11Var.D0) ? arrayList4.size() + (z13 ? 1 : 0) : 40;
        }
        if (z13) {
            if (i3 == (g11Var.a != -1 ? 1 : 0) + (g11Var.w != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                q01Var3.a = true;
                q01Var3.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                q01Var3.e = null;
                q01Var3.d = null;
                q01Var3.R = false;
                ImageReceiver imageReceiver2 = q01Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.f();
                }
                p5Var = q01Var3.e;
                if (p5Var == null) {
                    org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) e01Var.l3.get(p5Var.getDocumentId());
                    if (g5Var == null) {
                        if (q01Var3.e.document != null) {
                            cacheType2 = g11Var.getCacheType();
                            g5Var = org.telegram.ui.Components.g5.l(i14, cacheType2, q01Var3.e.document);
                        } else {
                            cacheType = g11Var.getCacheType();
                            g5Var = org.telegram.ui.Components.g5.m(i14, q01Var3.e.getDocumentId(), null, cacheType);
                        }
                        e01Var.l3.put(q01Var3.e.getDocumentId(), g5Var);
                    }
                    q01Var3.setDrawable(g5Var);
                } else {
                    q01Var3.setDrawable(null);
                }
                q01Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i3 - (g11Var.a != -1 ? 1 : 0)) - (g11Var.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i3 - (g11Var.a != -1 ? 1 : 0)) - (g11Var.w != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                q01Var3.b = false;
                q01Var3.E = false;
                q01Var3.y = dh.n0.b(str3);
                q01Var3.setDrawable(org.telegram.messenger.i6.g(str3));
                q01Var3.d(g11Var.K.contains(q01Var3.y), false);
                return;
            }
        }
        int i23 = g11Var.a;
        int i24 = i3 - (i23 != -1 ? 1 : 0);
        int i25 = g11Var.w;
        if (i24 - (i25 != -1 ? 1 : 0) < size) {
            int i26 = ((i3 - (i23 != -1 ? 1 : 0)) - (i25 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && g11Var.R) {
                q01Var3.c((TLRPC.Document) arrayList3.get(i26), e01Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i26);
                    q01Var3.c(document2, e01Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.p5 p5Var2 = (org.telegram.ui.Components.p5) arrayList4.get(i26);
                    q01Var3.e = p5Var2;
                    q01Var3.d = p5Var2 == null ? null : p5Var2.document;
                    z10 = p5Var2 != null && hashSet.contains(Long.valueOf(p5Var2.getDocumentId()));
                    q01Var3.R = false;
                    ImageReceiver imageReceiver3 = q01Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.f();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i10 = i3 - g11Var.r) < 0 || i10 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i3 - (g11Var.a != -1 ? 1 : 0)) - (g11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i3 - (g11Var.a != -1 ? 1 : 0)) - (g11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.p5 p5Var3 = (org.telegram.ui.Components.p5) arrayList2.get(((((i3 - (g11Var.a != -1 ? 1 : 0)) - (g11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            q01Var3.e = p5Var3;
                            q01Var3.d = p5Var3 == null ? null : p5Var3.document;
                            z10 = p5Var3 != null && hashSet.contains(Long.valueOf(p5Var3.getDocumentId()));
                            q01Var3.R = false;
                            ImageReceiver imageReceiver4 = q01Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.f();
                            }
                        }
                    }
                }
                for (int i27 = 0; i27 < sparseIntArray.size(); i27++) {
                    int keyAt = sparseIntArray.keyAt(i27);
                    int valueAt = sparseIntArray.valueAt(i27);
                    org.telegram.ui.Components.sw swVar4 = valueAt >= 0 ? (org.telegram.ui.Components.sw) arrayList5.get(valueAt) : null;
                    if (swVar4 != null) {
                        int size2 = swVar4.h ? swVar4.c.size() : Math.min(swVar4.c.size(), 24);
                        int i28 = (i3 - keyAt) - 1;
                        if (i28 >= 0 && i28 < size2 && (document = (TLRPC.Document) swVar4.c.get(i28)) != null) {
                            if (g11Var.R) {
                                q01Var3.c(document, g11Var.j0);
                            } else {
                                q01Var3.R = false;
                                ImageReceiver imageReceiver5 = q01Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.f();
                                }
                                q01Var3.e = new org.telegram.ui.Components.p5(document, (Paint.FontMetricsInt) null);
                            }
                            q01Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.p5 p5Var4 = q01Var3.e;
                if (p5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i3 - g11Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                q01Var3.e = new org.telegram.ui.Components.p5(document3, (Paint.FontMetricsInt) null);
                q01Var3.d = document3;
                q01Var3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ci.e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    q01Var3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = q01Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                q01Var3.R = false;
                ImageReceiver imageReceiver6 = q01Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.f();
                }
            }
            z11 = z10;
        }
        p5Var = q01Var3.e;
        if (p5Var == null) {
        }
        q01Var3.d(z11, false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        g11 g11Var = this.c;
        int i10 = g11Var.a0;
        org.telegram.ui.ActionBar.e6 e6Var = g11Var.a1;
        if (i3 == 0) {
            view = new m01(g11Var, g11Var.getContext(), i10 == 6);
        } else if (i3 == 2) {
            view = new ImageView(g11Var.getContext());
        } else if (i3 == 3 || i3 == 1 || i3 == 8) {
            q01 q01Var = new q01(g11Var, g11Var.getContext());
            if (i3 == 8) {
                q01Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(q01Var);
                q01Var.h = imageReceiver;
                q01Var.r = imageReceiver;
                imageReceiver.w0(g11Var.O);
                g11Var.P = q01Var;
                q01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            view = q01Var;
        } else if (i3 == 4) {
            Context context = g11Var.getContext();
            l01 l01Var = new l01(context);
            TextView textView = new TextView(context);
            l01Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int w10 = g11Var.h1 ? org.telegram.ui.ActionBar.k6.w(g11Var.g1, org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false))) : i0.a.o(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.If), 99);
            if (g11Var.h1) {
                textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(11.0f), w10));
            } else {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(11.0f), w10);
                org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.If, 99);
                textView.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(textView, d02, h, null, null);
            }
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
            l01Var.addView(textView, b8.mf.e(-2, -2, 17));
            view = l01Var;
        } else if (i3 == 5) {
            k01 k01Var = new k01(g11Var.getContext());
            org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(k01Var.getContext(), false, false, false, 4);
            k01Var.b = w3Var;
            w3Var.b(0.3f, 250L, org.telegram.ui.Components.xq.h);
            w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            w3Var.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.Z(w3Var, org.telegram.ui.ActionBar.k6.Gi, e6Var);
            w3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(k01Var.getContext());
            k01Var.a = frameLayout;
            int i11 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 8.0f);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i11);
            frameLayout.setBackground(e10);
            org.telegram.ui.ActionBar.r6.k(frameLayout, e10, N, f10, e6Var);
            frameLayout.addView(w3Var, b8.mf.e(-1, -2, 17));
            k01Var.addView(frameLayout, b8.mf.c(-1.0f, -1));
            vg.o0 o0Var = new vg.o0(k01Var.getContext(), e6Var, false);
            k01Var.c = o0Var;
            o0Var.setIcon(R.raw.unlock_icon);
            k01Var.addView(o0Var, b8.mf.c(-1.0f, -1));
            view = k01Var;
        } else if (i3 == 6) {
            jb0 jb0Var = new jb0(g11Var.getContext(), 4);
            jb0Var.setTextSize(1, 13.0f);
            if (i10 == 3) {
                jb0Var.setText(org.telegram.messenger.bd.M0(2131745658, null));
            } else if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
                jb0Var.setText(org.telegram.messenger.bd.M0(2131751177, null));
            } else {
                jb0Var.setText(org.telegram.messenger.bd.M0(2131746388, null));
            }
            jb0Var.setGravity(17);
            org.telegram.ui.ActionBar.r6.V(jb0Var, org.telegram.ui.ActionBar.k6.y6, e6Var);
            view = jb0Var;
        } else if (i3 == 7) {
            View v3Var = new org.telegram.ui.Cells.v3(g11Var.getContext(), 52);
            v3Var.setTag("searchbox");
            view = v3Var;
        } else {
            view = new q01(g11Var, g11Var.getContext());
        }
        if (g11.c(g11Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.bj0(view);
    }
}
