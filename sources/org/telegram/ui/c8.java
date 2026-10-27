package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c8 extends s4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c8(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // s4.h0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((n8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f3.size();
            case 2:
                return ((org.telegram.ui.Components.d9) this.d).f3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((sp0) this.d).f.size();
        }
    }

    @Override // s4.h0
    public long i(int i10) {
        switch (this.c) {
            case 0:
                n8 n8Var = (n8) this.d;
                return ((n8Var.I - (i10 / 12)) * 100) + (n8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                if (i10 >= ((org.telegram.ui.Components.d9) this.d).f3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.c9) r0.f3.get(i10)).a;
        }
    }

    @Override // s4.h0
    public int j(int i10) {
        switch (this.c) {
            case 2:
                return i10 >= ((org.telegram.ui.Components.d9) this.d).f3.size() ? 1 : 0;
            default:
                return super.j(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        switch (this.c) {
            case 0:
                k8 k8Var = (k8) e1Var.a;
                n8 n8Var = (n8) this.d;
                int i14 = n8Var.I - (i10 / 12);
                int i15 = n8Var.J - (i10 % 12);
                if (i15 < 0) {
                    i15 += 12;
                    i14--;
                }
                if (k8Var.b == i14) {
                    int i16 = k8Var.c;
                }
                SparseArray sparseArray = (SparseArray) n8Var.S.get((i14 * 100) + i15);
                n8 n8Var2 = k8Var.x;
                boolean z12 = (i14 == k8Var.b && i15 == k8Var.c) ? false : true;
                k8Var.b = i14;
                k8Var.c = i15;
                k8Var.n = sparseArray;
                boolean z13 = false;
                if (z12 && k8Var.r != null) {
                    for (int i17 = 0; i17 < k8Var.r.size(); i17++) {
                        ((ImageReceiver) k8Var.r.valueAt(i17)).onDetachedFromWindow();
                        ((ImageReceiver) k8Var.r.valueAt(i17)).setParentView(null);
                    }
                    k8Var.r = null;
                }
                if (sparseArray != null) {
                    if (k8Var.r == null) {
                        k8Var.r = new SparseArray();
                    }
                    int i18 = 0;
                    while (i18 < sparseArray.size()) {
                        int keyAt = sparseArray.keyAt(i18);
                        if (k8Var.r.get(keyAt, z13) == null && ((l8) sparseArray.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver();
                            imageReceiver.setParentView(k8Var);
                            MessageObject messageObject = ((l8) sparseArray.get(keyAt)).a;
                            if (messageObject != null) {
                                boolean hasMediaSpoilers = messageObject.hasMediaSpoilers();
                                if (messageObject.isVideo()) {
                                    TLRPC.Document document = messageObject.getDocument();
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
                                    if (closestPhotoSizeWithSize == closestPhotoSizeWithSize2) {
                                        closestPhotoSizeWithSize2 = null;
                                    }
                                    if (closestPhotoSizeWithSize != null) {
                                        if (messageObject.strippedThumb != null) {
                                            imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), hasMediaSpoilers ? "5_5_b" : "44_44", messageObject.strippedThumb, null, messageObject, 0);
                                        } else {
                                            imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), hasMediaSpoilers ? "5_5_b" : "44_44", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", (String) null, messageObject, 0);
                                        }
                                    }
                                } else {
                                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !messageObject.photoThumbs.isEmpty()) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
                                        if (!messageObject.mediaExists) {
                                            i11 = ((org.telegram.ui.ActionBar.r2) n8Var2).currentAccount;
                                            if (!DownloadController.getInstance(i11).canDownloadMedia(messageObject)) {
                                                BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                                                if (bitmapDrawable != null) {
                                                    imageReceiver.setImage(null, null, bitmapDrawable, null, messageObject, 0);
                                                } else {
                                                    imageReceiver.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", (String) null, messageObject, 0);
                                                }
                                            }
                                        }
                                        if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                                            closestPhotoSizeWithSize3 = null;
                                        }
                                        long j10 = 0;
                                        if (messageObject.strippedThumb != null) {
                                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
                                            String str2 = hasMediaSpoilers ? "5_5_b" : "44_44";
                                            BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                                            if (closestPhotoSizeWithSize4 != null) {
                                                str = str2;
                                                j10 = closestPhotoSizeWithSize4.size;
                                            } else {
                                                str = str2;
                                            }
                                            imageReceiver.setImage(forObject, str, null, null, bitmapDrawable2, j10, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                        } else {
                                            imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), hasMediaSpoilers ? "5_5_b" : "44_44", ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                        }
                                    }
                                }
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(22.0f));
                                k8Var.r.put(keyAt, imageReceiver);
                            }
                        }
                        i18++;
                        z13 = false;
                    }
                }
                int i19 = i15 + 1;
                k8Var.d = YearMonth.of(i14, i19).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i14, i15, 0);
                k8Var.e = (calendar.get(7) + 6) % 7;
                k8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i20 = k8Var.d + k8Var.e;
                k8Var.f = ((int) (i20 / 7.0f)) + (i20 % 7 == 0 ? 0 : 1);
                calendar.set(i14, i19, 0);
                k8Var.a.l(LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true), false);
                n8Var2.w0(k8Var, false);
                k8.a(k8Var, n8Var.P, n8Var.Q);
                k8.b(k8Var, 1.0f);
                n8Var.w0(k8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) e1Var.a;
                ua0 ua0Var = (ua0) ((org.telegram.ui.Cells.t) this.d).f3.get(i10);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = ua0Var.b;
                int i22 = ua0Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!ua0Var.e || UserConfig.hasPremiumOnAccounts()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(LocaleController.getString(i22));
                } else {
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.t.h(i22, new StringBuilder("d ")));
                    org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.msg_mini_premiumlock, 0);
                    zqVar.setTopOffset(1);
                    zqVar.setSize(AndroidUtilities.dp(13.0f));
                    spannableString.setSpan(zqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(a8.ze.a(ua0Var), false);
                int dp = AndroidUtilities.dp(18.0f);
                int i23 = org.telegram.ui.ActionBar.y6.i6;
                org.telegram.ui.ActionBar.f7.R(qVar, org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, org.telegram.ui.ActionBar.y6.x0(null, i23, false), -16777216), null, org.telegram.ui.ActionBar.f7.N(i23), null);
                qVar.setForeground(ua0Var.c);
                break;
            case 2:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) this.d;
                org.telegram.ui.Components.g9 g9Var = d9Var.k3;
                ArrayList arrayList = d9Var.f3;
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) e1Var.a;
                if (e1Var.f != 0) {
                    e9Var.d = true;
                    i12 = ((org.telegram.ui.ActionBar.r2) g9Var).currentAccount;
                    boolean z14 = !UserConfig.getInstance(i12).isPremium();
                    if (e9Var.v != z14) {
                        e9Var.v = z14;
                        e9Var.invalidate();
                    }
                    e9Var.a = d9Var.j3;
                    z10 = d9Var.h3 == 1;
                    if (e9Var.c != z10) {
                        e9Var.c = z10;
                        e9Var.invalidate();
                        break;
                    }
                } else {
                    e9Var.d = false;
                    org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) arrayList.get(i10);
                    if (c9Var.b) {
                        i13 = ((org.telegram.ui.ActionBar.r2) g9Var).currentAccount;
                        if (!UserConfig.getInstance(i13).isPremium()) {
                            z11 = true;
                            if (e9Var.v != z11) {
                                e9Var.v = z11;
                                e9Var.invalidate();
                            }
                            e9Var.a = c9Var;
                            z10 = d9Var.h3 == ((org.telegram.ui.Components.c9) arrayList.get(i10)).a;
                            if (e9Var.c == z10) {
                                e9Var.c = z10;
                                e9Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (e9Var.v != z11) {
                    }
                    e9Var.a = c9Var;
                    if (d9Var.h3 == ((org.telegram.ui.Components.c9) arrayList.get(i10)).a) {
                    }
                    if (e9Var.c == z10) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            default:
                TextView textView2 = (TextView) e1Var.a;
                sp0 sp0Var = (sp0) this.d;
                textView2.setText((CharSequence) sp0Var.f.get(i10));
                textView2.setTextColor(i10 == sp0Var.d ? sp0Var.E : sp0Var.y);
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.wl0(new k8((n8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                org.telegram.ui.Cells.s sVar = new org.telegram.ui.Cells.s(context);
                Paint paint = new Paint(1);
                sVar.a = paint;
                Paint paint2 = new Paint(1);
                sVar.b = paint2;
                sVar.setOrientation(1);
                sVar.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                sVar.c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                sVar.addView(qVar, org.telegram.ui.Components.kb1.u(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
                sVar.addView(textView, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.wl0(sVar);
            case 2:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) this.d;
                return new org.telegram.ui.Components.wl0(new org.telegram.ui.Components.e9(d9Var.k3, d9Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.wl0(((org.telegram.ui.Components.cn) this.d).v);
            case 4:
                return new org.telegram.ui.Components.wl0(new bi.cc(this, ((org.telegram.ui.Components.ho) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(viewGroup.getContext(), null);
                aa0Var.setGravity(17);
                aa0Var.setTypeface(AndroidUtilities.bold());
                aa0Var.setTextSize(1, 14.0f);
                aa0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                aa0Var.setEllipsize(TextUtils.TruncateAt.END);
                aa0Var.setSingleLine();
                aa0Var.setMaxLines(1);
                aa0Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(28.0f)));
                org.telegram.ui.Components.kb1.c(aa0Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.wl0(aa0Var);
        }
    }

    private final void D(s4.e1 e1Var, int i10) {
    }

    private final void E(s4.e1 e1Var, int i10) {
    }
}
