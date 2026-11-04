package ci;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.x00;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ly;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w9 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w9(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        int i10 = 1;
        int i11 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.ic.b(bd.M0(2131745229, null), new bi.q0(this.b, context, e6Var, savedStarGift, 2), e6Var, null));
                    hcVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j10 = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.t3.T(chat);
                int i12 = this.b;
                if (T) {
                    long j11 = chat.id;
                    hp.s1(i12).Q2(-j11, j10, false, booleanValue, new ai.r(d2Var, j11, i10));
                    break;
                } else {
                    org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, d2Var.getContext(), null);
                    s1Var.r(250L);
                    hp.s1(i12).T(d2Var.getParentActivity(), chat.id, d2Var, new ji.d0(s1Var, d2Var, i12, j10, booleanValue), null);
                    break;
                }
            case 2:
                mi.b6 b6Var = (mi.b6) obj4;
                mi.a aVar = (mi.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == b6Var.J && b6Var.y == aVar) {
                    Editable text = b6Var.f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (oi.d dVar : (oi.d[]) text.getSpans(0, text.length(), oi.d.class)) {
                            text.removeSpan(dVar);
                        }
                        oi.d[] dVarArr = (oi.d[]) spannableString.getSpans(0, spannableString.length(), oi.d.class);
                        int length = text.length();
                        for (int i13 = 0; i13 < dVarArr.length; i13++) {
                            int spanStart = spannableString.getSpanStart(dVarArr[i13]);
                            int spanEnd = spannableString.getSpanEnd(dVarArr[i13]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(dVarArr[i13], spanStart, spanEnd, 33);
                            }
                        }
                        b6Var.I = str;
                        break;
                    }
                }
                break;
            case 3:
                pu puVar = (pu) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.d2 d2Var2 = puVar.k1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    puVar.dismiss();
                    org.telegram.ui.Components.ac.g(d2Var2, new bv0(d2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, d2Var2.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ly lyVar = (ly) obj3;
                Long l10 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str2 = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.fc X = org.telegram.ui.Components.fc.X();
                    if (X != null) {
                        org.telegram.messenger.k5.o(null, 2131744740, X, R.raw.story_bomb2, 36);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    if (l10.longValue() > 0) {
                        bundle.putLong("user_id", l10.longValue());
                        bundle.putBoolean("my_profile", l10.longValue() == h10.i(launchActivity.P).e());
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
                x00 x00Var = (x00) obj3;
                zi ziVar = (zi) obj2;
                String str3 = (String) obj;
                if (i11 == photoViewer.R4) {
                    photoViewer.p5 = str3;
                    if (!x00Var.s() || !x00Var.b(ziVar, photoViewer.p5)) {
                        photoViewer.p0.t(19);
                        photoViewer.p0.t(20);
                        break;
                    } else if (photoViewer.o5) {
                        photoViewer.p0.S(20);
                        photoViewer.p0.t(19);
                        break;
                    } else {
                        photoViewer.p0.S(19);
                        photoViewer.p0.t(20);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ w9(pu puVar, int[] iArr, int i3, ArrayList arrayList) {
        this.a = 3;
        this.c = puVar;
        this.d = iArr;
        this.b = i3;
        this.e = arrayList;
    }

    public /* synthetic */ w9(LaunchActivity launchActivity, ly lyVar, Long l10, int i3) {
        this.a = 4;
        this.c = launchActivity;
        this.d = lyVar;
        this.e = l10;
        this.b = i3;
    }
}
