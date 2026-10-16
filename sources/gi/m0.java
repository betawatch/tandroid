package gi;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;
import ji.i6;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.n21;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d20;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
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
                m2 m2Var = (m2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j10 = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i13 = this.b;
                if (isChannel) {
                    long j11 = chat.id;
                    MessagesController.getInstance(i13).linkCommunity(-j11, j10, booleanValue, new o0(m2Var, j11, i11));
                    break;
                } else {
                    a2 a2Var = new a2(m2Var.getContext(), 3, null);
                    a2Var.q(250L);
                    MessagesController.getInstance(i13).convertToMegaGroup(m2Var.getParentActivity(), chat.id, m2Var, new n0(a2Var, m2Var, i13, j10, booleanValue));
                    break;
                }
            case 1:
                i6 i6Var = (i6) obj4;
                ji.a aVar = (ji.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i12 == i6Var.I && i6Var.x == aVar) {
                    Editable text = i6Var.f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (li.d dVar : (li.d[]) text.getSpans(0, text.length(), li.d.class)) {
                            text.removeSpan(dVar);
                        }
                        li.d[] dVarArr = (li.d[]) spannableString.getSpans(0, spannableString.length(), li.d.class);
                        int length = text.length();
                        while (i11 < dVarArr.length) {
                            int spanStart = spannableString.getSpanStart(dVarArr[i11]);
                            int spanEnd = spannableString.getSpanEnd(dVarArr[i11]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(dVarArr[i11], spanStart, spanEnd, 33);
                            }
                            i11++;
                        }
                        i6Var.H = str;
                        break;
                    }
                }
                break;
            case 2:
                ew ewVar = (ew) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                m2 m2Var2 = ewVar.c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i12 && iArr[1] > 0) {
                    ewVar.dismiss();
                    sc.g(m2Var2, new yx0(m2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, m2Var2.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                d20 d20Var = (d20) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    d20Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    zc X = zc.X();
                    if (X != null) {
                        org.telegram.messenger.g0.q(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
                    launchActivity.p0(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 4:
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
            default:
                bd bdVar = (bd) obj4;
                Context context = (Context) obj3;
                c6 c6Var = (c6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bdVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new n21(this.b, context, c6Var, savedStarGift, 21), c6Var, null));
                    bdVar.setText(spannableStringBuilder);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m0(ew ewVar, int[] iArr, int i10, ArrayList arrayList) {
        this.a = 2;
        this.c = ewVar;
        this.d = iArr;
        this.b = i10;
        this.e = arrayList;
    }

    public /* synthetic */ m0(LaunchActivity launchActivity, d20 d20Var, Long l4, int i10) {
        this.a = 3;
        this.c = launchActivity;
        this.d = d20Var;
        this.e = l4;
        this.b = i10;
    }
}
