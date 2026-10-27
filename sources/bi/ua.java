package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.kz;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ua implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ua(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        int i11 = 0;
        int i12 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ycVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.zc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new ai.h1(this.b, context, u6Var, savedStarGift, 2), u6Var, null));
                    ycVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j10 = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i13 = this.b;
                if (isChannel) {
                    long j11 = chat.id;
                    MessagesController.getInstance(i13).linkCommunity(-j11, j10, booleanValue, new ii.m0(r2Var, j11, i11));
                    break;
                } else {
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(r2Var.getContext(), 3, null);
                    e2Var.r(250L);
                    MessagesController.getInstance(i13).convertToMegaGroup(r2Var.getParentActivity(), chat.id, r2Var, new ii.l0(e2Var, r2Var, i13, j10, booleanValue));
                    break;
                }
            case 2:
                li.d6 d6Var = (li.d6) obj4;
                li.a aVar = (li.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i12 == d6Var.I && d6Var.x == aVar) {
                    Editable text = d6Var.f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (ni.d dVar : (ni.d[]) text.getSpans(0, text.length(), ni.d.class)) {
                            text.removeSpan(dVar);
                        }
                        ni.d[] dVarArr = (ni.d[]) spannableString.getSpans(0, spannableString.length(), ni.d.class);
                        int length = text.length();
                        while (i11 < dVarArr.length) {
                            int spanStart = spannableString.getSpanStart(dVarArr[i11]);
                            int spanEnd = spannableString.getSpanEnd(dVarArr[i11]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(dVarArr[i11], spanStart, spanEnd, 33);
                            }
                            i11++;
                        }
                        d6Var.H = str;
                        break;
                    }
                }
                break;
            case 3:
                aw awVar = (aw) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.r2 r2Var2 = awVar.c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i12 && iArr[1] > 0) {
                    awVar.dismiss();
                    org.telegram.ui.Components.qc.g(r2Var2, new hy0(r2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, r2Var2.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                kz kzVar = (kz) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    kzVar.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.wc Y = org.telegram.ui.Components.wc.Y();
                    if (Y != null) {
                        org.telegram.messenger.t.q(R.string.StoryAlbumNotFound, Y, R.raw.story_bomb2, 36);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    if (l4.longValue() > 0) {
                        bundle.putLong("user_id", l4.longValue());
                        bundle.putBoolean("my_profile", l4.longValue() == UserConfig.getInstance(launchActivity.O).getClientUserId());
                    } else {
                        bundle.putLong("chat_id", -l4.longValue());
                    }
                    bundle.putInt("open_story_album_id", i12);
                    launchActivity.u0(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                TranslateController translateController = (TranslateController) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                String str2 = (String) obj;
                if (i12 == photoViewer.Q4) {
                    photoViewer.o5 = str2;
                    if (!translateController.isContextTranslateEnabled() || !translateController.canTranslatePhoto(messageObject, photoViewer.o5)) {
                        photoViewer.o0.t(19);
                        photoViewer.o0.t(20);
                        break;
                    } else if (photoViewer.n5) {
                        photoViewer.o0.S(20);
                        photoViewer.o0.t(19);
                        break;
                    } else {
                        photoViewer.o0.S(19);
                        photoViewer.o0.t(20);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ua(aw awVar, int[] iArr, int i10, ArrayList arrayList) {
        this.a = 3;
        this.c = awVar;
        this.d = iArr;
        this.b = i10;
        this.e = arrayList;
    }

    public /* synthetic */ ua(LaunchActivity launchActivity, kz kzVar, Long l4, int i10) {
        this.a = 4;
        this.c = launchActivity;
        this.d = kzVar;
        this.e = l4;
        this.b = i10;
    }
}
