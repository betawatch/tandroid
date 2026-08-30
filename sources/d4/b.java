package d4;

import android.os.HandlerThread;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import j3.y1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.sc0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements r8.i, h5.j, fl0, sc0, c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.sc0
    public String e(int i10) {
        int i11 = this.a;
        int i12 = this.b;
        switch (i11) {
            case 4:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i10);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i12) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(epochMilli);
                }
                return LocaleController.getInstance().getFormatterWeek().format(epochMilli) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(epochMilli);
            default:
                return i10 == i12 ? "—" : String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override // r8.i
    public Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(c.j(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.j(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(d2 d2Var, int i10) {
        MessagesController.getInstance(this.b).performLogout(1);
    }

    @Override // h5.j
    public void invoke(Object obj) {
        ((y1) obj).onRepeatModeChanged(this.b);
    }

    @Override // org.telegram.ui.Components.fl0
    public int run() {
        return this.b;
    }
}
