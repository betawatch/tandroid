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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q01 extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ q11 c;

    public q01(q11 q11Var) {
        this.c = q11Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.v0;
    }

    @Override // v4.i0
    public final long c(int i7) {
        return Math.abs(((Long) this.c.w0.get(i7)).longValue());
    }

    @Override // v4.i0
    public final int d(int i7) {
        q11 q11Var = this.c;
        if (i7 == q11Var.a) {
            return 7;
        }
        if (i7 >= q11Var.b && i7 < q11Var.c) {
            return 1;
        }
        if (i7 >= q11Var.d && i7 < q11Var.e) {
            return 1;
        }
        if (i7 >= q11Var.F && i7 < q11Var.G) {
            return 1;
        }
        if (i7 >= q11Var.r && i7 < q11Var.s) {
            return 3;
        }
        if (q11Var.z0.indexOfKey(i7) >= 0) {
            return 4;
        }
        if (q11Var.A0.indexOfKey(i7) >= 0) {
            return 5;
        }
        if (i7 == q11Var.w) {
            return 6;
        }
        if (q11Var.x0.indexOfKey(i7) >= 0 || i7 == q11Var.f || i7 == q11Var.E || i7 == q11Var.n || i7 == q11Var.h || i7 == q11Var.y) {
            return 0;
        }
        return i7 == q11Var.x ? 8 : 3;
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
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i10;
        boolean z11;
        org.telegram.ui.Components.x5 x5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.ex exVar;
        int i11;
        ?? r92;
        ?? r12;
        boolean z12;
        String a02;
        ch.p0 p0Var;
        int cacheType3;
        int i12;
        String str;
        q11 q11Var = this.c;
        ArrayList arrayList = q11Var.H0;
        ArrayList arrayList2 = q11Var.L0;
        ArrayList arrayList3 = q11Var.G0;
        SparseIntArray sparseIntArray = q11Var.x0;
        boolean z13 = q11Var.O0;
        ArrayList arrayList4 = q11Var.E0;
        int i13 = q11Var.a0;
        ArrayList arrayList5 = q11Var.N0;
        o01 o01Var = q11Var.i0;
        HashSet hashSet = q11Var.L;
        ArrayList arrayList6 = q11Var.F0;
        int i14 = q11Var.W;
        int i15 = f1Var.f;
        View view = f1Var.a;
        if (i15 == 8) {
            a11 a11Var = (a11) view;
            a11Var.c = i7;
            a11Var.M = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = q11Var.W1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (q11Var.Q0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i16 = calendar.get(6);
                    int i17 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i16 && i17 == calendar.get(1)) ? org.telegram.messenger.gd.a0(null, null, 2131743866, org.telegram.messenger.gd.E0().p0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? org.telegram.messenger.gd.E0().w0().format(new Date(intValue)) : org.telegram.messenger.gd.E0().h0().format(new Date(intValue));
                    i12 = 1;
                } catch (Exception e10) {
                    i12 = 1;
                    org.telegram.messenger.a8.g(e10, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i12];
                objArr[0] = str;
                textView.setText(org.telegram.messenger.gd.a0("EmojiStatusExpireHint", null, 2131751153, objArr));
                return;
            }
            return;
        }
        if (i15 == 0) {
            w01 w01Var = (w01) view;
            if (i7 == q11Var.y) {
                w01Var.a(org.telegram.messenger.gd.N0(2131745452, null), false);
                w01Var.c.setVisibility(8);
                return;
            }
            if (i7 == q11Var.f) {
                w01Var.a(org.telegram.messenger.gd.N0(2131746165, null), false);
                w01Var.c.setVisibility(8);
                return;
            }
            if (i7 == q11Var.E) {
                w01Var.a(org.telegram.messenger.gd.N0(2131744635, null), false);
                w01Var.c.setVisibility(8);
                return;
            }
            w01Var.c.setVisibility(8);
            if (i7 == q11Var.h) {
                w01Var.a(org.telegram.messenger.gd.N0(2131746907, null), false);
                return;
            }
            if (i7 == q11Var.n) {
                w01Var.a(org.telegram.messenger.gd.N0(2131751163, null), false);
                return;
            }
            int i18 = sparseIntArray.get(i7);
            if (i18 < 0) {
                w01Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.ex exVar2 = (org.telegram.ui.Components.ex) arrayList5.get(i18);
            if (exVar2.d != null) {
                org.telegram.messenger.ri.d0(i14).o0(exVar2.d, false);
                exVar2.d = null;
            }
            w01Var.a(exVar2.b.title, (i13 == 5 || i13 == 7 || i13 == 6 || exVar2.e || org.telegram.messenger.i10.i(i14).q()) ? false : true);
            return;
        }
        if (i15 == 1) {
            a11 a11Var2 = (a11) view;
            a11Var2.c = i7;
            ImageReceiver imageReceiver = a11Var2.n;
            int i19 = q11Var.b;
            if (i7 < i19 || i7 >= q11Var.c) {
                int i20 = q11Var.F;
                p0Var = (i7 < i20 || i7 >= q11Var.G) ? (ch.p0) q11Var.I0.get(i7 - q11Var.d) : (ch.p0) q11Var.K0.get(i7 - i20);
            } else {
                p0Var = (ch.p0) q11Var.J0.get(i7 - i19);
            }
            if (i13 == 13) {
                a11Var2.b = false;
                a11Var2.E = true;
                a11Var2.y = p0Var;
                a11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var.f));
                a11Var2.d(q11Var.K.contains(p0Var), false);
                return;
            }
            a11Var2.a(o01Var);
            a11Var2.E = true;
            a11Var2.y = p0Var;
            a11Var2.d(q11Var.K.contains(p0Var), false);
            a11Var2.b = false;
            if (p0Var.b || p0Var.f == null) {
                a11Var2.s = false;
                a11Var2.e = new org.telegram.ui.Components.x5(p0Var.g, (Paint.FontMetricsInt) null);
                a11Var2.d = null;
                a11Var2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) o01Var.l3.get(a11Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = q11Var.getCacheType();
                    if (cacheType3 == 3 && p0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.o5.m(i14, a11Var2.e.getDocumentId(), null, cacheType3);
                    o01Var.l3.put(a11Var2.e.getDocumentId(), drawable);
                }
                a11Var2.setDrawable(drawable);
            } else {
                a11Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i14).r.get(p0Var.f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.kz f10 = org.telegram.messenger.u5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.n6.m6, 0.2f, null);
                    if (org.telegram.messenger.pc.e(8200)) {
                        ch.p0 p0Var2 = p0Var;
                        a11Var2.h.v0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    } else {
                        a11Var2.h.s0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", p0Var, 0);
                    }
                    org.telegram.messenger.ri.d0(i14);
                    org.telegram.messenger.ri.p1(imageReceiver, org.telegram.messenger.fc.b(tL_availableReaction.around_animation), ch.l0.a());
                } else {
                    a11Var2.h.f();
                    imageReceiver.f();
                }
                a11Var2.e = null;
                a11Var2.d = null;
                a11Var2.setDrawable(null);
                z01 z01Var = a11Var2.K;
                if (z01Var != null) {
                    z01Var.setVisibility(8);
                    a11Var2.K.setImageReceiver(null);
                }
            }
            if (!org.telegram.messenger.i10.i(i14).q() && i13 == 14 && p0Var.b && p0Var.d) {
                a11Var2.b();
                a11Var2.K.setVisibility(0);
                a11Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                a11Var2.setEmojicon(p0Var.f);
            } else {
                a11Var2.setEmojicon(null);
            }
            z01 z01Var2 = a11Var2.K;
            if (z01Var2 != null) {
                z01Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            v01 v01Var = (v01) view;
            int i21 = q11Var.z0.get(i7);
            org.telegram.ui.Components.ex exVar3 = (i21 < 0 || i21 >= arrayList5.size()) ? null : (org.telegram.ui.Components.ex) arrayList5.get(i21);
            if (i21 == -1) {
                q11Var.H = v01Var;
                v01Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (exVar3 == null) {
                if (q11Var.H == v01Var) {
                    q11Var.H = null;
                    return;
                }
                return;
            } else {
                if (q11Var.H == v01Var) {
                    q11Var.H = null;
                }
                TextView textView2 = v01Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(exVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            u01 u01Var = (u01) view;
            int i22 = q11Var.A0.get(i7);
            if (i22 < 0 || i22 >= arrayList5.size() || (exVar = (org.telegram.ui.Components.ex) arrayList5.get(i22)) == null) {
                return;
            }
            String str2 = exVar.b.title;
            boolean z14 = (exVar.e || org.telegram.messenger.i10.i(i14).q()) ? false : true;
            boolean z15 = exVar.f;
            bi.k5 k5Var = new bi.k5(this, exVar, i22, 21);
            ug.r0 r0Var = u01Var.c;
            FrameLayout frameLayout = u01Var.a;
            u01Var.d = str2;
            if (z14) {
                i11 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                r0Var.setVisibility(0);
                r12 = 0;
                r0Var.b(org.telegram.messenger.gd.a0("UnlockPremiumEmojiPack", null, 2131743615, str2), k5Var, false);
            } else {
                i11 = 8;
                r92 = 0;
                r12 = 0;
                r0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(k5Var);
            }
            if (z15) {
                a02 = org.telegram.messenger.gd.N0(2131754359, r12);
                z12 = true;
            } else {
                z12 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r92] = u01Var.d;
                a02 = org.telegram.messenger.gd.a0("AddStickersCount", r12, 2131754385, objArr2);
            }
            u01Var.b.c(a02, r92, z12);
            frameLayout.setContentDescription(a02);
            ValueAnimator valueAnimator2 = u01Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                u01Var.e = r12;
            }
            frameLayout.setEnabled(!z15);
            frameLayout.setAlpha(z15 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = u01Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                u01Var.n = null;
            }
            Boolean bool = u01Var.h;
            if (bool == null || bool.booleanValue() != z14) {
                u01Var.h = Boolean.valueOf(z14);
                float f11 = z14 ? 1.0f : 0.0f;
                u01Var.f = f11;
                frameLayout.setAlpha(1.0f - f11);
                r0Var.setAlpha(u01Var.f);
                r0Var.setScaleX(u01Var.f);
                r0Var.setScaleY(u01Var.f);
                r0Var.setVisibility(u01Var.h.booleanValue() ? 0 : i11);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        a11 a11Var3 = (a11) view;
        a11Var3.w = null;
        a11Var3.x = null;
        a11Var3.a = false;
        a11Var3.c = i7;
        a11Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        if ((i13 == 4 && q11Var.R) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = (arrayList4.size() <= 40 || q11Var.D0) ? arrayList4.size() + (z13 ? 1 : 0) : 40;
        }
        if (z13) {
            if (i7 == (q11Var.a != -1 ? 1 : 0) + (q11Var.w != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                a11Var3.a = true;
                a11Var3.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                a11Var3.e = null;
                a11Var3.d = null;
                a11Var3.R = false;
                ImageReceiver imageReceiver2 = a11Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.f();
                }
                x5Var = a11Var3.e;
                if (x5Var == null) {
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) o01Var.l3.get(x5Var.getDocumentId());
                    if (o5Var == null) {
                        if (a11Var3.e.document != null) {
                            cacheType2 = q11Var.getCacheType();
                            o5Var = org.telegram.ui.Components.o5.l(i14, cacheType2, a11Var3.e.document);
                        } else {
                            cacheType = q11Var.getCacheType();
                            o5Var = org.telegram.ui.Components.o5.m(i14, a11Var3.e.getDocumentId(), null, cacheType);
                        }
                        o01Var.l3.put(a11Var3.e.getDocumentId(), o5Var);
                    }
                    a11Var3.setDrawable(o5Var);
                } else {
                    a11Var3.setDrawable(null);
                }
                a11Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i7 - (q11Var.a != -1 ? 1 : 0)) - (q11Var.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i7 - (q11Var.a != -1 ? 1 : 0)) - (q11Var.w != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                a11Var3.b = false;
                a11Var3.E = false;
                a11Var3.y = ch.p0.b(str3);
                a11Var3.setDrawable(org.telegram.messenger.j6.g(str3));
                a11Var3.d(q11Var.K.contains(a11Var3.y), false);
                return;
            }
        }
        int i23 = q11Var.a;
        int i24 = i7 - (i23 != -1 ? 1 : 0);
        int i25 = q11Var.w;
        if (i24 - (i25 != -1 ? 1 : 0) < size) {
            int i26 = ((i7 - (i23 != -1 ? 1 : 0)) - (i25 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && q11Var.R) {
                a11Var3.c((TLRPC.Document) arrayList3.get(i26), o01Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i26);
                    a11Var3.c(document2, o01Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.x5 x5Var2 = (org.telegram.ui.Components.x5) arrayList4.get(i26);
                    a11Var3.e = x5Var2;
                    a11Var3.d = x5Var2 == null ? null : x5Var2.document;
                    z10 = x5Var2 != null && hashSet.contains(Long.valueOf(x5Var2.getDocumentId()));
                    a11Var3.R = false;
                    ImageReceiver imageReceiver3 = a11Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.f();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i10 = i7 - q11Var.r) < 0 || i10 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i7 - (q11Var.a != -1 ? 1 : 0)) - (q11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i7 - (q11Var.a != -1 ? 1 : 0)) - (q11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.x5 x5Var3 = (org.telegram.ui.Components.x5) arrayList2.get(((((i7 - (q11Var.a != -1 ? 1 : 0)) - (q11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            a11Var3.e = x5Var3;
                            a11Var3.d = x5Var3 == null ? null : x5Var3.document;
                            z10 = x5Var3 != null && hashSet.contains(Long.valueOf(x5Var3.getDocumentId()));
                            a11Var3.R = false;
                            ImageReceiver imageReceiver4 = a11Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.f();
                            }
                        }
                    }
                }
                for (int i27 = 0; i27 < sparseIntArray.size(); i27++) {
                    int keyAt = sparseIntArray.keyAt(i27);
                    int valueAt = sparseIntArray.valueAt(i27);
                    org.telegram.ui.Components.ex exVar4 = valueAt >= 0 ? (org.telegram.ui.Components.ex) arrayList5.get(valueAt) : null;
                    if (exVar4 != null) {
                        int size2 = exVar4.h ? exVar4.c.size() : Math.min(exVar4.c.size(), 24);
                        int i28 = (i7 - keyAt) - 1;
                        if (i28 >= 0 && i28 < size2 && (document = (TLRPC.Document) exVar4.c.get(i28)) != null) {
                            if (q11Var.R) {
                                a11Var3.c(document, q11Var.j0);
                            } else {
                                a11Var3.R = false;
                                ImageReceiver imageReceiver5 = a11Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.f();
                                }
                                a11Var3.e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                            }
                            a11Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.x5 x5Var4 = a11Var3.e;
                if (x5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i7 - q11Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                a11Var3.e = new org.telegram.ui.Components.x5(document3, (Paint.FontMetricsInt) null);
                a11Var3.d = document3;
                a11Var3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    a11Var3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = a11Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                a11Var3.R = false;
                ImageReceiver imageReceiver6 = a11Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.f();
                }
            }
            z11 = z10;
        }
        x5Var = a11Var3.e;
        if (x5Var == null) {
        }
        a11Var3.d(z11, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        q11 q11Var = this.c;
        int i10 = q11Var.a0;
        org.telegram.ui.ActionBar.i6 i6Var = q11Var.a1;
        if (i7 == 0) {
            view = new w01(q11Var, q11Var.getContext(), i10 == 6);
        } else if (i7 == 2) {
            view = new ImageView(q11Var.getContext());
        } else if (i7 == 3 || i7 == 1 || i7 == 8) {
            a11 a11Var = new a11(q11Var, q11Var.getContext());
            if (i7 == 8) {
                a11Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(a11Var);
                a11Var.h = imageReceiver;
                a11Var.r = imageReceiver;
                imageReceiver.x0(q11Var.O);
                q11Var.P = a11Var;
                a11Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            view = a11Var;
        } else if (i7 == 4) {
            Context context = q11Var.getContext();
            v01 v01Var = new v01(context);
            TextView textView = new TextView(context);
            v01Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int w10 = q11Var.h1 ? org.telegram.ui.ActionBar.n6.w(q11Var.g1, org.telegram.ui.ActionBar.n6.r1(0.4f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false))) : i0.a.o(org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Lf), 99);
            if (q11Var.h1) {
                textView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(11.0f), w10));
            } else {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(11.0f), w10);
                org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(org.telegram.ui.ActionBar.n6.Lf, 99);
                textView.setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(textView, d02, g10, null, null);
            }
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
            v01Var.addView(textView, c8.na.e(-2, -2, 17));
            view = v01Var;
        } else if (i7 == 5) {
            u01 u01Var = new u01(q11Var.getContext());
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(u01Var.getContext(), false, false, false, 4);
            u01Var.b = x3Var;
            x3Var.b(0.3f, 250L, org.telegram.ui.Components.kr.h);
            x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            x3Var.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.Y(x3Var, org.telegram.ui.ActionBar.n6.Ji, i6Var);
            x3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(u01Var.getContext());
            u01Var.a = frameLayout;
            int i11 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 8.0f);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i11);
            frameLayout.setBackground(e10);
            org.telegram.ui.ActionBar.u6.j(frameLayout, e10, M, e11, i6Var);
            frameLayout.addView(x3Var, c8.na.e(-1, -2, 17));
            u01Var.addView(frameLayout, c8.na.c(-1.0f, -1));
            ug.r0 r0Var = new ug.r0(u01Var.getContext(), i6Var, false);
            u01Var.c = r0Var;
            r0Var.setIcon(R.raw.unlock_icon);
            u01Var.addView(r0Var, c8.na.c(-1.0f, -1));
            view = u01Var;
        } else if (i7 == 6) {
            mb0 mb0Var = new mb0(q11Var.getContext(), 4);
            mb0Var.setTextSize(1, 13.0f);
            if (i10 == 3) {
                mb0Var.setText(org.telegram.messenger.gd.N0(2131745452, null));
            } else if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
                mb0Var.setText(org.telegram.messenger.gd.N0(2131751164, null));
            } else {
                mb0Var.setText(org.telegram.messenger.gd.N0(2131746184, null));
            }
            mb0Var.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(mb0Var, org.telegram.ui.ActionBar.n6.y6, i6Var);
            view = mb0Var;
        } else if (i7 == 7) {
            View w3Var = new org.telegram.ui.Cells.w3(q11Var.getContext(), 52);
            w3Var.setTag("searchbox");
            view = w3Var;
        } else {
            view = new a11(q11Var, q11Var.getContext());
        }
        if (q11.c(q11Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.mj0(view);
    }
}
