package di;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.messenger.z00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o9(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 1;
        int i11 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.nc ncVar = (org.telegram.ui.Components.nc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ncVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.oc.b(gd.M0(2131744984, null), new bi.t4(this.b, context, i6Var, savedStarGift, 3), i6Var, null));
                    ncVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj3;
                bi.s4 s4Var = (bi.s4) obj2;
                ((ai.v1) obj4).a(Boolean.FALSE);
                if (((Boolean) obj).booleanValue()) {
                    if (LaunchActivity.T() != h2Var || j10.t0 != i11) {
                        org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.Y().Q(R.raw.contact_check, 36, gd.M0(2131749335, null));
                        Q.j = 5000;
                        Q.j();
                        break;
                    } else {
                        s4Var.run();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.gc Q2 = org.telegram.ui.Components.lc.Y().Q(R.raw.error, 36, gd.M0(2131749334, null));
                    Q2.j = 5000;
                    Q2.j();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.v3.T(chat);
                int i12 = this.b;
                if (T) {
                    long j10 = chat.id;
                    mp.u1(i12).W2(-j10, j3, false, booleanValue, new bi.n(h2Var2, j10, i10));
                    break;
                } else {
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, h2Var2.getContext(), null);
                    u1Var.r(250L);
                    mp.u1(i12).T(h2Var2.getParentActivity(), chat.id, h2Var2, new li.f0(u1Var, h2Var2, i12, j3, booleanValue), null);
                    break;
                }
            case 3:
                oi.z5 z5Var = (oi.z5) obj4;
                oi.a aVar = (oi.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == z5Var.J && z5Var.y == aVar) {
                    Editable text = z5Var.f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (qi.c cVar : (qi.c[]) text.getSpans(0, text.length(), qi.c.class)) {
                            text.removeSpan(cVar);
                        }
                        qi.c[] cVarArr = (qi.c[]) spannableString.getSpans(0, spannableString.length(), qi.c.class);
                        int length = text.length();
                        for (int i13 = 0; i13 < cVarArr.length; i13++) {
                            int spanStart = spannableString.getSpanStart(cVarArr[i13]);
                            int spanEnd = spannableString.getSpanEnd(cVarArr[i13]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(cVarArr[i13], spanStart, spanEnd, 33);
                            }
                        }
                        z5Var.I = str;
                        break;
                    }
                }
                break;
            case 4:
                bv bvVar = (bv) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.h2 h2Var3 = bvVar.n1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    bvVar.dismiss();
                    org.telegram.ui.Components.gc.g(h2Var3, new mv0(h2Var3.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, h2Var3.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                o60 o60Var = (o60) obj3;
                Long l10 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str2 = LaunchActivity.C1;
                try {
                    o60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.lc Y = org.telegram.ui.Components.lc.Y();
                    if (Y != null) {
                        org.telegram.messenger.f3.n(null, 2131744495, Y, R.raw.story_bomb2, 36);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    if (l10.longValue() > 0) {
                        bundle.putLong("user_id", l10.longValue());
                        bundle.putBoolean("my_profile", l10.longValue() == j10.i(launchActivity.P).e());
                    } else {
                        bundle.putLong("chat_id", -l10.longValue());
                    }
                    bundle.putInt("open_story_album_id", i11);
                    launchActivity.t0(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                z00 z00Var = (z00) obj3;
                fj fjVar = (fj) obj2;
                String str3 = (String) obj;
                if (i11 == photoViewer.Q4) {
                    photoViewer.o5 = str3;
                    if (!z00Var.s() || !z00Var.b(fjVar, photoViewer.o5)) {
                        photoViewer.p0.u(19);
                        photoViewer.p0.u(20);
                        break;
                    } else if (photoViewer.n5) {
                        photoViewer.p0.T(20);
                        photoViewer.p0.u(19);
                        break;
                    } else {
                        photoViewer.p0.T(19);
                        photoViewer.p0.u(20);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ o9(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ o9(LaunchActivity launchActivity, o60 o60Var, Long l10, int i7) {
        this.a = 5;
        this.c = launchActivity;
        this.d = o60Var;
        this.e = l10;
        this.b = i7;
    }
}
