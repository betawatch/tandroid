// default package

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d13 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f13 b;
    public final /* synthetic */ u41 c;

    public /* synthetic */ d13(f13 f13Var, u41 u41Var, byte b) {
        this.a = b;
        this.b = f13Var;
        this.c = u41Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final u41 u41Var = this.c;
        final f13 f13Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                gl.d3(new Runnable() { // from class: c13
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        u41 u41Var2 = u41Var;
                        f13 f13Var2 = f13Var;
                        switch (b3) {
                            case 0:
                                u41Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    f13Var2.W1 = groupcallstreamrtmpurl.url;
                                    f13Var2.X1 = groupcallstreamrtmpurl.key;
                                    f13Var2.Y1 = new SpannableStringBuilder(f13Var2.X1);
                                    f13Var2.Z1.O(true);
                                    break;
                                }
                                break;
                            default:
                                u41Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    f13Var2.W1 = groupcallstreamrtmpurl2.url;
                                    f13Var2.X1 = groupcallstreamrtmpurl2.key;
                                    f13Var2.Y1 = new SpannableStringBuilder(f13Var2.X1);
                                    f13Var2.Z1.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gl.d3(new Runnable() { // from class: c13
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        u41 u41Var2 = u41Var;
                        f13 f13Var2 = f13Var;
                        switch (b32) {
                            case 0:
                                u41Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    f13Var2.W1 = groupcallstreamrtmpurl.url;
                                    f13Var2.X1 = groupcallstreamrtmpurl.key;
                                    f13Var2.Y1 = new SpannableStringBuilder(f13Var2.X1);
                                    f13Var2.Z1.O(true);
                                    break;
                                }
                                break;
                            default:
                                u41Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    f13Var2.W1 = groupcallstreamrtmpurl2.url;
                                    f13Var2.X1 = groupcallstreamrtmpurl2.key;
                                    f13Var2.Y1 = new SpannableStringBuilder(f13Var2.X1);
                                    f13Var2.Z1.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
