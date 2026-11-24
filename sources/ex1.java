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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ex1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ex1(Object obj, int i, byte b) {
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
                int i2 = ChatActivityEnterView.z7;
                if (b4 == 0) {
                    chatActivityEnterView.q3 = 0;
                }
                chatActivityEnterView.W0 = null;
                jz1 jz1Var = chatActivityEnterView.V0;
                if (jz1Var != null) {
                    if (chatActivityEnterView.l7 == null) {
                        jz1Var.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.d2.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.w4) {
                        chatActivityEnterView.w4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                uz1 uz1Var = chatActivityEnterView.P3;
                if (uz1Var != null) {
                    uz1Var.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 1:
                g95 g95Var = (g95) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(b4);
                    g95Var.n5 = Integer.valueOf(b4);
                }
                c41 c41Var = new c41(g95Var.F, new q63());
                Resources resources = g95Var.getContext().getResources();
                if (b4 == 2) {
                    i = R.drawable.msg_voice_bluetooth;
                } else if (b4 == 0) {
                    i = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                c41Var.M(resources.getDrawable(i).mutate(), g95.X0(b4)).k(g95Var.f1());
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str = LaunchActivity.C1;
                if (z8c.h(launchActivity.P).o()) {
                    try {
                        SharedPreferences d1 = oc7.d1();
                        if ((((b4 == 2 || b4 == 1) && Math.abs(launchActivity.x1 - System.currentTimeMillis()) > 240000) || Math.abs(d1.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z = bc4.z(4)) != null) {
                            StatFs statFs = new StatFs(z.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (b4 > 0) {
                                launchActivity.x1 = System.currentTimeMillis();
                            } else if (availableBlocksLong < 52428800) {
                            }
                            d1.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                            gm.c3(new rz5(launchActivity, b2));
                            break;
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            case 3:
                pc6 pc6Var = (pc6) obj;
                pc6Var.V.g1(0, -gm.L(b4));
                pc6Var.N0(false);
                break;
            case 4:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                nm7.f(mediaController.i1).k(nm7.n2, Integer.valueOf(mediaController.h1), Integer.valueOf(b4 == 2 ? 1 : 0));
                break;
            default:
                hs6 hs6Var = (hs6) obj;
                try {
                    SQLiteCursor queryFinalized = hs6Var.getMessagesStorage().b.queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + ((int) b4) + " LIMIT 1", new Object[0]);
                    if (!queryFinalized.next() || queryFinalized.getColumnCount() <= 0 || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        z2 = false;
                    } else {
                        TL_account.EmojiStatuses TLdeserialize = TL_account.EmojiStatuses.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize instanceof TL_account.TL_emojiStatuses) {
                            hs6Var.E0[b4] = TLdeserialize.hash;
                            hs6Var.F0[b4] = TLdeserialize.statuses;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        try {
                            byteBufferValue.reuse();
                        } catch (Exception e) {
                            e = e;
                            fc4.g(e, true);
                            hs6Var.H0[b4] = true;
                            hs6Var.I0[b4] = false;
                            if (!z2) {
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e2) {
                    e = e2;
                    z2 = false;
                }
                hs6Var.H0[b4] = true;
                hs6Var.I0[b4] = false;
                if (!z2) {
                    gm.c3(new vp6(hs6Var, b3));
                    break;
                } else {
                    hs6Var.N(b4, false);
                    break;
                }
                break;
        }
    }
}
