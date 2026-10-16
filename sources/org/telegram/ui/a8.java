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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class a8 extends s4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a8(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // s4.g0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((l8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).V2.size();
            case 2:
                return ((org.telegram.ui.Components.e9) this.d).V2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((dq0) this.d).f.size();
        }
    }

    @Override // s4.g0
    public long i(int i10) {
        switch (this.c) {
            case 0:
                l8 l8Var = (l8) this.d;
                return ((l8Var.I - (i10 / 12)) * 100) + (l8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                if (i10 >= ((org.telegram.ui.Components.e9) this.d).V2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.d9) r0.V2.get(i10)).a;
        }
    }

    @Override // s4.g0
    public int j(int i10) {
        switch (this.c) {
            case 2:
                return i10 >= ((org.telegram.ui.Components.e9) this.d).V2.size() ? 1 : 0;
            default:
                return super.j(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        switch (this.c) {
            case 0:
                i8 i8Var = (i8) b1Var.a;
                l8 l8Var = (l8) this.d;
                int i14 = l8Var.I - (i10 / 12);
                int i15 = l8Var.J - (i10 % 12);
                if (i15 < 0) {
                    i15 += 12;
                    i14--;
                }
                if (i8Var.b == i14) {
                    int i16 = i8Var.c;
                }
                SparseArray sparseArray = (SparseArray) l8Var.S.get((i14 * 100) + i15);
                l8 l8Var2 = i8Var.x;
                boolean z12 = (i14 == i8Var.b && i15 == i8Var.c) ? false : true;
                i8Var.b = i14;
                i8Var.c = i15;
                i8Var.n = sparseArray;
                boolean z13 = false;
                if (z12 && i8Var.r != null) {
                    for (int i17 = 0; i17 < i8Var.r.size(); i17++) {
                        ((ImageReceiver) i8Var.r.valueAt(i17)).onDetachedFromWindow();
                        ((ImageReceiver) i8Var.r.valueAt(i17)).setParentView(null);
                    }
                    i8Var.r = null;
                }
                if (sparseArray != null) {
                    if (i8Var.r == null) {
                        i8Var.r = new SparseArray();
                    }
                    int i18 = 0;
                    while (i18 < sparseArray.size()) {
                        int keyAt = sparseArray.keyAt(i18);
                        if (i8Var.r.get(keyAt, z13) == null && ((j8) sparseArray.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver();
                            imageReceiver.setParentView(i8Var);
                            MessageObject messageObject = ((j8) sparseArray.get(keyAt)).a;
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
                                            i11 = ((org.telegram.ui.ActionBar.m2) l8Var2).currentAccount;
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
                                i8Var.r.put(keyAt, imageReceiver);
                            }
                        }
                        i18++;
                        z13 = false;
                    }
                }
                int i19 = i15 + 1;
                i8Var.d = YearMonth.of(i14, i19).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i14, i15, 0);
                i8Var.e = (calendar.get(7) + 6) % 7;
                i8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i20 = i8Var.d + i8Var.e;
                i8Var.f = ((int) (i20 / 7.0f)) + (i20 % 7 == 0 ? 0 : 1);
                calendar.set(i14, i19, 0);
                i8Var.a.l(LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true), false);
                l8Var2.s0(i8Var, false);
                i8.a(i8Var, l8Var.P, l8Var.Q);
                i8.b(i8Var, 1.0f);
                l8Var.s0(i8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) b1Var.a;
                nb0 nb0Var = (nb0) ((org.telegram.ui.Cells.t) this.d).V2.get(i10);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = nb0Var.b;
                int i22 = nb0Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!nb0Var.e || UserConfig.hasPremiumOnAccounts()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(LocaleController.getString(i22));
                } else {
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.g0.g(i22, new StringBuilder("d ")));
                    org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.msg_mini_premiumlock, 0);
                    brVar.setTopOffset(1);
                    brVar.setSize(AndroidUtilities.dp(13.0f));
                    spannableString.setSpan(brVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(w7.g6.a(nb0Var), false);
                int dp = AndroidUtilities.dp(18.0f);
                qVar.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false), -16777216));
                qVar.setForeground(nb0Var.c);
                break;
            case 2:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.d;
                org.telegram.ui.Components.h9 h9Var = e9Var.a3;
                ArrayList arrayList = e9Var.V2;
                org.telegram.ui.Components.f9 f9Var = (org.telegram.ui.Components.f9) b1Var.a;
                if (b1Var.f != 0) {
                    f9Var.d = true;
                    i12 = ((org.telegram.ui.ActionBar.m2) h9Var).currentAccount;
                    boolean z14 = !UserConfig.getInstance(i12).isPremium();
                    if (f9Var.v != z14) {
                        f9Var.v = z14;
                        f9Var.invalidate();
                    }
                    f9Var.a = e9Var.Z2;
                    z10 = e9Var.X2 == 1;
                    if (f9Var.c != z10) {
                        f9Var.c = z10;
                        f9Var.invalidate();
                        break;
                    }
                } else {
                    f9Var.d = false;
                    org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) arrayList.get(i10);
                    if (d9Var.b) {
                        i13 = ((org.telegram.ui.ActionBar.m2) h9Var).currentAccount;
                        if (!UserConfig.getInstance(i13).isPremium()) {
                            z11 = true;
                            if (f9Var.v != z11) {
                                f9Var.v = z11;
                                f9Var.invalidate();
                            }
                            f9Var.a = d9Var;
                            z10 = e9Var.X2 == ((org.telegram.ui.Components.d9) arrayList.get(i10)).a;
                            if (f9Var.c == z10) {
                                f9Var.c = z10;
                                f9Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (f9Var.v != z11) {
                    }
                    f9Var.a = d9Var;
                    if (e9Var.X2 == ((org.telegram.ui.Components.d9) arrayList.get(i10)).a) {
                    }
                    if (f9Var.c == z10) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            default:
                TextView textView2 = (TextView) b1Var.a;
                dq0 dq0Var = (dq0) this.d;
                textView2.setText((CharSequence) dq0Var.f.get(i10));
                textView2.setTextColor(i10 == dq0Var.d ? dq0Var.E : dq0Var.y);
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.wl0(new i8((l8) this.d, viewGroup.getContext()));
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
                sVar.addView(qVar, w7.z5.q(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
                sVar.addView(textView, w7.z5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.wl0(sVar);
            case 2:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.d;
                return new org.telegram.ui.Components.wl0(new org.telegram.ui.Components.f9(e9Var.a3, e9Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.wl0(((org.telegram.ui.Components.en) this.d).v);
            case 4:
                return new org.telegram.ui.Components.wl0(new di.ab(this, ((org.telegram.ui.Components.jo) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(viewGroup.getContext(), null);
                da0Var.setGravity(17);
                da0Var.setTypeface(AndroidUtilities.bold());
                da0Var.setTextSize(1, 14.0f);
                da0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                da0Var.setEllipsize(TextUtils.TruncateAt.END);
                da0Var.setSingleLine();
                da0Var.setMaxLines(1);
                da0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(28.0f)));
                w7.b6.b(da0Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.wl0(da0Var);
        }
    }

    private final void D(s4.b1 b1Var, int i10) {
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}
