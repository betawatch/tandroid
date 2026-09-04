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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class i61 extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ j71 c;

    public i61(j71 j71Var) {
        this.c = j71Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.u0;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return Math.abs(((Long) this.c.v0.get(i10)).longValue());
    }

    @Override // s4.h0
    public final int j(int i10) {
        j71 j71Var = this.c;
        if (i10 == j71Var.a) {
            return 7;
        }
        if (i10 >= j71Var.b && i10 < j71Var.c) {
            return 1;
        }
        if (i10 >= j71Var.d && i10 < j71Var.e) {
            return 1;
        }
        if (i10 >= j71Var.E && i10 < j71Var.F) {
            return 1;
        }
        if (i10 >= j71Var.r && i10 < j71Var.s) {
            return 3;
        }
        if (j71Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (j71Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == j71Var.v) {
            return 6;
        }
        if (j71Var.w0.indexOfKey(i10) >= 0 || i10 == j71Var.f || i10 == j71Var.y || i10 == j71Var.n || i10 == j71Var.h || i10 == j71Var.x) {
            return 0;
        }
        return i10 == j71Var.w ? 8 : 3;
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i11;
        boolean z11;
        org.telegram.ui.Components.z5 z5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.xx xxVar;
        ?? r92;
        boolean z12;
        String formatString;
        ah.j1 j1Var;
        int cacheType3;
        j71 j71Var = this.c;
        ArrayList arrayList = j71Var.G0;
        ArrayList arrayList2 = j71Var.K0;
        ArrayList arrayList3 = j71Var.F0;
        SparseIntArray sparseIntArray = j71Var.w0;
        boolean z13 = j71Var.N0;
        ArrayList arrayList4 = j71Var.D0;
        int i12 = j71Var.W;
        ArrayList arrayList5 = j71Var.M0;
        g61 g61Var = j71Var.h0;
        HashSet hashSet = j71Var.K;
        ArrayList arrayList6 = j71Var.E0;
        int i13 = j71Var.V;
        int i14 = c1Var.f;
        View view = c1Var.a;
        if (i14 == 8) {
            s61 s61Var = (s61) view;
            s61Var.c = i10;
            s61Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = j71Var.U1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (j71Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            o61 o61Var = (o61) view;
            if (i10 == j71Var.x) {
                o61Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                o61Var.c.setVisibility(8);
                return;
            }
            if (i10 == j71Var.f) {
                o61Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                o61Var.c.setVisibility(8);
                return;
            }
            if (i10 == j71Var.y) {
                o61Var.a(LocaleController.getString(R.string.StickerEffects), false);
                o61Var.c.setVisibility(8);
                return;
            }
            o61Var.c.setVisibility(8);
            if (i10 == j71Var.h) {
                o61Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == j71Var.n) {
                o61Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                o61Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.xx xxVar2 = (org.telegram.ui.Components.xx) arrayList5.get(i15);
            if (xxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(xxVar2.d, false);
                xxVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !xxVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z14 = true;
            }
            o61Var.a(xxVar2.b.title, z14);
            return;
        }
        if (i14 == 1) {
            s61 s61Var2 = (s61) view;
            s61Var2.c = i10;
            ImageReceiver imageReceiver = s61Var2.n;
            int i16 = j71Var.b;
            if (i10 < i16 || i10 >= j71Var.c) {
                int i17 = j71Var.E;
                j1Var = (i10 < i17 || i10 >= j71Var.F) ? (ah.j1) j71Var.H0.get(i10 - j71Var.d) : (ah.j1) j71Var.J0.get(i10 - i17);
            } else {
                j1Var = (ah.j1) j71Var.I0.get(i10 - i16);
            }
            if (i12 == 13) {
                s61Var2.b = false;
                s61Var2.y = true;
                s61Var2.x = j1Var;
                s61Var2.setDrawable(Emoji.getEmojiDrawable(j1Var.f));
                s61Var2.d(j71Var.J.contains(j1Var), false);
                return;
            }
            s61Var2.a(g61Var);
            s61Var2.y = true;
            s61Var2.x = j1Var;
            s61Var2.d(j71Var.J.contains(j1Var), false);
            s61Var2.b = false;
            if (j1Var.b || j1Var.f == null) {
                s61Var2.s = false;
                s61Var2.e = new org.telegram.ui.Components.z5(j1Var.g, (Paint.FontMetricsInt) null);
                s61Var2.d = null;
                s61Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) g61Var.d3.get(s61Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = j71Var.getCacheType();
                    if (cacheType3 == 3 && j1Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.q5.n(i13, s61Var2.e.getDocumentId(), null, cacheType3);
                    g61Var.d3.put(s61Var2.e.getDocumentId(), drawable);
                }
                s61Var2.setDrawable(drawable);
            } else {
                s61Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(j1Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        ah.j1 j1Var2 = j1Var;
                        s61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", j1Var2, 0);
                        j1Var = j1Var2;
                    } else {
                        s61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", j1Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.e1.a());
                } else {
                    s61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                s61Var2.e = null;
                s61Var2.d = null;
                s61Var2.setDrawable(null);
                r61 r61Var = s61Var2.J;
                if (r61Var != null) {
                    r61Var.setVisibility(8);
                    s61Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && j1Var.b && j1Var.d) {
                s61Var2.b();
                s61Var2.J.setVisibility(0);
                s61Var2.setEmojicon(null);
                return;
            }
            if (j1Var.e) {
                s61Var2.setEmojicon(j1Var.f);
            } else {
                s61Var2.setEmojicon(null);
            }
            r61 r61Var2 = s61Var2.J;
            if (r61Var2 != null) {
                r61Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            n61 n61Var = (n61) view;
            int i18 = j71Var.y0.get(i10);
            org.telegram.ui.Components.xx xxVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.xx) arrayList5.get(i18);
            if (i18 == -1) {
                j71Var.G = n61Var;
                n61Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (xxVar3 == null) {
                if (j71Var.G == n61Var) {
                    j71Var.G = null;
                    return;
                }
                return;
            } else {
                if (j71Var.G == n61Var) {
                    j71Var.G = null;
                }
                TextView textView2 = n61Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(xxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i14 == 5) {
            m61 m61Var = (m61) view;
            int i19 = j71Var.z0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (xxVar = (org.telegram.ui.Components.xx) arrayList5.get(i19)) == null) {
                return;
            }
            String str = xxVar.b.title;
            boolean z15 = (xxVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z16 = xxVar.f;
            org.telegram.ui.Cells.ua uaVar = new org.telegram.ui.Cells.ua(this, xxVar, i19, 15);
            sg.r0 r0Var = m61Var.c;
            FrameLayout frameLayout = m61Var.a;
            m61Var.d = str;
            if (z15) {
                frameLayout.setVisibility(8);
                r92 = 0;
                r0Var.setVisibility(0);
                r0Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), uaVar, false);
            } else {
                r92 = 0;
                r0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(uaVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = m61Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            m61Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = m61Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                m61Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = m61Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                m61Var.n = null;
            }
            Boolean bool = m61Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                m61Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                m61Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                r0Var.setAlpha(m61Var.f);
                r0Var.setScaleX(m61Var.f);
                r0Var.setScaleY(m61Var.f);
                r0Var.setVisibility(m61Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        s61 s61Var3 = (s61) view;
        s61Var3.v = null;
        s61Var3.w = null;
        s61Var3.a = false;
        s61Var3.c = i10;
        s61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && j71Var.Q) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || j71Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (j71Var.a != -1 ? 1 : 0) + (j71Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                s61Var3.a = true;
                s61Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                s61Var3.e = null;
                s61Var3.d = null;
                s61Var3.Q = false;
                ImageReceiver imageReceiver2 = s61Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                z5Var = s61Var3.e;
                if (z5Var == null) {
                    org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) g61Var.d3.get(z5Var.getDocumentId());
                    if (q5Var == null) {
                        if (s61Var3.e.document != null) {
                            cacheType2 = j71Var.getCacheType();
                            q5Var = org.telegram.ui.Components.q5.m(i13, cacheType2, s61Var3.e.document);
                        } else {
                            cacheType = j71Var.getCacheType();
                            q5Var = org.telegram.ui.Components.q5.n(i13, s61Var3.e.getDocumentId(), null, cacheType);
                        }
                        g61Var.d3.put(s61Var3.e.getDocumentId(), q5Var);
                    }
                    s61Var3.setDrawable(q5Var);
                } else {
                    s61Var3.setDrawable(null);
                }
                s61Var3.d(z11, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (j71Var.a != -1 ? 1 : 0)) - (j71Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (j71Var.a != -1 ? 1 : 0)) - (j71Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                s61Var3.b = false;
                s61Var3.y = false;
                s61Var3.x = ah.j1.b(str2);
                s61Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                s61Var3.d(j71Var.J.contains(s61Var3.x), false);
                return;
            }
        }
        int i21 = j71Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = j71Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i12 == 4 && j71Var.Q) {
                s61Var3.c((TLRPC.Document) arrayList3.get(i24), g61Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    s61Var3.c(document2, g61Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.z5 z5Var2 = (org.telegram.ui.Components.z5) arrayList4.get(i24);
                    s61Var3.e = z5Var2;
                    s61Var3.d = z5Var2 == null ? null : z5Var2.document;
                    z10 = z5Var2 != null && hashSet.contains(Long.valueOf(z5Var2.getDocumentId()));
                    s61Var3.Q = false;
                    ImageReceiver imageReceiver3 = s61Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - j71Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (j71Var.a != -1 ? 1 : 0)) - (j71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (j71Var.a != -1 ? 1 : 0)) - (j71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) arrayList2.get(((((i10 - (j71Var.a != -1 ? 1 : 0)) - (j71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            s61Var3.e = z5Var3;
                            s61Var3.d = z5Var3 == null ? null : z5Var3.document;
                            z10 = z5Var3 != null && hashSet.contains(Long.valueOf(z5Var3.getDocumentId()));
                            s61Var3.Q = false;
                            ImageReceiver imageReceiver4 = s61Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < sparseIntArray.size(); i25++) {
                    int keyAt = sparseIntArray.keyAt(i25);
                    int valueAt = sparseIntArray.valueAt(i25);
                    org.telegram.ui.Components.xx xxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.xx) arrayList5.get(valueAt) : null;
                    if (xxVar4 != null) {
                        int size2 = xxVar4.h ? xxVar4.c.size() : Math.min(xxVar4.c.size(), 24);
                        int i26 = (i10 - keyAt) - 1;
                        if (i26 >= 0 && i26 < size2 && (document = (TLRPC.Document) xxVar4.c.get(i26)) != null) {
                            if (j71Var.Q) {
                                s61Var3.c(document, j71Var.i0);
                            } else {
                                s61Var3.Q = false;
                                ImageReceiver imageReceiver5 = s61Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                s61Var3.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                            }
                            s61Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.z5 z5Var4 = s61Var3.e;
                if (z5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - j71Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                s61Var3.e = new org.telegram.ui.Components.z5(document3, (Paint.FontMetricsInt) null);
                s61Var3.d = document3;
                s61Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) zh.s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    s61Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = s61Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                s61Var3.Q = false;
                ImageReceiver imageReceiver6 = s61Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        z5Var = s61Var3.e;
        if (z5Var == null) {
        }
        s61Var3.d(z11, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        j71 j71Var = this.c;
        int i11 = j71Var.W;
        org.telegram.ui.ActionBar.f6 f6Var = j71Var.Z0;
        if (i10 == 0) {
            view = new o61(j71Var, j71Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(j71Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            s61 s61Var = new s61(j71Var, j71Var.getContext());
            if (i10 == 8) {
                s61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(s61Var);
                s61Var.h = imageReceiver;
                s61Var.r = imageReceiver;
                imageReceiver.setImageBitmap(j71Var.N);
                j71Var.O = s61Var;
                s61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = s61Var;
        } else if (i10 == 4) {
            Context context = j71Var.getContext();
            n61 n61Var = new n61(context);
            TextView textView = new TextView(context);
            n61Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), j71Var.g1 ? org.telegram.ui.ActionBar.j6.v(j71Var.f1, org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            n61Var.addView(textView, w7.x5.e(-2, -2, 17));
            view = n61Var;
        } else if (i10 == 5) {
            m61 m61Var = new m61(j71Var.getContext());
            org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(m61Var.getContext(), false, false, false, 4);
            m61Var.b = t3Var;
            t3Var.b(0.3f, 250L, org.telegram.ui.Components.pr.h);
            t3Var.setTextSize(AndroidUtilities.dp(14.0f));
            t3Var.setTypeface(AndroidUtilities.bold());
            t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
            t3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(m61Var.getContext());
            m61Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
            frameLayout.addView(t3Var, w7.x5.e(-1, -2, 17));
            m61Var.addView(frameLayout, w7.x5.c(-1.0f, -1));
            sg.r0 r0Var = new sg.r0(m61Var.getContext(), f6Var, false);
            m61Var.c = r0Var;
            r0Var.setIcon(R.raw.unlock_icon);
            m61Var.addView(r0Var, w7.x5.c(-1.0f, -1));
            view = m61Var;
        } else if (i10 == 6) {
            in0 in0Var = new in0(j71Var.getContext(), 2);
            in0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                in0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                in0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                in0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            in0Var.setGravity(17);
            in0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var));
            view = in0Var;
        } else if (i10 == 7) {
            View s3Var = new org.telegram.ui.Cells.s3(j71Var.getContext(), 52);
            s3Var.setTag("searchbox");
            view = s3Var;
        } else {
            view = new s61(j71Var, j71Var.getContext());
        }
        if (j71.c(j71Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
