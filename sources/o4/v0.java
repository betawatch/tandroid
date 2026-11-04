package o4;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import b8.yd;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.messenger.a8;
import org.telegram.messenger.e9;
import org.telegram.messenger.r2;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements f1, e9, OnSuccessListener, org.telegram.ui.ActionBar.p1, Vector.TLDeserializer {
    public final /* synthetic */ int a;

    public /* synthetic */ v0(int i3) {
        this.a = i3;
    }

    public static oi.b a() {
        InputStream open = org.telegram.messenger.t0.b.getAssets().open("grammars.dat");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[TLObject.FLAG_13];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        open.close();
                        return new oi.b(new PrismaHighlighter(byteArray));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static /* bridge */ /* synthetic */ BlendMode c(Object obj) {
        return (BlendMode) obj;
    }

    public static /* bridge */ /* synthetic */ RenderNode d(Object obj) {
        return (RenderNode) obj;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i3, boolean z10) {
        return TLRPC.Peer.TLdeserialize(inputSerializedData, i3, z10);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        s1Var.dismiss();
    }

    @Override // o4.f1
    public Object i(e0 e0Var, v vVar, int i3) {
        switch (this.a) {
            case 0:
                e0Var.getClass();
                throw new ClassCastException();
            default:
                kb.a aVar = e0Var.e;
                e0Var.s(vVar);
                aVar.getClass();
                return yd.b(new r1(-6));
        }
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        switch (this.a) {
            case 7:
                Typeface typeface = org.telegram.messenger.g0.a;
                return "%s";
            case 9:
                return "%" + (((Integer) obj).intValue() + 1) + "$s";
            case 25:
                return new TLRPC.TL_messageEntityBold();
            case 26:
                return new TLRPC.TL_messageEntityItalic();
            case 27:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10 = r2.a;
        a8.b("sms listener registered");
    }
}
