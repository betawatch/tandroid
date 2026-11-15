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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n01 extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ n11 c;

    public n01(n11 n11Var) {
        this.c = n11Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.v0;
    }

    @Override // v4.h0
    public final long c(int i7) {
        return Math.abs(((Long) this.c.w0.get(i7)).longValue());
    }

    @Override // v4.h0
    public final int d(int i7) {
        n11 n11Var = this.c;
        if (i7 == n11Var.a) {
            return 7;
        }
        if (i7 >= n11Var.b && i7 < n11Var.c) {
            return 1;
        }
        if (i7 >= n11Var.d && i7 < n11Var.e) {
            return 1;
        }
        if (i7 >= n11Var.F && i7 < n11Var.G) {
            return 1;
        }
        if (i7 >= n11Var.r && i7 < n11Var.s) {
            return 3;
        }
        if (n11Var.z0.indexOfKey(i7) >= 0) {
            return 4;
        }
        if (n11Var.A0.indexOfKey(i7) >= 0) {
            return 5;
        }
        if (i7 == n11Var.w) {
            return 6;
        }
        if (n11Var.x0.indexOfKey(i7) >= 0 || i7 == n11Var.f || i7 == n11Var.E || i7 == n11Var.n || i7 == n11Var.h || i7 == n11Var.y) {
            return 0;
        }
        return i7 == n11Var.x ? 8 : 3;
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
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i10;
        boolean z11;
        org.telegram.ui.Components.p5 p5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.zw zwVar;
        int i11;
        ?? r92;
        ?? r12;
        boolean z12;
        String a02;
        ch.p0 p0Var;
        int cacheType3;
        int i12;
        String str;
        n11 n11Var = this.c;
        ArrayList arrayList = n11Var.H0;
        ArrayList arrayList2 = n11Var.L0;
        ArrayList arrayList3 = n11Var.G0;
        SparseIntArray sparseIntArray = n11Var.x0;
        boolean z13 = n11Var.O0;
        ArrayList arrayList4 = n11Var.E0;
        int i13 = n11Var.a0;
        ArrayList arrayList5 = n11Var.N0;
        l01 l01Var = n11Var.i0;
        HashSet hashSet = n11Var.L;
        ArrayList arrayList6 = n11Var.F0;
        int i14 = n11Var.W;
        int i15 = e1Var.f;
        View view = e1Var.a;
        if (i15 == 8) {
            x01 x01Var = (x01) view;
            x01Var.c = i7;
            x01Var.M = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = n11Var.W1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (n11Var.Q0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i16 = calendar.get(6);
                    int i17 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i16 && i17 == calendar.get(1)) ? org.telegram.messenger.hd.a0(null, null, 2131744111, org.telegram.messenger.hd.E0().p0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? org.telegram.messenger.hd.E0().w0().format(new Date(intValue)) : org.telegram.messenger.hd.E0().h0().format(new Date(intValue));
                    i12 = 1;
                } catch (Exception e10) {
                    i12 = 1;
                    org.telegram.messenger.a8.g(e10, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i12];
                objArr[0] = str;
                textView.setText(org.telegram.messenger.hd.a0("EmojiStatusExpireHint", null, 2131751165, objArr));
                return;
            }
            return;
        }
        if (i15 == 0) {
            t01 t01Var = (t01) view;
            if (i7 == n11Var.y) {
                t01Var.a(org.telegram.messenger.hd.M0(2131745648, null), false);
                t01Var.c.setVisibility(8);
                return;
            }
            if (i7 == n11Var.f) {
                t01Var.a(org.telegram.messenger.hd.M0(2131746361, null), false);
                t01Var.c.setVisibility(8);
                return;
            }
            if (i7 == n11Var.E) {
                t01Var.a(org.telegram.messenger.hd.M0(2131744876, null), false);
                t01Var.c.setVisibility(8);
                return;
            }
            t01Var.c.setVisibility(8);
            if (i7 == n11Var.h) {
                t01Var.a(org.telegram.messenger.hd.M0(2131747101, null), false);
                return;
            }
            if (i7 == n11Var.n) {
                t01Var.a(org.telegram.messenger.hd.M0(2131751175, null), false);
                return;
            }
            int i18 = sparseIntArray.get(i7);
            if (i18 < 0) {
                t01Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.zw zwVar2 = (org.telegram.ui.Components.zw) arrayList5.get(i18);
            if (zwVar2.d != null) {
                org.telegram.messenger.si.b0(i14).m0(zwVar2.d, false);
                zwVar2.d = null;
            }
            t01Var.a(zwVar2.b.title, (i13 == 5 || i13 == 7 || i13 == 6 || zwVar2.e || org.telegram.messenger.m10.i(i14).q()) ? false : true);
            return;
        }
        if (i15 == 1) {
            x01 x01Var2 = (x01) view;
            x01Var2.c = i7;
            ImageReceiver imageReceiver = x01Var2.n;
            int i19 = n11Var.b;
            if (i7 < i19 || i7 >= n11Var.c) {
                int i20 = n11Var.F;
                p0Var = (i7 < i20 || i7 >= n11Var.G) ? (ch.p0) n11Var.I0.get(i7 - n11Var.d) : (ch.p0) n11Var.K0.get(i7 - i20);
            } else {
                p0Var = (ch.p0) n11Var.J0.get(i7 - i19);
            }
            if (i13 == 13) {
                x01Var2.b = false;
                x01Var2.E = true;
                x01Var2.y = p0Var;
                x01Var2.setDrawable(org.telegram.messenger.j6.g(p0Var.f));
                x01Var2.d(n11Var.K.contains(p0Var), false);
                return;
            }
            x01Var2.a(l01Var);
            x01Var2.E = true;
            x01Var2.y = p0Var;
            x01Var2.d(n11Var.K.contains(p0Var), false);
            x01Var2.b = false;
            if (p0Var.b || p0Var.f == null) {
                x01Var2.s = false;
                x01Var2.e = new org.telegram.ui.Components.p5(p0Var.g, (Paint.FontMetricsInt) null);
                x01Var2.d = null;
                x01Var2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) l01Var.l3.get(x01Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = n11Var.getCacheType();
                    if (cacheType3 == 3 && p0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.g5.m(i14, x01Var2.e.getDocumentId(), null, cacheType3);
                    l01Var.l3.put(x01Var2.e.getDocumentId(), drawable);
                }
                x01Var2.setDrawable(drawable);
            } else {
                x01Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.b0(i14).r.get(p0Var.f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.pz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f, null);
                    if (org.telegram.messenger.qc.e(8200)) {
                        ch.p0 p0Var2 = p0Var;
                        x01Var2.h.u0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    } else {
                        x01Var2.h.r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", p0Var, 0);
                    }
                    org.telegram.messenger.si.b0(i14);
                    org.telegram.messenger.si.m1(imageReceiver, org.telegram.messenger.gc.b(tL_availableReaction.around_animation), ch.l0.a());
                } else {
                    x01Var2.h.f();
                    imageReceiver.f();
                }
                x01Var2.e = null;
                x01Var2.d = null;
                x01Var2.setDrawable(null);
                w01 w01Var = x01Var2.K;
                if (w01Var != null) {
                    w01Var.setVisibility(8);
                    x01Var2.K.setImageReceiver(null);
                }
            }
            if (!org.telegram.messenger.m10.i(i14).q() && i13 == 14 && p0Var.b && p0Var.d) {
                x01Var2.b();
                x01Var2.K.setVisibility(0);
                x01Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                x01Var2.setEmojicon(p0Var.f);
            } else {
                x01Var2.setEmojicon(null);
            }
            w01 w01Var2 = x01Var2.K;
            if (w01Var2 != null) {
                w01Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            s01 s01Var = (s01) view;
            int i21 = n11Var.z0.get(i7);
            org.telegram.ui.Components.zw zwVar3 = (i21 < 0 || i21 >= arrayList5.size()) ? null : (org.telegram.ui.Components.zw) arrayList5.get(i21);
            if (i21 == -1) {
                n11Var.H = s01Var;
                s01Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (zwVar3 == null) {
                if (n11Var.H == s01Var) {
                    n11Var.H = null;
                    return;
                }
                return;
            } else {
                if (n11Var.H == s01Var) {
                    n11Var.H = null;
                }
                TextView textView2 = s01Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(zwVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            r01 r01Var = (r01) view;
            int i22 = n11Var.A0.get(i7);
            if (i22 < 0 || i22 >= arrayList5.size() || (zwVar = (org.telegram.ui.Components.zw) arrayList5.get(i22)) == null) {
                return;
            }
            String str2 = zwVar.b.title;
            boolean z14 = (zwVar.e || org.telegram.messenger.m10.i(i14).q()) ? false : true;
            boolean z15 = zwVar.f;
            bi.x2 x2Var = new bi.x2(this, zwVar, i22, 21);
            ug.q0 q0Var = r01Var.c;
            FrameLayout frameLayout = r01Var.a;
            r01Var.d = str2;
            if (z14) {
                i11 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                q0Var.setVisibility(0);
                r12 = 0;
                q0Var.b(org.telegram.messenger.hd.a0("UnlockPremiumEmojiPack", null, 2131743862, str2), x2Var, false);
            } else {
                i11 = 8;
                r92 = 0;
                r12 = 0;
                q0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(x2Var);
            }
            if (z15) {
                a02 = org.telegram.messenger.hd.M0(2131754362, r12);
                z12 = true;
            } else {
                z12 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r92] = r01Var.d;
                a02 = org.telegram.messenger.hd.a0("AddStickersCount", r12, 2131754388, objArr2);
            }
            r01Var.b.c(a02, r92, z12);
            frameLayout.setContentDescription(a02);
            ValueAnimator valueAnimator2 = r01Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                r01Var.e = r12;
            }
            frameLayout.setEnabled(!z15);
            frameLayout.setAlpha(z15 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = r01Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                r01Var.n = null;
            }
            Boolean bool = r01Var.h;
            if (bool == null || bool.booleanValue() != z14) {
                r01Var.h = Boolean.valueOf(z14);
                float f11 = z14 ? 1.0f : 0.0f;
                r01Var.f = f11;
                frameLayout.setAlpha(1.0f - f11);
                q0Var.setAlpha(r01Var.f);
                q0Var.setScaleX(r01Var.f);
                q0Var.setScaleY(r01Var.f);
                q0Var.setVisibility(r01Var.h.booleanValue() ? 0 : i11);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        x01 x01Var3 = (x01) view;
        x01Var3.w = null;
        x01Var3.x = null;
        x01Var3.a = false;
        x01Var3.c = i7;
        x01Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        if ((i13 == 4 && n11Var.R) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = (arrayList4.size() <= 40 || n11Var.D0) ? arrayList4.size() + (z13 ? 1 : 0) : 40;
        }
        if (z13) {
            if (i7 == (n11Var.a != -1 ? 1 : 0) + (n11Var.w != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                x01Var3.a = true;
                x01Var3.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                x01Var3.e = null;
                x01Var3.d = null;
                x01Var3.R = false;
                ImageReceiver imageReceiver2 = x01Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.f();
                }
                p5Var = x01Var3.e;
                if (p5Var == null) {
                    org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) l01Var.l3.get(p5Var.getDocumentId());
                    if (g5Var == null) {
                        if (x01Var3.e.document != null) {
                            cacheType2 = n11Var.getCacheType();
                            g5Var = org.telegram.ui.Components.g5.l(i14, cacheType2, x01Var3.e.document);
                        } else {
                            cacheType = n11Var.getCacheType();
                            g5Var = org.telegram.ui.Components.g5.m(i14, x01Var3.e.getDocumentId(), null, cacheType);
                        }
                        l01Var.l3.put(x01Var3.e.getDocumentId(), g5Var);
                    }
                    x01Var3.setDrawable(g5Var);
                } else {
                    x01Var3.setDrawable(null);
                }
                x01Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i7 - (n11Var.a != -1 ? 1 : 0)) - (n11Var.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i7 - (n11Var.a != -1 ? 1 : 0)) - (n11Var.w != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                x01Var3.b = false;
                x01Var3.E = false;
                x01Var3.y = ch.p0.b(str3);
                x01Var3.setDrawable(org.telegram.messenger.j6.g(str3));
                x01Var3.d(n11Var.K.contains(x01Var3.y), false);
                return;
            }
        }
        int i23 = n11Var.a;
        int i24 = i7 - (i23 != -1 ? 1 : 0);
        int i25 = n11Var.w;
        if (i24 - (i25 != -1 ? 1 : 0) < size) {
            int i26 = ((i7 - (i23 != -1 ? 1 : 0)) - (i25 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && n11Var.R) {
                x01Var3.c((TLRPC.Document) arrayList3.get(i26), l01Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i26);
                    x01Var3.c(document2, l01Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.p5 p5Var2 = (org.telegram.ui.Components.p5) arrayList4.get(i26);
                    x01Var3.e = p5Var2;
                    x01Var3.d = p5Var2 == null ? null : p5Var2.document;
                    z10 = p5Var2 != null && hashSet.contains(Long.valueOf(p5Var2.getDocumentId()));
                    x01Var3.R = false;
                    ImageReceiver imageReceiver3 = x01Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.f();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i10 = i7 - n11Var.r) < 0 || i10 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i7 - (n11Var.a != -1 ? 1 : 0)) - (n11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i7 - (n11Var.a != -1 ? 1 : 0)) - (n11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.p5 p5Var3 = (org.telegram.ui.Components.p5) arrayList2.get(((((i7 - (n11Var.a != -1 ? 1 : 0)) - (n11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            x01Var3.e = p5Var3;
                            x01Var3.d = p5Var3 == null ? null : p5Var3.document;
                            z10 = p5Var3 != null && hashSet.contains(Long.valueOf(p5Var3.getDocumentId()));
                            x01Var3.R = false;
                            ImageReceiver imageReceiver4 = x01Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.f();
                            }
                        }
                    }
                }
                for (int i27 = 0; i27 < sparseIntArray.size(); i27++) {
                    int keyAt = sparseIntArray.keyAt(i27);
                    int valueAt = sparseIntArray.valueAt(i27);
                    org.telegram.ui.Components.zw zwVar4 = valueAt >= 0 ? (org.telegram.ui.Components.zw) arrayList5.get(valueAt) : null;
                    if (zwVar4 != null) {
                        int size2 = zwVar4.h ? zwVar4.c.size() : Math.min(zwVar4.c.size(), 24);
                        int i28 = (i7 - keyAt) - 1;
                        if (i28 >= 0 && i28 < size2 && (document = (TLRPC.Document) zwVar4.c.get(i28)) != null) {
                            if (n11Var.R) {
                                x01Var3.c(document, n11Var.j0);
                            } else {
                                x01Var3.R = false;
                                ImageReceiver imageReceiver5 = x01Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.f();
                                }
                                x01Var3.e = new org.telegram.ui.Components.p5(document, (Paint.FontMetricsInt) null);
                            }
                            x01Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.p5 p5Var4 = x01Var3.e;
                if (p5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i7 - n11Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                x01Var3.e = new org.telegram.ui.Components.p5(document3, (Paint.FontMetricsInt) null);
                x01Var3.d = document3;
                x01Var3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) di.u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    x01Var3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = x01Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                x01Var3.R = false;
                ImageReceiver imageReceiver6 = x01Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.f();
                }
            }
            z11 = z10;
        }
        p5Var = x01Var3.e;
        if (p5Var == null) {
        }
        x01Var3.d(z11, false);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        n11 n11Var = this.c;
        int i10 = n11Var.a0;
        org.telegram.ui.ActionBar.e6 e6Var = n11Var.a1;
        if (i7 == 0) {
            view = new t01(n11Var, n11Var.getContext(), i10 == 6);
        } else if (i7 == 2) {
            view = new ImageView(n11Var.getContext());
        } else if (i7 == 3 || i7 == 1 || i7 == 8) {
            x01 x01Var = new x01(n11Var, n11Var.getContext());
            if (i7 == 8) {
                x01Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(x01Var);
                x01Var.h = imageReceiver;
                x01Var.r = imageReceiver;
                imageReceiver.w0(n11Var.O);
                n11Var.P = x01Var;
                x01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            view = x01Var;
        } else if (i7 == 4) {
            Context context = n11Var.getContext();
            s01 s01Var = new s01(context);
            TextView textView = new TextView(context);
            s01Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int w10 = n11Var.h1 ? org.telegram.ui.ActionBar.j6.w(n11Var.g1, org.telegram.ui.ActionBar.j6.r1(0.4f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false))) : i0.a.o(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Lf), 99);
            if (n11Var.h1) {
                textView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(11.0f), w10));
            } else {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(11.0f), w10);
                org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(org.telegram.ui.ActionBar.j6.Lf, 99);
                textView.setBackground(d02);
                org.telegram.ui.ActionBar.q6.j(textView, d02, g10, null, null);
            }
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
            s01Var.addView(textView, c8.ja.e(-2, -2, 17));
            view = s01Var;
        } else if (i7 == 5) {
            r01 r01Var = new r01(n11Var.getContext());
            org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(r01Var.getContext(), false, false, false, 4);
            r01Var.b = w3Var;
            w3Var.b(0.3f, 250L, org.telegram.ui.Components.er.h);
            w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            w3Var.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.Y(w3Var, org.telegram.ui.ActionBar.j6.Ji, e6Var);
            w3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(r01Var.getContext());
            r01Var.a = frameLayout;
            int i11 = org.telegram.ui.ActionBar.j6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 8.0f);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
            org.telegram.ui.ActionBar.m6 e11 = org.telegram.ui.ActionBar.q6.e(i11);
            frameLayout.setBackground(e10);
            org.telegram.ui.ActionBar.q6.j(frameLayout, e10, M, e11, e6Var);
            frameLayout.addView(w3Var, c8.ja.e(-1, -2, 17));
            r01Var.addView(frameLayout, c8.ja.c(-1.0f, -1));
            ug.q0 q0Var = new ug.q0(r01Var.getContext(), e6Var, false);
            r01Var.c = q0Var;
            q0Var.setIcon(R.raw.unlock_icon);
            r01Var.addView(q0Var, c8.ja.c(-1.0f, -1));
            view = r01Var;
        } else if (i7 == 6) {
            mb0 mb0Var = new mb0(n11Var.getContext(), 4);
            mb0Var.setTextSize(1, 13.0f);
            if (i10 == 3) {
                mb0Var.setText(org.telegram.messenger.hd.M0(2131745648, null));
            } else if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
                mb0Var.setText(org.telegram.messenger.hd.M0(2131751176, null));
            } else {
                mb0Var.setText(org.telegram.messenger.hd.M0(2131746380, null));
            }
            mb0Var.setGravity(17);
            org.telegram.ui.ActionBar.q6.U(mb0Var, org.telegram.ui.ActionBar.j6.y6, e6Var);
            view = mb0Var;
        } else if (i7 == 7) {
            View v3Var = new org.telegram.ui.Cells.v3(n11Var.getContext(), 52);
            v3Var.setTag("searchbox");
            view = v3Var;
        } else {
            view = new x01(n11Var, n11Var.getContext());
        }
        if (n11.c(n11Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.cj0(view);
    }
}
