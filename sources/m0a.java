// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class m0a extends c79 {
    public final /* synthetic */ n1a c;

    public m0a(n1a n1aVar) {
        this.c = n1aVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 2 || i == 1 || i == 3 || i == 8;
    }

    @Override // j79
    public final int b() {
        return this.c.v0;
    }

    @Override // j79
    public final long c(int i) {
        return Math.abs(((Long) this.c.w0.get(i)).longValue());
    }

    @Override // j79
    public final int d(int i) {
        n1a n1aVar = this.c;
        if (i == n1aVar.a) {
            return 7;
        }
        if (i >= n1aVar.b && i < n1aVar.c) {
            return 1;
        }
        if (i >= n1aVar.d && i < n1aVar.e) {
            return 1;
        }
        if (i >= n1aVar.F && i < n1aVar.G) {
            return 1;
        }
        if (i >= n1aVar.r && i < n1aVar.s) {
            return 3;
        }
        if (n1aVar.z0.indexOfKey(i) >= 0) {
            return 4;
        }
        if (n1aVar.A0.indexOfKey(i) >= 0) {
            return 5;
        }
        if (i == n1aVar.w) {
            return 6;
        }
        if (n1aVar.x0.indexOfKey(i) >= 0 || i == n1aVar.f || i == n1aVar.E || i == n1aVar.n || i == n1aVar.h || i == n1aVar.y) {
            return 0;
        }
        return i == n1aVar.x ? 8 : 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07dd  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.animation.ValueAnimator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v26 */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        boolean z;
        TLRPC.Document document;
        int i2;
        boolean z2;
        hm hmVar;
        int cacheType;
        int cacheType2;
        c14 c14Var;
        ?? r3;
        int i3;
        ?? r11;
        boolean z3;
        String a0;
        w49 w49Var;
        int cacheType3;
        int i4;
        String str;
        n1a n1aVar = this.c;
        ArrayList arrayList = n1aVar.H0;
        ArrayList arrayList2 = n1aVar.L0;
        ArrayList arrayList3 = n1aVar.G0;
        SparseIntArray sparseIntArray = n1aVar.x0;
        boolean z4 = n1aVar.O0;
        ArrayList arrayList4 = n1aVar.E0;
        int i5 = n1aVar.a0;
        ArrayList arrayList5 = n1aVar.N0;
        k0a k0aVar = n1aVar.i0;
        HashSet hashSet = n1aVar.L;
        int i6 = n1aVar.W;
        ArrayList arrayList6 = n1aVar.F0;
        int i7 = f89Var.f;
        View view = f89Var.a;
        if (i7 == 8) {
            w0a w0aVar = (w0a) view;
            w0aVar.c = i;
            w0aVar.M = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = n1aVar.W1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i7 == 6) {
            TextView textView = (TextView) view;
            if (n1aVar.Q0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i8 = calendar.get(6);
                    int i9 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i8 && i9 == calendar.get(1)) ? ob6.a0(null, null, 2131743764, ob6.D0().o0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? ob6.D0().v0().format(new Date(intValue)) : ob6.D0().h0().format(new Date(intValue));
                    i4 = 1;
                } catch (Exception e) {
                    i4 = 1;
                    cc4.g(e, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i4];
                objArr[0] = str;
                textView.setText(ob6.a0("EmojiStatusExpireHint", null, 2131751130, objArr));
                return;
            }
            return;
        }
        if (i7 == 0) {
            s0a s0aVar = (s0a) view;
            if (i == n1aVar.y) {
                s0aVar.a(ob6.M0(2131745376, null), false);
                s0aVar.c.setVisibility(8);
                return;
            }
            if (i == n1aVar.f) {
                s0aVar.a(ob6.M0(2131746088, null), false);
                s0aVar.c.setVisibility(8);
                return;
            }
            if (i == n1aVar.E) {
                s0aVar.a(ob6.M0(2131744533, null), false);
                s0aVar.c.setVisibility(8);
                return;
            }
            s0aVar.c.setVisibility(8);
            if (i == n1aVar.h) {
                s0aVar.a(ob6.M0(2131746828, null), false);
                return;
            }
            if (i == n1aVar.n) {
                s0aVar.a(ob6.M0(2131751140, null), false);
                return;
            }
            int i10 = sparseIntArray.get(i);
            if (i10 < 0) {
                s0aVar.a(null, false);
                return;
            }
            c14 c14Var2 = (c14) arrayList5.get(i10);
            if (c14Var2.d != null) {
                ls6.d0(i6).n0(c14Var2.d, false);
                c14Var2.d = null;
            }
            s0aVar.a(c14Var2.b.title, (i5 == 5 || i5 == 7 || i5 == 6 || c14Var2.e || yac.h(i6).p()) ? false : true);
            return;
        }
        if (i7 == 1) {
            w0a w0aVar2 = (w0a) view;
            w0aVar2.c = i;
            ImageReceiver imageReceiver = w0aVar2.n;
            int i11 = n1aVar.b;
            if (i < i11 || i >= n1aVar.c) {
                int i12 = n1aVar.F;
                w49Var = (i < i12 || i >= n1aVar.G) ? (w49) n1aVar.I0.get(i - n1aVar.d) : (w49) n1aVar.K0.get(i - i12);
            } else {
                w49Var = (w49) n1aVar.J0.get(i - i11);
            }
            if (i5 == 13) {
                w0aVar2.b = false;
                w0aVar2.E = true;
                w0aVar2.y = w49Var;
                w0aVar2.setDrawable(pv3.g(w49Var.f));
                w0aVar2.d(n1aVar.K.contains(w49Var), false);
                return;
            }
            w0aVar2.a(k0aVar);
            w0aVar2.E = true;
            w0aVar2.y = w49Var;
            w0aVar2.d(n1aVar.K.contains(w49Var), false);
            w0aVar2.b = false;
            if (w49Var.b || w49Var.f == null) {
                w0aVar2.s = false;
                w0aVar2.e = new hm(w49Var.g, (Paint.FontMetricsInt) null);
                w0aVar2.d = null;
                w0aVar2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) k0aVar.l3.get(w0aVar2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = n1aVar.getCacheType();
                    if (cacheType3 == 3 && w49Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = wl.m(i6, w0aVar2.e.getDocumentId(), null, cacheType3);
                    k0aVar.l3.put(w0aVar2.e.getDocumentId(), drawable);
                }
                w0aVar2.setDrawable(drawable);
            } else {
                w0aVar2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i6).r.get(w49Var.f);
                if (tL_availableReaction != null) {
                    ggb f = lp3.f(tL_availableReaction.activate_animation, aob.m6, 0.2f, null);
                    boolean e2 = i86.e(8200);
                    ImageReceiver imageReceiver2 = w0aVar2.h;
                    TLRPC.Document document2 = tL_availableReaction.select_animation;
                    if (e2) {
                        w49 w49Var2 = w49Var;
                        imageReceiver2.Y(jn5.b(document2), "60_60_pcache", jn5.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f, 0L, "tgs", w49Var2, 0);
                        w49Var = w49Var2;
                    } else {
                        imageReceiver2.Z(jn5.b(document2), "60_60_firstframe", null, null, f, 0L, "tgs", w49Var, 0);
                    }
                    ls6.d0(i6);
                    ls6.n1(imageReceiver, jn5.b(tL_availableReaction.around_animation), s49.a());
                } else {
                    w0aVar2.h.f();
                    imageReceiver.f();
                }
                w0aVar2.e = null;
                w0aVar2.d = null;
                w0aVar2.setDrawable(null);
                v0a v0aVar = w0aVar2.K;
                if (v0aVar != null) {
                    v0aVar.setVisibility(8);
                    w0aVar2.K.setImageReceiver(null);
                }
            }
            if (!yac.h(i6).p() && i5 == 14 && w49Var.b && w49Var.d) {
                w0aVar2.b();
                w0aVar2.K.setVisibility(0);
                w0aVar2.setEmojicon(null);
                return;
            }
            if (w49Var.e) {
                w0aVar2.setEmojicon(w49Var.f);
            } else {
                w0aVar2.setEmojicon(null);
            }
            v0a v0aVar2 = w0aVar2.K;
            if (v0aVar2 != null) {
                v0aVar2.setVisibility(4);
                return;
            }
            return;
        }
        if (i7 == 4) {
            r0a r0aVar = (r0a) view;
            int i13 = n1aVar.z0.get(i);
            c14 c14Var3 = (i13 < 0 || i13 >= arrayList5.size()) ? null : (c14) arrayList5.get(i13);
            if (i13 == -1) {
                n1aVar.H = r0aVar;
                r0aVar.a.setText("+" + ((arrayList4.size() - 40) + (z4 ? 1 : 0) + 1));
                return;
            }
            r0a r0aVar2 = n1aVar.H;
            if (c14Var3 == null) {
                if (r0aVar2 == r0aVar) {
                    n1aVar.H = null;
                    return;
                }
                return;
            } else {
                if (r0aVar2 == r0aVar) {
                    n1aVar.H = null;
                }
                TextView textView2 = r0aVar.a;
                StringBuilder sb = new StringBuilder("+");
                sb.append(c14Var3.c.size() - 23);
                textView2.setText(sb.toString());
                return;
            }
        }
        if (i7 == 5) {
            q0a q0aVar = (q0a) view;
            int i14 = n1aVar.A0.get(i);
            if (i14 < 0 || i14 >= arrayList5.size() || (c14Var = (c14) arrayList5.get(i14)) == null) {
                return;
            }
            String str2 = c14Var.b.title;
            boolean z5 = (c14Var.e || yac.h(i6).p()) ? false : true;
            boolean z6 = c14Var.f;
            ae aeVar = new ae((Object) this, (Object) c14Var, i14, (byte) 15);
            ok8 ok8Var = q0aVar.c;
            FrameLayout frameLayout = q0aVar.a;
            q0aVar.d = str2;
            if (z5) {
                i3 = 8;
                frameLayout.setVisibility(8);
                r3 = 0;
                ok8Var.setVisibility(0);
                r11 = 0;
                ok8Var.b(ob6.a0("UnlockPremiumEmojiPack", null, 2131743517, str2), aeVar, false);
            } else {
                r3 = 0;
                i3 = 8;
                r11 = 0;
                ok8Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(aeVar);
            }
            if (z6) {
                a0 = ob6.M0(2131754355, r11);
                z3 = true;
            } else {
                z3 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r3] = q0aVar.d;
                a0 = ob6.a0("AddStickersCount", r11, 2131754381, objArr2);
            }
            q0aVar.b.c(a0, r3, z3);
            frameLayout.setContentDescription(a0);
            ValueAnimator valueAnimator2 = q0aVar.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                q0aVar.e = r11;
            }
            frameLayout.setEnabled(!z6);
            frameLayout.setAlpha(z6 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = q0aVar.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                q0aVar.n = null;
            }
            Boolean bool = q0aVar.h;
            if (bool == null || bool.booleanValue() != z5) {
                q0aVar.h = Boolean.valueOf(z5);
                float f2 = z5 ? 1.0f : 0.0f;
                q0aVar.f = f2;
                frameLayout.setAlpha(1.0f - f2);
                ok8Var.setAlpha(q0aVar.f);
                ok8Var.setScaleX(q0aVar.f);
                ok8Var.setScaleY(q0aVar.f);
                ok8Var.setVisibility(q0aVar.h.booleanValue() ? 0 : i3);
                return;
            }
            return;
        }
        if (i7 == 7 || i7 == 9) {
            return;
        }
        w0a w0aVar3 = (w0a) view;
        w0aVar3.w = null;
        w0aVar3.x = null;
        w0aVar3.a = false;
        w0aVar3.c = i;
        w0aVar3.setPadding(hl.L(1.0f), hl.L(1.0f), hl.L(1.0f), hl.L(1.0f));
        int size = ((i5 == 4 && n1aVar.R) || i5 == 6) ? arrayList3.size() : (i5 == 4 || i5 == 3) ? arrayList4.size() : (arrayList4.size() <= 40 || n1aVar.D0) ? arrayList4.size() + (z4 ? 1 : 0) : 40;
        if (z4) {
            if (i == (n1aVar.a != -1 ? 1 : 0) + (n1aVar.w != -1 ? 1 : 0)) {
                z2 = hashSet.contains(null);
                w0aVar3.a = true;
                w0aVar3.setPadding(hl.L(5.0f), hl.L(5.0f), hl.L(5.0f), hl.L(5.0f));
                w0aVar3.e = null;
                w0aVar3.d = null;
                w0aVar3.R = false;
                ImageReceiver imageReceiver3 = w0aVar3.h;
                if (imageReceiver3 != null) {
                    imageReceiver3.f();
                }
                hmVar = w0aVar3.e;
                if (hmVar == null) {
                    wl wlVar = (wl) k0aVar.l3.get(hmVar.getDocumentId());
                    if (wlVar == null) {
                        if (w0aVar3.e.document != null) {
                            cacheType2 = n1aVar.getCacheType();
                            wlVar = wl.l(i6, cacheType2, w0aVar3.e.document);
                        } else {
                            cacheType = n1aVar.getCacheType();
                            wlVar = wl.m(i6, w0aVar3.e.getDocumentId(), null, cacheType);
                        }
                        k0aVar.l3.put(w0aVar3.e.getDocumentId(), wlVar);
                    }
                    w0aVar3.setDrawable(wlVar);
                } else {
                    w0aVar3.setDrawable(null);
                }
                w0aVar3.d(z2, false);
            }
        }
        if (i5 == 13) {
            if ((i - (n1aVar.a != -1 ? 1 : 0)) - (n1aVar.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i - (n1aVar.a != -1 ? 1 : 0)) - (n1aVar.w != -1 ? 1 : 0)) - (z4 ? 1 : 0));
                w0aVar3.b = false;
                w0aVar3.E = false;
                w0aVar3.y = w49.b(str3);
                w0aVar3.setDrawable(pv3.g(str3));
                w0aVar3.d(n1aVar.K.contains(w0aVar3.y), false);
                return;
            }
        }
        int i15 = n1aVar.a;
        int i16 = i - (i15 != -1 ? 1 : 0);
        int i17 = n1aVar.w;
        if (i16 - (i17 != -1 ? 1 : 0) < size) {
            int i18 = ((i - (i15 != -1 ? 1 : 0)) - (i17 != -1 ? 1 : 0)) - (z4 ? 1 : 0);
            if (i5 == 4 && n1aVar.R) {
                w0aVar3.c((TLRPC.Document) arrayList3.get(i18), k0aVar);
            } else {
                if (i5 == 6) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList3.get(i18);
                    w0aVar3.c(document3, k0aVar);
                    if (document3 != null && hashSet.contains(Long.valueOf(document3.id))) {
                        z = true;
                    }
                } else {
                    hm hmVar2 = (hm) arrayList4.get(i18);
                    w0aVar3.e = hmVar2;
                    w0aVar3.d = hmVar2 == null ? null : hmVar2.document;
                    z = hmVar2 != null && hashSet.contains(Long.valueOf(hmVar2.getDocumentId()));
                    w0aVar3.R = false;
                    ImageReceiver imageReceiver4 = w0aVar3.h;
                    if (imageReceiver4 != null) {
                        imageReceiver4.f();
                    }
                }
                z2 = z;
            }
            z = false;
            z2 = z;
        } else {
            if (arrayList6.isEmpty() || (i2 = i - n1aVar.r) < 0 || i2 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (qd4.f(i - (n1aVar.a != -1 ? 1 : 0), n1aVar.w != -1 ? 1 : 0, size, 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (qd4.f(i - (n1aVar.a != -1 ? 1 : 0), n1aVar.w != -1 ? 1 : 0, size, 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            hm hmVar3 = (hm) arrayList2.get(qd4.f(i - (n1aVar.a != -1 ? 1 : 0), n1aVar.w != -1 ? 1 : 0, size, 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            w0aVar3.e = hmVar3;
                            w0aVar3.d = hmVar3 == null ? null : hmVar3.document;
                            z = hmVar3 != null && hashSet.contains(Long.valueOf(hmVar3.getDocumentId()));
                            w0aVar3.R = false;
                            ImageReceiver imageReceiver5 = w0aVar3.h;
                            if (imageReceiver5 != null) {
                                imageReceiver5.f();
                            }
                        }
                    }
                }
                for (int i19 = 0; i19 < sparseIntArray.size(); i19++) {
                    int keyAt = sparseIntArray.keyAt(i19);
                    int valueAt = sparseIntArray.valueAt(i19);
                    c14 c14Var4 = valueAt >= 0 ? (c14) arrayList5.get(valueAt) : null;
                    if (c14Var4 != null) {
                        boolean z7 = c14Var4.h;
                        ArrayList arrayList7 = c14Var4.c;
                        int size2 = z7 ? arrayList7.size() : Math.min(arrayList7.size(), 24);
                        int i20 = (i - keyAt) - 1;
                        if (i20 >= 0 && i20 < size2 && (document = (TLRPC.Document) c14Var4.c.get(i20)) != null) {
                            if (n1aVar.R) {
                                w0aVar3.c(document, n1aVar.j0);
                            } else {
                                w0aVar3.R = false;
                                ImageReceiver imageReceiver6 = w0aVar3.h;
                                if (imageReceiver6 != null) {
                                    imageReceiver6.f();
                                }
                                w0aVar3.e = new hm(document, (Paint.FontMetricsInt) null);
                            }
                            w0aVar3.d = document;
                        }
                    }
                }
                hm hmVar4 = w0aVar3.e;
                if (hmVar4 != null && hashSet.contains(Long.valueOf(hmVar4.getDocumentId()))) {
                    z = true;
                }
                z = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i - n1aVar.r);
                TLRPC.Document document4 = tL_starGiftUnique.getDocument();
                w0aVar3.e = new hm(document4, (Paint.FontMetricsInt) null);
                w0aVar3.d = document4;
                w0aVar3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    w0aVar3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z = w0aVar3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                w0aVar3.R = false;
                ImageReceiver imageReceiver7 = w0aVar3.h;
                if (imageReceiver7 != null) {
                    imageReceiver7.f();
                }
            }
            z2 = z;
        }
        hmVar = w0aVar3.e;
        if (hmVar == null) {
        }
        w0aVar3.d(z2, false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        n1a n1aVar = this.c;
        int i2 = n1aVar.a0;
        vnb vnbVar = n1aVar.a1;
        if (i == 0) {
            view = new s0a(n1aVar, n1aVar.getContext(), i2 == 6);
        } else if (i == 2) {
            view = new ImageView(n1aVar.getContext());
        } else if (i == 3 || i == 1 || i == 8) {
            w0a w0aVar = new w0a(n1aVar, n1aVar.getContext());
            if (i == 8) {
                w0aVar.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(w0aVar);
                w0aVar.h = imageReceiver;
                w0aVar.r = imageReceiver;
                imageReceiver.g0(n1aVar.O);
                n1aVar.P = w0aVar;
                w0aVar.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
            }
            view = w0aVar;
        } else if (i == 4) {
            Context context = n1aVar.getContext();
            r0a r0aVar = new r0a(context);
            TextView textView = new TextView(context);
            r0aVar.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int v = n1aVar.h1 ? aob.v(n1aVar.g1, aob.p1(0.4f, aob.w0(null, aob.d6, false))) : vm2.o(aob.w0(null, aob.Lf, false), 99);
            if (n1aVar.h1) {
                textView.setBackground(aob.b0(hl.L(11.0f), v));
            } else {
                ShapeDrawable b0 = aob.b0(hl.L(11.0f), v);
                uob g = yob.g(aob.Lf, 99);
                textView.setBackground(b0);
                yob.j(textView, b0, g, null, null);
            }
            textView.setTypeface(hl.o());
            textView.setPadding(hl.L(4.0f), hl.L(1.66f), hl.L(4.0f), hl.L(2.0f));
            r0aVar.addView(textView, tre.e(-2, -2, 17));
            view = r0aVar;
        } else if (i == 5) {
            q0a q0aVar = new q0a(n1aVar.getContext());
            si siVar = new si(q0aVar.getContext(), false, false, false, (byte) 3);
            q0aVar.b = siVar;
            siVar.b(0.3f, 250L, k43.h);
            siVar.setTextSize(hl.L(14.0f));
            siVar.setTypeface(hl.o());
            yob.U(siVar, aob.Ji, vnbVar);
            siVar.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(q0aVar.getContext());
            q0aVar.a = frameLayout;
            int i3 = aob.Fi;
            hf0 e = rnb.e(aob.v0(i3, vnbVar), 8.0f);
            uob M = yob.M(i3);
            uob e2 = yob.e(i3);
            frameLayout.setBackground(e);
            yob.j(frameLayout, e, M, e2, vnbVar);
            frameLayout.addView(siVar, tre.e(-1, -2, 17));
            q0aVar.addView(frameLayout, tre.c(-1.0f, -1));
            ok8 ok8Var = new ok8(vnbVar, q0aVar.getContext(), false);
            q0aVar.c = ok8Var;
            ok8Var.setIcon(R.raw.unlock_icon);
            q0aVar.addView(ok8Var, tre.c(-1.0f, -1));
            view = q0aVar;
        } else if (i == 6) {
            c19 c19Var = new c19(n1aVar.getContext(), (byte) 1);
            c19Var.setTextSize(1, 13.0f);
            if (i2 == 3) {
                c19Var.setText(ob6.M0(2131745376, null));
            } else if (i2 == 0 || i2 == 12 || i2 == 9 || i2 == 10) {
                c19Var.setText(ob6.M0(2131751141, null));
            } else {
                c19Var.setText(ob6.M0(2131746107, null));
            }
            c19Var.setGravity(17);
            yob.X(c19Var, aob.y6, vnbVar);
            view = c19Var;
        } else if (i == 7) {
            View ak4Var = new ak4(n1aVar.getContext(), 52, (byte) 0);
            ak4Var.setTag("searchbox");
            view = ak4Var;
        } else {
            view = new w0a(n1aVar, n1aVar.getContext());
        }
        if (n1aVar.g()) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new n69(view);
    }
}
