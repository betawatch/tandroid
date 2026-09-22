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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class g61 extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ h71 c;

    public g61(h71 h71Var) {
        this.c = h71Var;
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
        h71 h71Var = this.c;
        if (i10 == h71Var.a) {
            return 7;
        }
        if (i10 >= h71Var.b && i10 < h71Var.c) {
            return 1;
        }
        if (i10 >= h71Var.d && i10 < h71Var.e) {
            return 1;
        }
        if (i10 >= h71Var.E && i10 < h71Var.F) {
            return 1;
        }
        if (i10 >= h71Var.r && i10 < h71Var.s) {
            return 3;
        }
        if (h71Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (h71Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == h71Var.v) {
            return 6;
        }
        if (h71Var.w0.indexOfKey(i10) >= 0 || i10 == h71Var.f || i10 == h71Var.y || i10 == h71Var.n || i10 == h71Var.h || i10 == h71Var.x) {
            return 0;
        }
        return i10 == h71Var.w ? 8 : 3;
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
        org.telegram.ui.Components.x5 x5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.wx wxVar;
        ?? r92;
        boolean z12;
        String formatString;
        zg.p0 p0Var;
        int cacheType3;
        h71 h71Var = this.c;
        ArrayList arrayList = h71Var.G0;
        ArrayList arrayList2 = h71Var.K0;
        ArrayList arrayList3 = h71Var.F0;
        SparseIntArray sparseIntArray = h71Var.w0;
        boolean z13 = h71Var.N0;
        ArrayList arrayList4 = h71Var.D0;
        int i12 = h71Var.W;
        ArrayList arrayList5 = h71Var.M0;
        e61 e61Var = h71Var.h0;
        HashSet hashSet = h71Var.K;
        ArrayList arrayList6 = h71Var.E0;
        int i13 = h71Var.V;
        int i14 = c1Var.f;
        View view = c1Var.a;
        if (i14 == 8) {
            q61 q61Var = (q61) view;
            q61Var.c = i10;
            q61Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = h71Var.U1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (h71Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            m61 m61Var = (m61) view;
            if (i10 == h71Var.x) {
                m61Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                m61Var.c.setVisibility(8);
                return;
            }
            if (i10 == h71Var.f) {
                m61Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                m61Var.c.setVisibility(8);
                return;
            }
            if (i10 == h71Var.y) {
                m61Var.a(LocaleController.getString(R.string.StickerEffects), false);
                m61Var.c.setVisibility(8);
                return;
            }
            m61Var.c.setVisibility(8);
            if (i10 == h71Var.h) {
                m61Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == h71Var.n) {
                m61Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                m61Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.wx wxVar2 = (org.telegram.ui.Components.wx) arrayList5.get(i15);
            if (wxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(wxVar2.d, false);
                wxVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !wxVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z14 = true;
            }
            m61Var.a(wxVar2.b.title, z14);
            return;
        }
        if (i14 == 1) {
            q61 q61Var2 = (q61) view;
            q61Var2.c = i10;
            ImageReceiver imageReceiver = q61Var2.n;
            int i16 = h71Var.b;
            if (i10 < i16 || i10 >= h71Var.c) {
                int i17 = h71Var.E;
                p0Var = (i10 < i17 || i10 >= h71Var.F) ? (zg.p0) h71Var.H0.get(i10 - h71Var.d) : (zg.p0) h71Var.J0.get(i10 - i17);
            } else {
                p0Var = (zg.p0) h71Var.I0.get(i10 - i16);
            }
            if (i12 == 13) {
                q61Var2.b = false;
                q61Var2.y = true;
                q61Var2.x = p0Var;
                q61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f));
                q61Var2.d(h71Var.J.contains(p0Var), false);
                return;
            }
            q61Var2.a(e61Var);
            q61Var2.y = true;
            q61Var2.x = p0Var;
            q61Var2.d(h71Var.J.contains(p0Var), false);
            q61Var2.b = false;
            if (p0Var.b || p0Var.f == null) {
                q61Var2.s = false;
                q61Var2.e = new org.telegram.ui.Components.x5(p0Var.g, (Paint.FontMetricsInt) null);
                q61Var2.d = null;
                q61Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) e61Var.d3.get(q61Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = h71Var.getCacheType();
                    if (cacheType3 == 3 && p0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.o5.n(i13, q61Var2.e.getDocumentId(), null, cacheType3);
                    e61Var.d3.put(q61Var2.e.getDocumentId(), drawable);
                }
                q61Var2.setDrawable(drawable);
            } else {
                q61Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(p0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.i6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        zg.p0 p0Var2 = p0Var;
                        q61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    } else {
                        q61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
                } else {
                    q61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                q61Var2.e = null;
                q61Var2.d = null;
                q61Var2.setDrawable(null);
                p61 p61Var = q61Var2.J;
                if (p61Var != null) {
                    p61Var.setVisibility(8);
                    q61Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && p0Var.b && p0Var.d) {
                q61Var2.b();
                q61Var2.J.setVisibility(0);
                q61Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                q61Var2.setEmojicon(p0Var.f);
            } else {
                q61Var2.setEmojicon(null);
            }
            p61 p61Var2 = q61Var2.J;
            if (p61Var2 != null) {
                p61Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            l61 l61Var = (l61) view;
            int i18 = h71Var.y0.get(i10);
            org.telegram.ui.Components.wx wxVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.wx) arrayList5.get(i18);
            if (i18 == -1) {
                h71Var.G = l61Var;
                l61Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (wxVar3 == null) {
                if (h71Var.G == l61Var) {
                    h71Var.G = null;
                    return;
                }
                return;
            } else {
                if (h71Var.G == l61Var) {
                    h71Var.G = null;
                }
                TextView textView2 = l61Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(wxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i14 == 5) {
            k61 k61Var = (k61) view;
            int i19 = h71Var.z0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (wxVar = (org.telegram.ui.Components.wx) arrayList5.get(i19)) == null) {
                return;
            }
            String str = wxVar.b.title;
            boolean z15 = (wxVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z16 = wxVar.f;
            org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(this, wxVar, i19, 15);
            rg.p0 p0Var3 = k61Var.c;
            FrameLayout frameLayout = k61Var.a;
            k61Var.d = str;
            if (z15) {
                frameLayout.setVisibility(8);
                r92 = 0;
                p0Var3.setVisibility(0);
                p0Var3.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), vaVar, false);
            } else {
                r92 = 0;
                p0Var3.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(vaVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = k61Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            k61Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = k61Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                k61Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = k61Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                k61Var.n = null;
            }
            Boolean bool = k61Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                k61Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                k61Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                p0Var3.setAlpha(k61Var.f);
                p0Var3.setScaleX(k61Var.f);
                p0Var3.setScaleY(k61Var.f);
                p0Var3.setVisibility(k61Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        q61 q61Var3 = (q61) view;
        q61Var3.v = null;
        q61Var3.w = null;
        q61Var3.a = false;
        q61Var3.c = i10;
        q61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && h71Var.Q) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || h71Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (h71Var.a != -1 ? 1 : 0) + (h71Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                q61Var3.a = true;
                q61Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                q61Var3.e = null;
                q61Var3.d = null;
                q61Var3.Q = false;
                ImageReceiver imageReceiver2 = q61Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                x5Var = q61Var3.e;
                if (x5Var == null) {
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) e61Var.d3.get(x5Var.getDocumentId());
                    if (o5Var == null) {
                        if (q61Var3.e.document != null) {
                            cacheType2 = h71Var.getCacheType();
                            o5Var = org.telegram.ui.Components.o5.m(i13, cacheType2, q61Var3.e.document);
                        } else {
                            cacheType = h71Var.getCacheType();
                            o5Var = org.telegram.ui.Components.o5.n(i13, q61Var3.e.getDocumentId(), null, cacheType);
                        }
                        e61Var.d3.put(q61Var3.e.getDocumentId(), o5Var);
                    }
                    q61Var3.setDrawable(o5Var);
                } else {
                    q61Var3.setDrawable(null);
                }
                q61Var3.d(z11, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (h71Var.a != -1 ? 1 : 0)) - (h71Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (h71Var.a != -1 ? 1 : 0)) - (h71Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                q61Var3.b = false;
                q61Var3.y = false;
                q61Var3.x = zg.p0.b(str2);
                q61Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                q61Var3.d(h71Var.J.contains(q61Var3.x), false);
                return;
            }
        }
        int i21 = h71Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = h71Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i12 == 4 && h71Var.Q) {
                q61Var3.c((TLRPC.Document) arrayList3.get(i24), e61Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    q61Var3.c(document2, e61Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.x5 x5Var2 = (org.telegram.ui.Components.x5) arrayList4.get(i24);
                    q61Var3.e = x5Var2;
                    q61Var3.d = x5Var2 == null ? null : x5Var2.document;
                    z10 = x5Var2 != null && hashSet.contains(Long.valueOf(x5Var2.getDocumentId()));
                    q61Var3.Q = false;
                    ImageReceiver imageReceiver3 = q61Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - h71Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (h71Var.a != -1 ? 1 : 0)) - (h71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (h71Var.a != -1 ? 1 : 0)) - (h71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.x5 x5Var3 = (org.telegram.ui.Components.x5) arrayList2.get(((((i10 - (h71Var.a != -1 ? 1 : 0)) - (h71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            q61Var3.e = x5Var3;
                            q61Var3.d = x5Var3 == null ? null : x5Var3.document;
                            z10 = x5Var3 != null && hashSet.contains(Long.valueOf(x5Var3.getDocumentId()));
                            q61Var3.Q = false;
                            ImageReceiver imageReceiver4 = q61Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < sparseIntArray.size(); i25++) {
                    int keyAt = sparseIntArray.keyAt(i25);
                    int valueAt = sparseIntArray.valueAt(i25);
                    org.telegram.ui.Components.wx wxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.wx) arrayList5.get(valueAt) : null;
                    if (wxVar4 != null) {
                        int size2 = wxVar4.h ? wxVar4.c.size() : Math.min(wxVar4.c.size(), 24);
                        int i26 = (i10 - keyAt) - 1;
                        if (i26 >= 0 && i26 < size2 && (document = (TLRPC.Document) wxVar4.c.get(i26)) != null) {
                            if (h71Var.Q) {
                                q61Var3.c(document, h71Var.i0);
                            } else {
                                q61Var3.Q = false;
                                ImageReceiver imageReceiver5 = q61Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                q61Var3.e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                            }
                            q61Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.x5 x5Var4 = q61Var3.e;
                if (x5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - h71Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                q61Var3.e = new org.telegram.ui.Components.x5(document3, (Paint.FontMetricsInt) null);
                q61Var3.d = document3;
                q61Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) yh.u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    q61Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = q61Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                q61Var3.Q = false;
                ImageReceiver imageReceiver6 = q61Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        x5Var = q61Var3.e;
        if (x5Var == null) {
        }
        q61Var3.d(z11, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        h71 h71Var = this.c;
        int i11 = h71Var.W;
        org.telegram.ui.ActionBar.e6 e6Var = h71Var.Z0;
        if (i10 == 0) {
            view = new m61(h71Var, h71Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(h71Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            q61 q61Var = new q61(h71Var, h71Var.getContext());
            if (i10 == 8) {
                q61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(q61Var);
                q61Var.h = imageReceiver;
                q61Var.r = imageReceiver;
                imageReceiver.setImageBitmap(h71Var.N);
                h71Var.O = q61Var;
                q61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = q61Var;
        } else if (i10 == 4) {
            Context context = h71Var.getContext();
            l61 l61Var = new l61(context);
            TextView textView = new TextView(context);
            l61Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(11.0f), h71Var.g1 ? org.telegram.ui.ActionBar.i6.v(h71Var.f1, org.telegram.ui.ActionBar.i6.l1(0.4f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            l61Var.addView(textView, w7.x5.e(-2, -2, 17));
            view = l61Var;
        } else if (i10 == 5) {
            k61 k61Var = new k61(h71Var.getContext());
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(k61Var.getContext(), false, false, false, 4);
            k61Var.b = u3Var;
            u3Var.b(0.3f, 250L, org.telegram.ui.Components.qr.h);
            u3Var.setTextSize(AndroidUtilities.dp(14.0f));
            u3Var.setTypeface(AndroidUtilities.bold());
            u3Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
            u3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(k61Var.getContext());
            k61Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
            frameLayout.addView(u3Var, w7.x5.e(-1, -2, 17));
            k61Var.addView(frameLayout, w7.x5.c(-1.0f, -1));
            rg.p0 p0Var = new rg.p0(k61Var.getContext(), e6Var, false);
            k61Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            k61Var.addView(p0Var, w7.x5.c(-1.0f, -1));
            view = k61Var;
        } else if (i10 == 6) {
            hn0 hn0Var = new hn0(h71Var.getContext(), 2);
            hn0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                hn0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                hn0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                hn0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            hn0Var.setGravity(17);
            hn0Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.y6, e6Var));
            view = hn0Var;
        } else if (i10 == 7) {
            View t3Var = new org.telegram.ui.Cells.t3(h71Var.getContext(), 52);
            t3Var.setTag("searchbox");
            view = t3Var;
        } else {
            view = new q61(h71Var, h71Var.getContext());
        }
        if (h71.c(h71Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
