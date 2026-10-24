package ai;

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
import org.telegram.ui.Components.yx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f80;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class va implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ va(Object obj, int i10, Object obj2, Object obj3, int i11) {
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
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.ad.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new db(this.b, context, g6Var, savedStarGift, 0), g6Var, null));
                    zcVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j10 = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i13 = this.b;
                if (isChannel) {
                    long j11 = chat.id;
                    MessagesController.getInstance(i13).linkCommunity(-j11, j10, booleanValue, new hi.n0(o2Var, j11, i11));
                    break;
                } else {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(o2Var.getContext(), 3, null);
                    c2Var.r(250L);
                    MessagesController.getInstance(i13).convertToMegaGroup(o2Var.getParentActivity(), chat.id, o2Var, new hi.m0(c2Var, o2Var, i13, j10, booleanValue));
                    break;
                }
            case 2:
                ki.c6 c6Var = (ki.c6) obj4;
                ki.a aVar = (ki.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i12 == c6Var.I && c6Var.x == aVar) {
                    Editable text = c6Var.f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (mi.d dVar : (mi.d[]) text.getSpans(0, text.length(), mi.d.class)) {
                            text.removeSpan(dVar);
                        }
                        mi.d[] dVarArr = (mi.d[]) spannableString.getSpans(0, spannableString.length(), mi.d.class);
                        int length = text.length();
                        while (i11 < dVarArr.length) {
                            int spanStart = spannableString.getSpanStart(dVarArr[i11]);
                            int spanEnd = spannableString.getSpanEnd(dVarArr[i11]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(dVarArr[i11], spanStart, spanEnd, 33);
                            }
                            i11++;
                        }
                        c6Var.H = str;
                        break;
                    }
                }
                break;
            case 3:
                aw awVar = (aw) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var2 = awVar.c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i12 && iArr[1] > 0) {
                    awVar.dismiss();
                    org.telegram.ui.Components.qc.g(o2Var2, new yx0(o2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, o2Var2.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                f80 f80Var = (f80) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.E1;
                try {
                    f80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.xc X = org.telegram.ui.Components.xc.X();
                    if (X != null) {
                        org.telegram.messenger.v0.p(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
                        photoViewer.o0.r(19);
                        photoViewer.o0.r(20);
                        break;
                    } else if (photoViewer.n5) {
                        photoViewer.o0.K(20);
                        photoViewer.o0.r(19);
                        break;
                    } else {
                        photoViewer.o0.K(19);
                        photoViewer.o0.r(20);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ va(aw awVar, int[] iArr, int i10, ArrayList arrayList) {
        this.a = 3;
        this.c = awVar;
        this.d = iArr;
        this.b = i10;
        this.e = arrayList;
    }

    public /* synthetic */ va(LaunchActivity launchActivity, f80 f80Var, Long l4, int i10) {
        this.a = 4;
        this.c = launchActivity;
        this.d = f80Var;
        this.e = l4;
        this.b = i10;
    }
}
