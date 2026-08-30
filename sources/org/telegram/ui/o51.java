package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o51 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ q61 c;

    public o51(q61 q61Var) {
        this.c = q61Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.r0;
    }

    @Override // f2.o0
    public final long i(int i10) {
        return Math.abs(((Long) this.c.s0.get(i10)).longValue());
    }

    @Override // f2.o0
    public final int j(int i10) {
        q61 q61Var = this.c;
        if (i10 == q61Var.a) {
            return 7;
        }
        if (i10 >= q61Var.b && i10 < q61Var.c) {
            return 1;
        }
        if (i10 >= q61Var.d && i10 < q61Var.e) {
            return 1;
        }
        if (i10 >= q61Var.B && i10 < q61Var.C) {
            return 1;
        }
        if (i10 >= q61Var.r && i10 < q61Var.s) {
            return 3;
        }
        if (q61Var.v0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (q61Var.w0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == q61Var.v) {
            return 6;
        }
        if (q61Var.t0.indexOfKey(i10) >= 0 || i10 == q61Var.f || i10 == q61Var.y || i10 == q61Var.n || i10 == q61Var.h || i10 == q61Var.x) {
            return 0;
        }
        return i10 == q61Var.w ? 8 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:405:0x0725, code lost:
    
        if (r13.contains(java.lang.Long.valueOf(r0.getDocumentId())) != false) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0771  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        int size;
        boolean z4;
        TLRPC.Document document;
        int i11;
        boolean z10;
        org.telegram.ui.Components.u5 u5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.vx vxVar;
        ?? r92;
        boolean z11;
        String formatString;
        mg.q0 q0Var;
        int cacheType3;
        q61 q61Var = this.c;
        ArrayList arrayList = q61Var.D0;
        ArrayList arrayList2 = q61Var.H0;
        ArrayList arrayList3 = q61Var.C0;
        SparseIntArray sparseIntArray = q61Var.t0;
        boolean z12 = q61Var.K0;
        ArrayList arrayList4 = q61Var.A0;
        int i12 = q61Var.T;
        ArrayList arrayList5 = q61Var.J0;
        m51 m51Var = q61Var.e0;
        HashSet hashSet = q61Var.H;
        ArrayList arrayList6 = q61Var.B0;
        int i13 = q61Var.S;
        int i14 = l1Var.f;
        View view = l1Var.a;
        if (i14 == 8) {
            y51 y51Var = (y51) view;
            y51Var.c = i10;
            y51Var.I = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = q61Var.R1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z13 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (q61Var.M0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            u51 u51Var = (u51) view;
            if (i10 == q61Var.x) {
                u51Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                u51Var.c.setVisibility(8);
                return;
            }
            if (i10 == q61Var.f) {
                u51Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                u51Var.c.setVisibility(8);
                return;
            }
            if (i10 == q61Var.y) {
                u51Var.a(LocaleController.getString(R.string.StickerEffects), false);
                u51Var.c.setVisibility(8);
                return;
            }
            u51Var.c.setVisibility(8);
            if (i10 == q61Var.h) {
                u51Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == q61Var.n) {
                u51Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                u51Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.vx vxVar2 = (org.telegram.ui.Components.vx) arrayList5.get(i15);
            if (vxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(vxVar2.d, false);
                vxVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !vxVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z13 = true;
            }
            u51Var.a(vxVar2.b.title, z13);
            return;
        }
        if (i14 == 1) {
            y51 y51Var2 = (y51) view;
            y51Var2.c = i10;
            ImageReceiver imageReceiver = y51Var2.n;
            int i16 = q61Var.b;
            if (i10 < i16 || i10 >= q61Var.c) {
                int i17 = q61Var.B;
                q0Var = (i10 < i17 || i10 >= q61Var.C) ? (mg.q0) q61Var.E0.get(i10 - q61Var.d) : (mg.q0) q61Var.G0.get(i10 - i17);
            } else {
                q0Var = (mg.q0) q61Var.F0.get(i10 - i16);
            }
            if (i12 == 13) {
                y51Var2.b = false;
                y51Var2.y = true;
                y51Var2.x = q0Var;
                y51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
                y51Var2.d(q61Var.G.contains(q0Var), false);
                return;
            }
            y51Var2.a(m51Var);
            y51Var2.y = true;
            y51Var2.x = q0Var;
            y51Var2.d(q61Var.G.contains(q0Var), false);
            y51Var2.b = false;
            if (q0Var.b || q0Var.f == null) {
                y51Var2.s = false;
                y51Var2.e = new org.telegram.ui.Components.u5(q0Var.g, (Paint.FontMetricsInt) null);
                y51Var2.d = null;
                y51Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) m51Var.a3.get(y51Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = q61Var.getCacheType();
                    if (cacheType3 == 3 && q0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.l5.n(i13, y51Var2.e.getDocumentId(), null, cacheType3);
                    m51Var.a3.put(y51Var2.e.getDocumentId(), drawable);
                }
                y51Var2.setDrawable(drawable);
            } else {
                y51Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(q0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        mg.q0 q0Var2 = q0Var;
                        y51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var2, 0);
                        q0Var = q0Var2;
                    } else {
                        y51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), mg.m0.a());
                } else {
                    y51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                y51Var2.e = null;
                y51Var2.d = null;
                y51Var2.setDrawable(null);
                x51 x51Var = y51Var2.G;
                if (x51Var != null) {
                    x51Var.setVisibility(8);
                    y51Var2.G.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && q0Var.b && q0Var.d) {
                y51Var2.b();
                y51Var2.G.setVisibility(0);
                y51Var2.setEmojicon(null);
                return;
            }
            if (q0Var.e) {
                y51Var2.setEmojicon(q0Var.f);
            } else {
                y51Var2.setEmojicon(null);
            }
            x51 x51Var2 = y51Var2.G;
            if (x51Var2 != null) {
                x51Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            t51 t51Var = (t51) view;
            int i18 = q61Var.v0.get(i10);
            org.telegram.ui.Components.vx vxVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.vx) arrayList5.get(i18);
            if (i18 == -1) {
                q61Var.D = t51Var;
                t51Var.a.setText("+" + ((arrayList4.size() - 40) + (z12 ? 1 : 0) + 1));
                return;
            }
            if (vxVar3 == null) {
                if (q61Var.D == t51Var) {
                    q61Var.D = null;
                    return;
                }
                return;
            } else {
                if (q61Var.D == t51Var) {
                    q61Var.D = null;
                }
                TextView textView2 = t51Var.a;
                StringBuilder sb = new StringBuilder("+");
                sb.append(vxVar3.c.size() - 23);
                textView2.setText(sb.toString());
                return;
            }
        }
        if (i14 == 5) {
            s51 s51Var = (s51) view;
            int i19 = q61Var.w0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (vxVar = (org.telegram.ui.Components.vx) arrayList5.get(i19)) == null) {
                return;
            }
            String str = vxVar.b.title;
            boolean z14 = (vxVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z15 = vxVar.f;
            dg.m2 m2Var = new dg.m2(this, vxVar, i19, 19);
            eg.c1 c1Var = s51Var.c;
            FrameLayout frameLayout = s51Var.a;
            s51Var.d = str;
            if (z14) {
                frameLayout.setVisibility(8);
                r92 = 0;
                c1Var.setVisibility(0);
                c1Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), m2Var, false);
            } else {
                r92 = 0;
                c1Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(m2Var);
            }
            if (z15) {
                formatString = LocaleController.getString(R.string.Added);
                z11 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z11 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = s51Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            s51Var.b.c(formatString, r92, z11);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = s51Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                s51Var.e = null;
            }
            frameLayout.setEnabled(!z15);
            frameLayout.setAlpha(z15 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = s51Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                s51Var.n = null;
            }
            Boolean bool = s51Var.h;
            if (bool == null || bool.booleanValue() != z14) {
                s51Var.h = Boolean.valueOf(z14);
                float f10 = z14 ? 1.0f : 0.0f;
                s51Var.f = f10;
                frameLayout.setAlpha(1.0f - f10);
                c1Var.setAlpha(s51Var.f);
                c1Var.setScaleX(s51Var.f);
                c1Var.setScaleY(s51Var.f);
                c1Var.setVisibility(s51Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        y51 y51Var3 = (y51) view;
        y51Var3.v = null;
        y51Var3.w = null;
        y51Var3.a = false;
        y51Var3.c = i10;
        y51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && q61Var.N) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || q61Var.z0) {
                size = arrayList4.size() + (z12 ? 1 : 0);
            }
        }
        if (z12) {
            if (i10 == (q61Var.a != -1 ? 1 : 0) + (q61Var.v != -1 ? 1 : 0)) {
                z10 = hashSet.contains(null);
                y51Var3.a = true;
                y51Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                y51Var3.e = null;
                y51Var3.d = null;
                y51Var3.N = false;
                ImageReceiver imageReceiver2 = y51Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                u5Var = y51Var3.e;
                if (u5Var == null) {
                    org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) m51Var.a3.get(u5Var.getDocumentId());
                    if (l5Var == null) {
                        if (y51Var3.e.document != null) {
                            cacheType2 = q61Var.getCacheType();
                            l5Var = org.telegram.ui.Components.l5.m(i13, cacheType2, y51Var3.e.document);
                        } else {
                            cacheType = q61Var.getCacheType();
                            l5Var = org.telegram.ui.Components.l5.n(i13, y51Var3.e.getDocumentId(), null, cacheType);
                        }
                        m51Var.a3.put(y51Var3.e.getDocumentId(), l5Var);
                    }
                    y51Var3.setDrawable(l5Var);
                } else {
                    y51Var3.setDrawable(null);
                }
                y51Var3.d(z10, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (q61Var.a != -1 ? 1 : 0)) - (q61Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (q61Var.a != -1 ? 1 : 0)) - (q61Var.v != -1 ? 1 : 0)) - (z12 ? 1 : 0));
                y51Var3.b = false;
                y51Var3.y = false;
                y51Var3.x = mg.q0.b(str2);
                y51Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                y51Var3.d(q61Var.G.contains(y51Var3.x), false);
                return;
            }
        }
        int i21 = q61Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = q61Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z12 ? 1 : 0);
            if (i12 == 4 && q61Var.N) {
                y51Var3.c((TLRPC.Document) arrayList3.get(i24), m51Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    y51Var3.c(document2, m51Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z4 = true;
                    }
                } else {
                    org.telegram.ui.Components.u5 u5Var2 = (org.telegram.ui.Components.u5) arrayList4.get(i24);
                    y51Var3.e = u5Var2;
                    y51Var3.d = u5Var2 == null ? null : u5Var2.document;
                    z4 = u5Var2 != null && hashSet.contains(Long.valueOf(u5Var2.getDocumentId()));
                    y51Var3.N = false;
                    ImageReceiver imageReceiver3 = y51Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z10 = z4;
            }
            z4 = false;
            z10 = z4;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - q61Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (q61Var.a != -1 ? 1 : 0)) - (q61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (q61Var.a != -1 ? 1 : 0)) - (q61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.u5 u5Var3 = (org.telegram.ui.Components.u5) arrayList2.get(((((i10 - (q61Var.a != -1 ? 1 : 0)) - (q61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            y51Var3.e = u5Var3;
                            y51Var3.d = u5Var3 == null ? null : u5Var3.document;
                            z4 = u5Var3 != null && hashSet.contains(Long.valueOf(u5Var3.getDocumentId()));
                            y51Var3.N = false;
                            ImageReceiver imageReceiver4 = y51Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < sparseIntArray.size(); i25++) {
                    int keyAt = sparseIntArray.keyAt(i25);
                    int valueAt = sparseIntArray.valueAt(i25);
                    org.telegram.ui.Components.vx vxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.vx) arrayList5.get(valueAt) : null;
                    if (vxVar4 != null) {
                        int size2 = vxVar4.h ? vxVar4.c.size() : Math.min(vxVar4.c.size(), 24);
                        int i26 = (i10 - keyAt) - 1;
                        if (i26 >= 0 && i26 < size2 && (document = (TLRPC.Document) vxVar4.c.get(i26)) != null) {
                            if (q61Var.N) {
                                y51Var3.c(document, q61Var.f0);
                            } else {
                                y51Var3.N = false;
                                ImageReceiver imageReceiver5 = y51Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                y51Var3.e = new org.telegram.ui.Components.u5(document, (Paint.FontMetricsInt) null);
                            }
                            y51Var3.d = document;
                        }
                    }
                }
                z4 = true;
                org.telegram.ui.Components.u5 u5Var4 = y51Var3.e;
                if (u5Var4 != null) {
                }
                z4 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - q61Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                y51Var3.e = new org.telegram.ui.Components.u5(document3, (Paint.FontMetricsInt) null);
                y51Var3.d = document3;
                y51Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) lh.t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    y51Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z4 = y51Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                y51Var3.N = false;
                ImageReceiver imageReceiver6 = y51Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z10 = z4;
        }
        u5Var = y51Var3.e;
        if (u5Var == null) {
        }
        y51Var3.d(z10, false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        q61 q61Var = this.c;
        int i11 = q61Var.T;
        org.telegram.ui.ActionBar.f6 f6Var = q61Var.W0;
        if (i10 == 0) {
            view = new u51(q61Var, q61Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(q61Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            y51 y51Var = new y51(q61Var, q61Var.getContext());
            if (i10 == 8) {
                y51Var.N = true;
                ImageReceiver imageReceiver = new ImageReceiver(y51Var);
                y51Var.h = imageReceiver;
                y51Var.r = imageReceiver;
                imageReceiver.setImageBitmap(q61Var.K);
                q61Var.L = y51Var;
                y51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = y51Var;
        } else if (i10 == 4) {
            Context context = q61Var.getContext();
            t51 t51Var = new t51(context);
            TextView textView = new TextView(context);
            t51Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), q61Var.d1 ? org.telegram.ui.ActionBar.j6.v(q61Var.c1, org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            t51Var.addView(textView, k7.b6.e(-2, -2, 17));
            view = t51Var;
        } else if (i10 == 5) {
            s51 s51Var = new s51(q61Var.getContext());
            org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(s51Var.getContext(), false, false, false, 4);
            s51Var.b = t3Var;
            t3Var.b(0.3f, 250L, org.telegram.ui.Components.nr.h);
            t3Var.setTextSize(AndroidUtilities.dp(14.0f));
            t3Var.setTypeface(AndroidUtilities.bold());
            t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
            t3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(s51Var.getContext());
            s51Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
            frameLayout.addView(t3Var, k7.b6.e(-1, -2, 17));
            s51Var.addView(frameLayout, k7.b6.c(-1.0f, -1));
            eg.c1 c1Var = new eg.c1(s51Var.getContext(), f6Var, false);
            s51Var.c = c1Var;
            c1Var.setIcon(R.raw.unlock_icon);
            s51Var.addView(c1Var, k7.b6.c(-1.0f, -1));
            view = s51Var;
        } else if (i10 == 6) {
            wm0 wm0Var = new wm0(q61Var.getContext(), 1);
            wm0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                wm0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                wm0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                wm0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            wm0Var.setGravity(17);
            wm0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var));
            view = wm0Var;
        } else if (i10 == 7) {
            View s3Var = new org.telegram.ui.Cells.s3(q61Var.getContext(), 52);
            s3Var.setTag("searchbox");
            view = s3Var;
        } else {
            view = new y51(q61Var, q61Var.getContext());
        }
        if (q61.c(q61Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.el0(view);
    }
}
