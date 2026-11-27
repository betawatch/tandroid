// default package

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.StatFs;
import java.io.File;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gw1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gw1(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        File z;
        boolean z2;
        NativeByteBuffer byteBufferValue;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 1;
        byte b4 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i2 = ChatActivityEnterView.X7;
                if (b4 == 0) {
                    chatActivityEnterView.p3 = 0;
                }
                chatActivityEnterView.W0 = null;
                my1 my1Var = chatActivityEnterView.V0;
                if (my1Var != null) {
                    if (chatActivityEnterView.I7 == null) {
                        my1Var.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.c2.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.v4) {
                        chatActivityEnterView.v4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                xy1 xy1Var = chatActivityEnterView.O3;
                if (xy1Var != null) {
                    xy1Var.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 1:
                j95 j95Var = (j95) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(b4);
                    j95Var.n5 = Integer.valueOf(b4);
                }
                d31 d31Var = new d31(j95Var.F, new w53());
                Resources resources = j95Var.getContext().getResources();
                if (b4 == 2) {
                    i = R.drawable.msg_voice_bluetooth;
                } else if (b4 == 0) {
                    i = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                d31Var.M(resources.getDrawable(i).mutate(), j95.Y0(b4)).k(j95Var.g1());
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str = LaunchActivity.C1;
                if (yac.h(launchActivity.P).o()) {
                    try {
                        SharedPreferences e1 = uc7.e1();
                        if ((((b4 == 2 || b4 == 1) && Math.abs(launchActivity.x1 - System.currentTimeMillis()) > 240000) || Math.abs(e1.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z = xb4.z(4)) != null) {
                            StatFs statFs = new StatFs(z.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (b4 > 0) {
                                launchActivity.x1 = System.currentTimeMillis();
                            } else if (availableBlocksLong < 52428800) {
                            }
                            e1.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                            hl.c3(new sz5(launchActivity, b2));
                            break;
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            case 3:
                uc6 uc6Var = (uc6) obj;
                uc6Var.V.g1(0, -hl.L(b4));
                uc6Var.N0(false);
                break;
            case 4:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                jn7.f(mediaController.i1).k(jn7.n2, Integer.valueOf(mediaController.h1), Integer.valueOf(b4 == 2 ? 1 : 0));
                break;
            default:
                ls6 ls6Var = (ls6) obj;
                try {
                    SQLiteCursor queryFinalized = ls6Var.getMessagesStorage().b.queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + ((int) b4) + " LIMIT 1", new Object[0]);
                    if (!queryFinalized.next() || queryFinalized.getColumnCount() <= 0 || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        z2 = false;
                    } else {
                        TL_account.EmojiStatuses TLdeserialize = TL_account.EmojiStatuses.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize instanceof TL_account.TL_emojiStatuses) {
                            ls6Var.E0[b4] = TLdeserialize.hash;
                            ls6Var.F0[b4] = TLdeserialize.statuses;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        try {
                            byteBufferValue.reuse();
                        } catch (Exception e) {
                            e = e;
                            cc4.g(e, true);
                            ls6Var.H0[b4] = true;
                            ls6Var.I0[b4] = false;
                            if (!z2) {
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e2) {
                    e = e2;
                    z2 = false;
                }
                ls6Var.H0[b4] = true;
                ls6Var.I0[b4] = false;
                if (!z2) {
                    hl.c3(new ip6(ls6Var, b3));
                    break;
                } else {
                    ls6Var.N(b4, false);
                    break;
                }
                break;
        }
    }
}
