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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a51 extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ b61 c;

    public a51(b61 b61Var) {
        this.c = b61Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 2 || i9 == 1 || i9 == 3 || i9 == 8;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.q0;
    }

    @Override // f2.r0
    public final long i(int i9) {
        return Math.abs(((Long) this.c.r0.get(i9)).longValue());
    }

    @Override // f2.r0
    public final int j(int i9) {
        b61 b61Var = this.c;
        if (i9 == b61Var.a) {
            return 7;
        }
        if (i9 >= b61Var.b && i9 < b61Var.c) {
            return 1;
        }
        if (i9 >= b61Var.d && i9 < b61Var.e) {
            return 1;
        }
        if (i9 >= b61Var.A && i9 < b61Var.B) {
            return 1;
        }
        if (i9 >= b61Var.r && i9 < b61Var.s) {
            return 3;
        }
        if (b61Var.u0.indexOfKey(i9) >= 0) {
            return 4;
        }
        if (b61Var.v0.indexOfKey(i9) >= 0) {
            return 5;
        }
        if (i9 == b61Var.v) {
            return 6;
        }
        if (b61Var.s0.indexOfKey(i9) >= 0 || i9 == b61Var.f || i9 == b61Var.y || i9 == b61Var.n || i9 == b61Var.h || i9 == b61Var.x) {
            return 0;
        }
        return i9 == b61Var.w ? 8 : 3;
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i10;
        boolean z11;
        org.telegram.ui.Components.t5 t5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.jx jxVar;
        ?? r92;
        boolean z12;
        String formatString;
        hg.r0 r0Var;
        int cacheType3;
        b61 b61Var = this.c;
        ArrayList arrayList = b61Var.C0;
        ArrayList arrayList2 = b61Var.G0;
        ArrayList arrayList3 = b61Var.B0;
        SparseIntArray sparseIntArray = b61Var.s0;
        boolean z13 = b61Var.J0;
        ArrayList arrayList4 = b61Var.z0;
        int i11 = b61Var.S;
        ArrayList arrayList5 = b61Var.I0;
        y41 y41Var = b61Var.d0;
        HashSet hashSet = b61Var.G;
        ArrayList arrayList6 = b61Var.A0;
        int i12 = b61Var.R;
        int i13 = q1Var.f;
        View view = q1Var.a;
        if (i13 == 8) {
            k51 k51Var = (k51) view;
            k51Var.c = i9;
            k51Var.H = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = b61Var.Q1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i13 == 6) {
            TextView textView = (TextView) view;
            if (b61Var.L0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i13 == 0) {
            g51 g51Var = (g51) view;
            if (i9 == b61Var.x) {
                g51Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                g51Var.c.setVisibility(8);
                return;
            }
            if (i9 == b61Var.f) {
                g51Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                g51Var.c.setVisibility(8);
                return;
            }
            if (i9 == b61Var.y) {
                g51Var.a(LocaleController.getString(R.string.StickerEffects), false);
                g51Var.c.setVisibility(8);
                return;
            }
            g51Var.c.setVisibility(8);
            if (i9 == b61Var.h) {
                g51Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i9 == b61Var.n) {
                g51Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i14 = sparseIntArray.get(i9);
            if (i14 < 0) {
                g51Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.jx jxVar2 = (org.telegram.ui.Components.jx) arrayList5.get(i14);
            if (jxVar2.d != null) {
                MediaDataController.getInstance(i12).getStickerSet(jxVar2.d, false);
                jxVar2.d = null;
            }
            if (i11 != 5 && i11 != 7 && i11 != 6 && !jxVar2.e && !UserConfig.getInstance(i12).isPremium()) {
                z14 = true;
            }
            g51Var.a(jxVar2.b.title, z14);
            return;
        }
        if (i13 == 1) {
            k51 k51Var2 = (k51) view;
            k51Var2.c = i9;
            ImageReceiver imageReceiver = k51Var2.n;
            int i15 = b61Var.b;
            if (i9 < i15 || i9 >= b61Var.c) {
                int i16 = b61Var.A;
                r0Var = (i9 < i16 || i9 >= b61Var.B) ? (hg.r0) b61Var.D0.get(i9 - b61Var.d) : (hg.r0) b61Var.F0.get(i9 - i16);
            } else {
                r0Var = (hg.r0) b61Var.E0.get(i9 - i15);
            }
            if (i11 == 13) {
                k51Var2.b = false;
                k51Var2.y = true;
                k51Var2.x = r0Var;
                k51Var2.setDrawable(Emoji.getEmojiDrawable(r0Var.f));
                k51Var2.d(b61Var.F.contains(r0Var), false);
                return;
            }
            k51Var2.a(y41Var);
            k51Var2.y = true;
            k51Var2.x = r0Var;
            k51Var2.d(b61Var.F.contains(r0Var), false);
            k51Var2.b = false;
            if (r0Var.b || r0Var.f == null) {
                k51Var2.s = false;
                k51Var2.e = new org.telegram.ui.Components.t5(r0Var.g, (Paint.FontMetricsInt) null);
                k51Var2.d = null;
                k51Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) y41Var.Z2.get(k51Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = b61Var.getCacheType();
                    if (cacheType3 == 3 && r0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.k5.n(i12, k51Var2.e.getDocumentId(), null, cacheType3);
                    y41Var.Z2.put(k51Var2.e.getDocumentId(), drawable);
                }
                k51Var2.setDrawable(drawable);
            } else {
                k51Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i12).getReactionsMap().get(r0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.f6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        hg.r0 r0Var2 = r0Var;
                        k51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", r0Var2, 0);
                        r0Var = r0Var2;
                    } else {
                        k51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", r0Var, 0);
                    }
                    MediaDataController.getInstance(i12).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), hg.n0.a());
                } else {
                    k51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                k51Var2.e = null;
                k51Var2.d = null;
                k51Var2.setDrawable(null);
                j51 j51Var = k51Var2.F;
                if (j51Var != null) {
                    j51Var.setVisibility(8);
                    k51Var2.F.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i12).isPremium() && i11 == 14 && r0Var.b && r0Var.d) {
                k51Var2.b();
                k51Var2.F.setVisibility(0);
                k51Var2.setEmojicon(null);
                return;
            }
            if (r0Var.e) {
                k51Var2.setEmojicon(r0Var.f);
            } else {
                k51Var2.setEmojicon(null);
            }
            j51 j51Var2 = k51Var2.F;
            if (j51Var2 != null) {
                j51Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i13 == 4) {
            f51 f51Var = (f51) view;
            int i17 = b61Var.u0.get(i9);
            org.telegram.ui.Components.jx jxVar3 = (i17 < 0 || i17 >= arrayList5.size()) ? null : (org.telegram.ui.Components.jx) arrayList5.get(i17);
            if (i17 == -1) {
                b61Var.C = f51Var;
                f51Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (jxVar3 == null) {
                if (b61Var.C == f51Var) {
                    b61Var.C = null;
                    return;
                }
                return;
            } else {
                if (b61Var.C == f51Var) {
                    b61Var.C = null;
                }
                TextView textView2 = f51Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(jxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i13 == 5) {
            e51 e51Var = (e51) view;
            int i18 = b61Var.v0.get(i9);
            if (i18 < 0 || i18 >= arrayList5.size() || (jxVar = (org.telegram.ui.Components.jx) arrayList5.get(i18)) == null) {
                return;
            }
            String str = jxVar.b.title;
            boolean z15 = (jxVar.e || UserConfig.getInstance(i12).isPremium()) ? false : true;
            boolean z16 = jxVar.f;
            fh.a3 a3Var = new fh.a3(this, jxVar, i18, 18);
            zf.p0 p0Var = e51Var.c;
            FrameLayout frameLayout = e51Var.a;
            e51Var.d = str;
            if (z15) {
                frameLayout.setVisibility(8);
                r92 = 0;
                p0Var.setVisibility(0);
                p0Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), a3Var, false);
            } else {
                r92 = 0;
                p0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(a3Var);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i19 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = e51Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i19, objArr);
            }
            e51Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = e51Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                e51Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = e51Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                e51Var.n = null;
            }
            Boolean bool = e51Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                e51Var.h = Boolean.valueOf(z15);
                float f10 = z15 ? 1.0f : 0.0f;
                e51Var.f = f10;
                frameLayout.setAlpha(1.0f - f10);
                p0Var.setAlpha(e51Var.f);
                p0Var.setScaleX(e51Var.f);
                p0Var.setScaleY(e51Var.f);
                p0Var.setVisibility(e51Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i13 == 7 || i13 == 9) {
            return;
        }
        k51 k51Var3 = (k51) view;
        k51Var3.v = null;
        k51Var3.w = null;
        k51Var3.a = false;
        k51Var3.c = i9;
        k51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i11 == 4 && b61Var.M) || i11 == 6) {
            size = arrayList3.size();
        } else if (i11 == 4 || i11 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || b61Var.y0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i9 == (b61Var.a != -1 ? 1 : 0) + (b61Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                k51Var3.a = true;
                k51Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                k51Var3.e = null;
                k51Var3.d = null;
                k51Var3.M = false;
                ImageReceiver imageReceiver2 = k51Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                t5Var = k51Var3.e;
                if (t5Var == null) {
                    org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) y41Var.Z2.get(t5Var.getDocumentId());
                    if (k5Var == null) {
                        if (k51Var3.e.document != null) {
                            cacheType2 = b61Var.getCacheType();
                            k5Var = org.telegram.ui.Components.k5.m(i12, cacheType2, k51Var3.e.document);
                        } else {
                            cacheType = b61Var.getCacheType();
                            k5Var = org.telegram.ui.Components.k5.n(i12, k51Var3.e.getDocumentId(), null, cacheType);
                        }
                        y41Var.Z2.put(k51Var3.e.getDocumentId(), k5Var);
                    }
                    k51Var3.setDrawable(k5Var);
                } else {
                    k51Var3.setDrawable(null);
                }
                k51Var3.d(z11, false);
            }
        }
        if (i11 == 13) {
            if ((i9 - (b61Var.a != -1 ? 1 : 0)) - (b61Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i9 - (b61Var.a != -1 ? 1 : 0)) - (b61Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                k51Var3.b = false;
                k51Var3.y = false;
                k51Var3.x = hg.r0.b(str2);
                k51Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                k51Var3.d(b61Var.F.contains(k51Var3.x), false);
                return;
            }
        }
        int i20 = b61Var.a;
        int i21 = i9 - (i20 != -1 ? 1 : 0);
        int i22 = b61Var.v;
        if (i21 - (i22 != -1 ? 1 : 0) < size) {
            int i23 = ((i9 - (i20 != -1 ? 1 : 0)) - (i22 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i11 == 4 && b61Var.M) {
                k51Var3.c((TLRPC.Document) arrayList3.get(i23), y41Var);
            } else {
                if (i11 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i23);
                    k51Var3.c(document2, y41Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.t5 t5Var2 = (org.telegram.ui.Components.t5) arrayList4.get(i23);
                    k51Var3.e = t5Var2;
                    k51Var3.d = t5Var2 == null ? null : t5Var2.document;
                    z10 = t5Var2 != null && hashSet.contains(Long.valueOf(t5Var2.getDocumentId()));
                    k51Var3.M = false;
                    ImageReceiver imageReceiver3 = k51Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i10 = i9 - b61Var.r) < 0 || i10 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i9 - (b61Var.a != -1 ? 1 : 0)) - (b61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i9 - (b61Var.a != -1 ? 1 : 0)) - (b61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.t5 t5Var3 = (org.telegram.ui.Components.t5) arrayList2.get(((((i9 - (b61Var.a != -1 ? 1 : 0)) - (b61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            k51Var3.e = t5Var3;
                            k51Var3.d = t5Var3 == null ? null : t5Var3.document;
                            z10 = t5Var3 != null && hashSet.contains(Long.valueOf(t5Var3.getDocumentId()));
                            k51Var3.M = false;
                            ImageReceiver imageReceiver4 = k51Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i24 = 0; i24 < sparseIntArray.size(); i24++) {
                    int keyAt = sparseIntArray.keyAt(i24);
                    int valueAt = sparseIntArray.valueAt(i24);
                    org.telegram.ui.Components.jx jxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.jx) arrayList5.get(valueAt) : null;
                    if (jxVar4 != null) {
                        int size2 = jxVar4.h ? jxVar4.c.size() : Math.min(jxVar4.c.size(), 24);
                        int i25 = (i9 - keyAt) - 1;
                        if (i25 >= 0 && i25 < size2 && (document = (TLRPC.Document) jxVar4.c.get(i25)) != null) {
                            if (b61Var.M) {
                                k51Var3.c(document, b61Var.e0);
                            } else {
                                k51Var3.M = false;
                                ImageReceiver imageReceiver5 = k51Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                k51Var3.e = new org.telegram.ui.Components.t5(document, (Paint.FontMetricsInt) null);
                            }
                            k51Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.t5 t5Var4 = k51Var3.e;
                if (t5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i9 - b61Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                k51Var3.e = new org.telegram.ui.Components.t5(document3, (Paint.FontMetricsInt) null);
                k51Var3.d = document3;
                k51Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gh.v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    k51Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = k51Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                k51Var3.M = false;
                ImageReceiver imageReceiver6 = k51Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        t5Var = k51Var3.e;
        if (t5Var == null) {
        }
        k51Var3.d(z11, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        b61 b61Var = this.c;
        int i10 = b61Var.S;
        org.telegram.ui.ActionBar.b6 b6Var = b61Var.V0;
        if (i9 == 0) {
            view = new g51(b61Var, b61Var.getContext(), i10 == 6);
        } else if (i9 == 2) {
            view = new ImageView(b61Var.getContext());
        } else if (i9 == 3 || i9 == 1 || i9 == 8) {
            k51 k51Var = new k51(b61Var, b61Var.getContext());
            if (i9 == 8) {
                k51Var.M = true;
                ImageReceiver imageReceiver = new ImageReceiver(k51Var);
                k51Var.h = imageReceiver;
                k51Var.r = imageReceiver;
                imageReceiver.setImageBitmap(b61Var.J);
                b61Var.K = k51Var;
                k51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = k51Var;
        } else if (i9 == 4) {
            Context context = b61Var.getContext();
            f51 f51Var = new f51(context);
            TextView textView = new TextView(context);
            f51Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(11.0f), b61Var.c1 ? org.telegram.ui.ActionBar.f6.v(b61Var.b1, org.telegram.ui.ActionBar.f6.l1(0.4f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            f51Var.addView(textView, g7.e6.e(-2, -2, 17));
            view = f51Var;
        } else if (i9 == 5) {
            e51 e51Var = new e51(b61Var.getContext());
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(e51Var.getContext(), false, false, false, 4);
            e51Var.b = u3Var;
            u3Var.b(0.3f, 250L, org.telegram.ui.Components.gr.h);
            u3Var.setTextSize(AndroidUtilities.dp(14.0f));
            u3Var.setTypeface(AndroidUtilities.bold());
            u3Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, b6Var));
            u3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(e51Var.getContext());
            e51Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
            frameLayout.addView(u3Var, g7.e6.e(-1, -2, 17));
            e51Var.addView(frameLayout, g7.e6.c(-1.0f, -1));
            zf.p0 p0Var = new zf.p0(e51Var.getContext(), b6Var, false);
            e51Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            e51Var.addView(p0Var, g7.e6.c(-1.0f, -1));
            view = e51Var;
        } else if (i9 == 6) {
            nd0 nd0Var = new nd0(b61Var.getContext(), 3);
            nd0Var.setTextSize(1, 13.0f);
            if (i10 == 3) {
                nd0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
                nd0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                nd0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            nd0Var.setGravity(17);
            nd0Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var));
            view = nd0Var;
        } else if (i9 == 7) {
            View t3Var = new org.telegram.ui.Cells.t3(b61Var.getContext(), 52);
            t3Var.setTag("searchbox");
            view = t3Var;
        } else {
            view = new k51(b61Var, b61Var.getContext());
        }
        if (b61.c(b61Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.ik0(view);
    }
}
