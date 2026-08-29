package org.telegram.tgnet.tl;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.l;
import org.telegram.tgnet.o;
import org.telegram.tgnet.r;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class TL_account {

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class BusinessAwayMessageSchedule extends TLObject {
        public static BusinessAwayMessageSchedule TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (BusinessAwayMessageSchedule) TLObject.TLdeserialize(BusinessAwayMessageSchedule.class, i10 != -1007487743 ? i10 != -910564679 ? i10 != -867328308 ? null : new TL_businessAwayMessageScheduleCustom() : new TL_businessAwayMessageScheduleAlways() : new TL_businessAwayMessageScheduleOutsideWorkHours(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static abstract class ChatThemes extends TLObject {
        public static ChatThemes TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (ChatThemes) TLObject.TLdeserialize(ChatThemes.class, fromConstructor(i10), inputSerializedData, i10, z10);
        }

        private static ChatThemes fromConstructor(int i10) {
            if (i10 == -1106673293) {
                return new Tl_chatThemes();
            }
            if (i10 != -535699004) {
                return null;
            }
            return new TL_chatThemesNotModified();
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class EmailVerified extends TLObject {
        public static EmailVerified TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (EmailVerified) TLObject.TLdeserialize(EmailVerified.class, i10 != -507835039 ? i10 != 731303195 ? null : new TL_emailVerified() : new TL_emailVerifiedLogin(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class EmojiStatuses extends TLObject {
        public long hash;
        public ArrayList<TLRPC.EmojiStatus> statuses = new ArrayList<>();

        public static EmojiStatuses TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (EmojiStatuses) TLObject.TLdeserialize(EmojiStatuses.class, i10 != -1866176559 ? i10 != -796072379 ? null : new TL_emojiStatusesNotModified() : new TL_emojiStatuses(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class InputPasskeyResponse extends TLObject {
        public static InputPasskeyResponse TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (InputPasskeyResponse) TLObject.TLdeserialize(InputPasskeyResponse.class, i10 != -1021329078 ? i10 != 1046713180 ? null : new inputPasskeyResponseRegister() : new inputPasskeyResponseLogin(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class Passkey extends TLObject {
        public static final int constructor = -1738457409;
        public int date;
        public int flags;
        public String id;
        public int last_usage_date;
        public String name;
        public long software_emoji_id;

        public static Passkey TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (Passkey) TLObject.TLdeserialize(Passkey.class, i10 != -1738457409 ? null : new Passkey(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.id = inputSerializedData.readString(z10);
            this.name = inputSerializedData.readString(z10);
            this.date = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.software_emoji_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.last_usage_date = inputSerializedData.readInt32(z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeString(this.name);
            outputSerializedData.writeInt32(this.date);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.software_emoji_id);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.last_usage_date);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class Passkeys extends TLObject {
        public static final int constructor = -119494116;
        public ArrayList<Passkey> passkeys = new ArrayList<>();

        public static Passkeys TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (Passkeys) TLObject.TLdeserialize(Passkeys.class, i10 != -119494116 ? null : new Passkeys(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.passkeys = Vector.deserialize(inputSerializedData, new c(1), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.passkeys);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class Password extends TLObject {
        public TLRPC.PasswordKdfAlgo current_algo;
        public String email_unconfirmed_pattern;
        public int flags;
        public boolean has_password;
        public boolean has_recovery;
        public boolean has_secure_values;
        public String hint;
        public String login_email_pattern;
        public TLRPC.PasswordKdfAlgo new_algo;
        public TLRPC.SecurePasswordKdfAlgo new_secure_algo;
        public int pending_reset_date;
        public byte[] secure_random;
        public byte[] srp_B;
        public long srp_id;

        public static Password TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (Password) TLObject.TLdeserialize(Password.class, i10 != -1787080453 ? i10 != 408623183 ? null : new TL_password_layer144() : new TL_password(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class ReactionNotificationsFrom extends TLObject {
        public static ReactionNotificationsFrom TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (ReactionNotificationsFrom) TLObject.TLdeserialize(ReactionNotificationsFrom.class, i10 != -1161583078 ? i10 != 1268654752 ? null : new TL_reactionNotificationsFromAll() : new TL_reactionNotificationsFromContacts(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class RequirementToContact extends TLObject {
        public static RequirementToContact TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (RequirementToContact) TLObject.TLdeserialize(RequirementToContact.class, i10 != -1258914157 ? i10 != -444472087 ? i10 != 84580409 ? null : new requirementToContactEmpty() : new requirementToContactPremium() : new requirementToContactPaidMessages(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class ResetPasswordResult extends TLObject {
        public static ResetPasswordResult TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (ResetPasswordResult) TLObject.TLdeserialize(ResetPasswordResult.class, i10 != -478701471 ? i10 != -383330754 ? i10 != -370148227 ? null : new resetPasswordRequestedWait() : new resetPasswordOk() : new resetPasswordFailedWait(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class SavedMusicIds extends TLObject {
        public ArrayList<Long> ids = new ArrayList<>();

        public static SavedMusicIds TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (SavedMusicIds) TLObject.TLdeserialize(SavedMusicIds.class, i10 != -1718786506 ? i10 != 1338514798 ? null : new TL_savedMusicIdsNotModified() : new TL_savedMusicIds(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class SavedRingtone extends TLObject {
        public static SavedRingtone TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (SavedRingtone) TLObject.TLdeserialize(SavedRingtone.class, i10 != -1222230163 ? i10 != 523271863 ? null : new TL_savedRingtoneConverted() : new TL_savedRingtone(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class SavedRingtones extends TLObject {
        public static SavedRingtones TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (SavedRingtones) TLObject.TLdeserialize(SavedRingtones.class, i10 != -1041683259 ? i10 != -67704655 ? null : new TL_savedRingtonesNotModified() : new TL_savedRingtones(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_birthday extends TLObject {
        public static final int constructor = 1821253126;
        public int day;
        public int flags;
        public int month;
        public int year;

        public static TL_birthday TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_birthday) TLObject.TLdeserialize(TL_birthday.class, i10 != 1821253126 ? null : new TL_birthday(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.day = inputSerializedData.readInt32(z10);
            this.month = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.year = inputSerializedData.readInt32(z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.day);
            outputSerializedData.writeInt32(this.month);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.year);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessAwayMessage extends TLObject {
        public static final int constructor = -283809188;
        public int flags;
        public boolean offline_only;
        public TL_businessRecipients recipients;
        public BusinessAwayMessageSchedule schedule;
        public int shortcut_id;

        public static TL_businessAwayMessage TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_businessAwayMessage) TLObject.TLdeserialize(TL_businessAwayMessage.class, i10 != -283809188 ? null : new TL_businessAwayMessage(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.offline_only = TLObject.hasFlag(readInt32, 1);
            this.shortcut_id = inputSerializedData.readInt32(z10);
            this.schedule = BusinessAwayMessageSchedule.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.recipients = TL_businessRecipients.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.offline_only);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt32(this.shortcut_id);
            this.schedule.serializeToStream(outputSerializedData);
            this.recipients.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessAwayMessageScheduleAlways extends BusinessAwayMessageSchedule {
        public static final int constructor = -910564679;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessAwayMessageScheduleCustom extends BusinessAwayMessageSchedule {
        public static final int constructor = -867328308;
        public int end_date;
        public int start_date;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.start_date = inputSerializedData.readInt32(z10);
            this.end_date = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.start_date);
            outputSerializedData.writeInt32(this.end_date);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessAwayMessageScheduleOutsideWorkHours extends BusinessAwayMessageSchedule {
        public static final int constructor = -1007487743;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessBotRecipients extends TLObject {
        public static final int constructor = -1198722189;
        public boolean contacts;
        public boolean exclude_selected;
        public boolean existing_chats;
        public int flags;
        public boolean new_chats;
        public boolean non_contacts;
        public ArrayList<Long> users = new ArrayList<>();
        public ArrayList<Long> exclude_users = new ArrayList<>();

        public static TL_businessBotRecipients TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_businessBotRecipients) TLObject.TLdeserialize(TL_businessBotRecipients.class, i10 != -1198722189 ? null : new TL_businessBotRecipients(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.existing_chats = TLObject.hasFlag(readInt32, 1);
            this.new_chats = TLObject.hasFlag(this.flags, 2);
            this.contacts = TLObject.hasFlag(this.flags, 4);
            this.non_contacts = TLObject.hasFlag(this.flags, 8);
            this.exclude_selected = TLObject.hasFlag(this.flags, 32);
            if (TLObject.hasFlag(this.flags, 16)) {
                this.users = Vector.deserializeLong(inputSerializedData, z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.exclude_users = Vector.deserializeLong(inputSerializedData, z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.existing_chats);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.new_chats);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.contacts);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.non_contacts);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 32, this.exclude_selected);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serializeLong(outputSerializedData, this.users);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                Vector.serializeLong(outputSerializedData, this.exclude_users);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessBotRights extends TLObject {
        public static final int constructor = -1604170505;
        public boolean change_gift_settings;
        public boolean delete_received_messages;
        public boolean delete_sent_messages;
        public boolean edit_bio;
        public boolean edit_name;
        public boolean edit_profile_photo;
        public boolean edit_username;
        public int flags;
        public boolean manage_stories;
        public boolean read_messages;
        public boolean reply;
        public boolean sell_gifts;
        public boolean transfer_and_upgrade_gifts;
        public boolean transfer_stars;
        public boolean view_gifts;

        public static TL_businessBotRights TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_businessBotRights) TLObject.TLdeserialize(TL_businessBotRights.class, i10 != -1604170505 ? null : new TL_businessBotRights(), inputSerializedData, i10, z10);
        }

        public static TL_businessBotRights all() {
            TL_businessBotRights tL_businessBotRights = new TL_businessBotRights();
            tL_businessBotRights.reply = true;
            tL_businessBotRights.read_messages = true;
            tL_businessBotRights.delete_sent_messages = true;
            tL_businessBotRights.delete_received_messages = true;
            tL_businessBotRights.edit_name = true;
            tL_businessBotRights.edit_bio = true;
            tL_businessBotRights.edit_profile_photo = true;
            tL_businessBotRights.edit_username = true;
            tL_businessBotRights.view_gifts = true;
            tL_businessBotRights.sell_gifts = true;
            tL_businessBotRights.change_gift_settings = true;
            tL_businessBotRights.transfer_and_upgrade_gifts = true;
            tL_businessBotRights.transfer_stars = true;
            tL_businessBotRights.manage_stories = true;
            return tL_businessBotRights;
        }

        public static TL_businessBotRights clone(TL_businessBotRights tL_businessBotRights) {
            TL_businessBotRights tL_businessBotRights2 = new TL_businessBotRights();
            tL_businessBotRights2.reply = tL_businessBotRights.reply;
            tL_businessBotRights2.read_messages = tL_businessBotRights.read_messages;
            tL_businessBotRights2.delete_sent_messages = tL_businessBotRights.delete_sent_messages;
            tL_businessBotRights2.delete_received_messages = tL_businessBotRights.delete_received_messages;
            tL_businessBotRights2.edit_name = tL_businessBotRights.edit_name;
            tL_businessBotRights2.edit_bio = tL_businessBotRights.edit_bio;
            tL_businessBotRights2.edit_profile_photo = tL_businessBotRights.edit_profile_photo;
            tL_businessBotRights2.edit_username = tL_businessBotRights.edit_username;
            tL_businessBotRights2.view_gifts = tL_businessBotRights.view_gifts;
            tL_businessBotRights2.sell_gifts = tL_businessBotRights.sell_gifts;
            tL_businessBotRights2.change_gift_settings = tL_businessBotRights.change_gift_settings;
            tL_businessBotRights2.transfer_and_upgrade_gifts = tL_businessBotRights.transfer_and_upgrade_gifts;
            tL_businessBotRights2.transfer_stars = tL_businessBotRights.transfer_stars;
            tL_businessBotRights2.manage_stories = tL_businessBotRights.manage_stories;
            return tL_businessBotRights2;
        }

        public static TL_businessBotRights makeDefault() {
            TL_businessBotRights tL_businessBotRights = new TL_businessBotRights();
            tL_businessBotRights.reply = true;
            tL_businessBotRights.read_messages = true;
            tL_businessBotRights.delete_sent_messages = true;
            tL_businessBotRights.delete_received_messages = true;
            tL_businessBotRights.edit_name = false;
            tL_businessBotRights.edit_bio = false;
            tL_businessBotRights.edit_profile_photo = false;
            tL_businessBotRights.edit_username = false;
            tL_businessBotRights.view_gifts = false;
            tL_businessBotRights.sell_gifts = false;
            tL_businessBotRights.change_gift_settings = false;
            tL_businessBotRights.transfer_and_upgrade_gifts = false;
            tL_businessBotRights.transfer_stars = false;
            tL_businessBotRights.manage_stories = false;
            return tL_businessBotRights;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof TL_businessBotRights)) {
                return false;
            }
            TL_businessBotRights tL_businessBotRights = (TL_businessBotRights) obj;
            return this.reply == tL_businessBotRights.reply && this.read_messages == tL_businessBotRights.read_messages && this.delete_sent_messages == tL_businessBotRights.delete_sent_messages && this.delete_received_messages == tL_businessBotRights.delete_received_messages && this.edit_name == tL_businessBotRights.edit_name && this.edit_bio == tL_businessBotRights.edit_bio && this.edit_profile_photo == tL_businessBotRights.edit_profile_photo && this.edit_username == tL_businessBotRights.edit_username && this.view_gifts == tL_businessBotRights.view_gifts && this.sell_gifts == tL_businessBotRights.sell_gifts && this.change_gift_settings == tL_businessBotRights.change_gift_settings && this.transfer_and_upgrade_gifts == tL_businessBotRights.transfer_and_upgrade_gifts && this.transfer_stars == tL_businessBotRights.transfer_stars && this.manage_stories == tL_businessBotRights.manage_stories;
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.reply = TLObject.hasFlag(readInt32, 1);
            this.read_messages = TLObject.hasFlag(this.flags, 2);
            this.delete_sent_messages = TLObject.hasFlag(this.flags, 4);
            this.delete_received_messages = TLObject.hasFlag(this.flags, 8);
            this.edit_name = TLObject.hasFlag(this.flags, 16);
            this.edit_bio = TLObject.hasFlag(this.flags, 32);
            this.edit_profile_photo = TLObject.hasFlag(this.flags, 64);
            this.edit_username = TLObject.hasFlag(this.flags, 128);
            this.view_gifts = TLObject.hasFlag(this.flags, 256);
            this.sell_gifts = TLObject.hasFlag(this.flags, 512);
            this.change_gift_settings = TLObject.hasFlag(this.flags, 1024);
            this.transfer_and_upgrade_gifts = TLObject.hasFlag(this.flags, 2048);
            this.transfer_stars = TLObject.hasFlag(this.flags, 4096);
            this.manage_stories = TLObject.hasFlag(this.flags, 8192);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.reply);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.read_messages);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.delete_sent_messages);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.delete_received_messages);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16, this.edit_name);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 32, this.edit_bio);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 64, this.edit_profile_photo);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 128, this.edit_username);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 256, this.view_gifts);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 512, this.sell_gifts);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 1024, this.change_gift_settings);
            this.flags = flag11;
            int flag12 = TLObject.setFlag(flag11, 2048, this.transfer_and_upgrade_gifts);
            this.flags = flag12;
            int flag13 = TLObject.setFlag(flag12, 4096, this.transfer_stars);
            this.flags = flag13;
            int flag14 = TLObject.setFlag(flag13, 8192, this.manage_stories);
            this.flags = flag14;
            outputSerializedData.writeInt32(flag14);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessChatLink extends TLObject {
        public static final int constructor = -1263638929;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public int flags;
        public String link;
        public String message;
        public String title;
        public int views;

        public static TL_businessChatLink TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_businessChatLink) TLObject.TLdeserialize(TL_businessChatLink.class, -1263638929 != i10 ? null : new TL_businessChatLink(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.link = inputSerializedData.readString(z10);
            this.message = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.title = inputSerializedData.readString(z10);
            }
            this.views = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.link);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.title);
            }
            outputSerializedData.writeInt32(this.views);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessGreetingMessage extends TLObject {
        public static final int constructor = -451302485;
        public int no_activity_days;
        public TL_businessRecipients recipients;
        public int shortcut_id;

        public static TL_businessGreetingMessage TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_businessGreetingMessage) TLObject.TLdeserialize(TL_businessGreetingMessage.class, i10 != -451302485 ? null : new TL_businessGreetingMessage(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.shortcut_id = inputSerializedData.readInt32(z10);
            this.recipients = TL_businessRecipients.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.no_activity_days = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.shortcut_id);
            this.recipients.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.no_activity_days);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessIntro extends TLObject {
        public static final int constructor = 1510606445;
        public String description;
        public int flags;
        public TLRPC.Document sticker;
        public String title;

        public static TL_businessIntro TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_businessIntro) TLObject.TLdeserialize(TL_businessIntro.class, i10 != 1510606445 ? null : new TL_businessIntro(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.title = inputSerializedData.readString(z10);
            this.description = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.description);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.sticker.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessRecipients extends TLObject {
        public static final int constructor = 554733559;
        public boolean contacts;
        public boolean exclude_selected;
        public boolean existing_chats;
        public int flags;
        public boolean new_chats;
        public boolean non_contacts;
        public ArrayList<Long> users = new ArrayList<>();

        public static TL_businessRecipients TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_businessRecipients) TLObject.TLdeserialize(TL_businessRecipients.class, i10 != 554733559 ? null : new TL_businessRecipients(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.existing_chats = TLObject.hasFlag(readInt32, 1);
            this.new_chats = TLObject.hasFlag(this.flags, 2);
            this.contacts = TLObject.hasFlag(this.flags, 4);
            this.non_contacts = TLObject.hasFlag(this.flags, 8);
            this.exclude_selected = TLObject.hasFlag(this.flags, 32);
            if (TLObject.hasFlag(this.flags, 16)) {
                this.users = Vector.deserializeLong(inputSerializedData, z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.existing_chats);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.new_chats);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.contacts);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.non_contacts);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 32, this.exclude_selected);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serializeLong(outputSerializedData, this.users);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessWeeklyOpen extends TLObject {
        public static final int constructor = 302717625;
        public int end_minute;
        public int start_minute;

        public static TL_businessWeeklyOpen TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_businessWeeklyOpen) TLObject.TLdeserialize(TL_businessWeeklyOpen.class, i10 != 302717625 ? null : new TL_businessWeeklyOpen(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.start_minute = inputSerializedData.readInt32(z10);
            this.end_minute = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.start_minute);
            outputSerializedData.writeInt32(this.end_minute);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_businessWorkHours extends TLObject {
        public static final int constructor = -1936543592;
        public int flags;
        public boolean open_now;
        public String timezone_id;
        public ArrayList<TL_businessWeeklyOpen> weekly_open = new ArrayList<>();

        public static TL_businessWorkHours TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_businessWorkHours) TLObject.TLdeserialize(TL_businessWorkHours.class, i10 != -1936543592 ? null : new TL_businessWorkHours(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.open_now = TLObject.hasFlag(readInt32, 1);
            this.timezone_id = inputSerializedData.readString(z10);
            this.weekly_open = Vector.deserialize(inputSerializedData, new c(2), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.open_now);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.timezone_id);
            Vector.serialize(outputSerializedData, this.weekly_open);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_connectedBot extends TLObject {
        public static final int constructor = 54448129;
        public long bot_id;
        public int date;
        public String device;
        public int flags;
        public String location;
        public TL_businessBotRecipients recipients;
        public TL_businessBotRights rights;

        public static TL_connectedBot TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_connectedBot) TLObject.TLdeserialize(TL_connectedBot.class, i10 != 54448129 ? null : new TL_connectedBot(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.bot_id = inputSerializedData.readInt64(z10);
            this.recipients = TL_businessBotRecipients.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.rights = TL_businessBotRights.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.device = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.location = inputSerializedData.readString(z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.bot_id);
            this.recipients.serializeToStream(outputSerializedData);
            this.rights.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.device);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.date);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.location);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_contactBirthday extends TLObject {
        public static final int constructor = 496600883;
        public TL_birthday birthday;
        public long contact_id;

        public static TL_contactBirthday TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_contactBirthday) TLObject.TLdeserialize(TL_contactBirthday.class, i10 != 496600883 ? null : new TL_contactBirthday(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.contact_id = inputSerializedData.readInt64(z10);
            this.birthday = TL_birthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.contact_id);
            this.birthday.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_emailVerified extends EmailVerified {
        public static final int constructor = 731303195;
        public String email;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.email = inputSerializedData.readString(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.email);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_emailVerifiedLogin extends EmailVerified {
        public static final int constructor = -507835039;
        public String email;
        public TLRPC.auth_SentCode sent_code;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.email = inputSerializedData.readString(z10);
            this.sent_code = TLRPC.auth_SentCode.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.email);
            this.sent_code.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_emojiStatuses extends EmojiStatuses {
        public static final int constructor = -1866176559;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.hash = inputSerializedData.readInt64(z10);
            this.statuses = Vector.deserialize(inputSerializedData, new c(3), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.statuses);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_emojiStatusesNotModified extends EmojiStatuses {
        public static final int constructor = -796072379;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_inputBusinessAwayMessage extends TLObject {
        public static final int constructor = -2094959136;
        public int flags;
        public boolean offline_only;
        public TL_inputBusinessRecipients recipients;
        public BusinessAwayMessageSchedule schedule;
        public int shortcut_id;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.offline_only = TLObject.hasFlag(readInt32, 1);
            this.shortcut_id = inputSerializedData.readInt32(z10);
            this.schedule = BusinessAwayMessageSchedule.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.recipients = TL_inputBusinessRecipients.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int i10 = this.offline_only ? this.flags | 1 : this.flags & 1;
            this.flags = i10;
            outputSerializedData.writeInt32(i10);
            outputSerializedData.writeInt32(this.shortcut_id);
            this.schedule.serializeToStream(outputSerializedData);
            this.recipients.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_inputBusinessBotRecipients extends TLObject {
        public static final int constructor = -991587810;
        public boolean contacts;
        public boolean exclude_selected;
        public boolean existing_chats;
        public int flags;
        public boolean new_chats;
        public boolean non_contacts;
        public ArrayList<TLRPC.InputUser> users = new ArrayList<>();
        public ArrayList<TLRPC.InputUser> exclude_users = new ArrayList<>();

        public static TL_inputBusinessBotRecipients TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_inputBusinessBotRecipients) TLObject.TLdeserialize(TL_inputBusinessBotRecipients.class, i10 != -991587810 ? null : new TL_inputBusinessBotRecipients(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.existing_chats = TLObject.hasFlag(readInt32, 1);
            this.new_chats = TLObject.hasFlag(this.flags, 2);
            this.contacts = TLObject.hasFlag(this.flags, 4);
            this.non_contacts = TLObject.hasFlag(this.flags, 8);
            this.exclude_selected = TLObject.hasFlag(this.flags, 32);
            if (TLObject.hasFlag(this.flags, 16)) {
                this.users = Vector.deserialize(inputSerializedData, new o(11), z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.exclude_users = Vector.deserialize(inputSerializedData, new o(11), z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.existing_chats);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.new_chats);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.contacts);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.non_contacts);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 32, this.exclude_selected);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serialize(outputSerializedData, this.users);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                Vector.serialize(outputSerializedData, this.exclude_users);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_inputBusinessChatLink extends TLObject {
        public static final int constructor = 292003751;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public int flags;
        public String message;
        public String title;

        public static TL_inputBusinessChatLink TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_inputBusinessChatLink) TLObject.TLdeserialize(TL_inputBusinessChatLink.class, 292003751 != i10 ? null : new TL_inputBusinessChatLink(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.message = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.title = inputSerializedData.readString(z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.title);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_inputBusinessGreetingMessage extends TLObject {
        public static final int constructor = 26528571;
        public int no_activity_days;
        public TL_inputBusinessRecipients recipients;
        public int shortcut_id;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.shortcut_id = inputSerializedData.readInt32(z10);
            this.recipients = TL_inputBusinessRecipients.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.no_activity_days = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.shortcut_id);
            this.recipients.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.no_activity_days);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_inputBusinessIntro extends TLObject {
        public static final int constructor = 163867085;
        public String description;
        public int flags;
        public TLRPC.InputDocument sticker;
        public String title;

        public static TL_inputBusinessIntro TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_inputBusinessIntro) TLObject.TLdeserialize(TL_inputBusinessIntro.class, i10 != 163867085 ? null : new TL_inputBusinessIntro(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.title = inputSerializedData.readString(z10);
            this.description = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.sticker = TLRPC.InputDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.description);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.sticker.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_inputBusinessRecipients extends TLObject {
        public static final int constructor = 1871393450;
        public boolean contacts;
        public boolean exclude_selected;
        public boolean existing_chats;
        public int flags;
        public boolean new_chats;
        public boolean non_contacts;
        public ArrayList<TLRPC.InputUser> users = new ArrayList<>();

        public static TL_inputBusinessRecipients TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_inputBusinessRecipients) TLObject.TLdeserialize(TL_inputBusinessRecipients.class, i10 != 1871393450 ? null : new TL_inputBusinessRecipients(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.existing_chats = TLObject.hasFlag(readInt32, 1);
            this.new_chats = TLObject.hasFlag(this.flags, 2);
            this.contacts = TLObject.hasFlag(this.flags, 4);
            this.non_contacts = TLObject.hasFlag(this.flags, 8);
            this.exclude_selected = TLObject.hasFlag(this.flags, 32);
            if (TLObject.hasFlag(this.flags, 16)) {
                this.users = Vector.deserialize(inputSerializedData, new o(11), z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.existing_chats);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.new_chats);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.contacts);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.non_contacts);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 32, this.exclude_selected);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serialize(outputSerializedData, this.users);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_password extends Password {
        public static final int constructor = -1787080453;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.has_recovery = TLObject.hasFlag(readInt32, 1);
            this.has_secure_values = TLObject.hasFlag(this.flags, 2);
            this.has_password = TLObject.hasFlag(this.flags, 4);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.current_algo = TLRPC.PasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.srp_B = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.srp_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.hint = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.email_unconfirmed_pattern = inputSerializedData.readString(z10);
            }
            this.new_algo = TLRPC.PasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.new_secure_algo = TLRPC.SecurePasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.secure_random = inputSerializedData.readByteArray(z10);
            if (TLObject.hasFlag(this.flags, 32)) {
                this.pending_reset_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.login_email_pattern = inputSerializedData.readString(z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.has_recovery);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.has_secure_values);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.has_password);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.current_algo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeByteArray(this.srp_B);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt64(this.srp_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.hint);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeString(this.email_unconfirmed_pattern);
            }
            this.new_algo.serializeToStream(outputSerializedData);
            this.new_secure_algo.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.secure_random);
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.pending_reset_date);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeString(this.login_email_pattern);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_password_layer144 extends Password {
        public static final int constructor = 408623183;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.has_recovery = TLObject.hasFlag(readInt32, 1);
            this.has_secure_values = TLObject.hasFlag(this.flags, 2);
            this.has_password = TLObject.hasFlag(this.flags, 4);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.current_algo = TLRPC.PasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.srp_B = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.srp_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.hint = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.email_unconfirmed_pattern = inputSerializedData.readString(z10);
            }
            this.new_algo = TLRPC.PasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.new_secure_algo = TLRPC.SecurePasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.secure_random = inputSerializedData.readByteArray(z10);
            if (TLObject.hasFlag(this.flags, 32)) {
                this.pending_reset_date = inputSerializedData.readInt32(z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.has_recovery);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.has_secure_values);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.has_password);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.current_algo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeByteArray(this.srp_B);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt64(this.srp_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.hint);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeString(this.email_unconfirmed_pattern);
            }
            this.new_algo.serializeToStream(outputSerializedData);
            this.new_secure_algo.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.secure_random);
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.pending_reset_date);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_reactionsNotifySettings extends TLObject {
        public static final int constructor = 1910827608;
        public int flags;
        public ReactionNotificationsFrom messages_notify_from;
        public ReactionNotificationsFrom poll_votes_notify_from;
        public boolean show_previews;
        public TLRPC.NotificationSound sound;
        public ReactionNotificationsFrom stories_notify_from;

        public static TL_reactionsNotifySettings TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_reactionsNotifySettings) TLObject.TLdeserialize(TL_reactionsNotifySettings.class, 1910827608 != i10 ? null : new TL_reactionsNotifySettings(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.messages_notify_from = ReactionNotificationsFrom.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.stories_notify_from = ReactionNotificationsFrom.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.poll_votes_notify_from = ReactionNotificationsFrom.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.sound = TLRPC.NotificationSound.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.show_previews = inputSerializedData.readBool(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.messages_notify_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.stories_notify_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.poll_votes_notify_from.serializeToStream(outputSerializedData);
            }
            this.sound.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.show_previews);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_savedMusicIds extends SavedMusicIds {
        public static final int constructor = -1718786506;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.ids = Vector.deserializeLong(inputSerializedData, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serializeLong(outputSerializedData, this.ids);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_savedMusicIdsNotModified extends SavedMusicIds {
        public static final int constructor = 1338514798;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_savedRingtone extends SavedRingtone {
        public static final int constructor = -1222230163;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_savedRingtoneConverted extends SavedRingtone {
        public static final int constructor = 523271863;
        public TLRPC.Document document;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.document.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_savedRingtones extends SavedRingtones {
        public static final int constructor = -1041683259;
        public long hash;
        public ArrayList<TLRPC.Document> ringtones = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.hash = inputSerializedData.readInt64(z10);
            this.ringtones = Vector.deserialize(inputSerializedData, new o(5), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.ringtones);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_savedRingtonesNotModified extends SavedRingtones {
        public static final int constructor = -67704655;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_themes extends Themes {
        public static final int constructor = -1707242387;
        public long hash;
        public ArrayList<TLRPC.TL_theme> themes = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.hash = inputSerializedData.readInt64(z10);
            this.themes = Vector.deserialize(inputSerializedData, new c(4), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.themes);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_themesNotModified extends Themes {
        public static final int constructor = -199313886;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_wallPapers extends WallPapers {
        public static final int constructor = -842824308;
        public long hash;
        public ArrayList<TLRPC.WallPaper> wallpapers = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.hash = inputSerializedData.readInt64(z10);
            this.wallpapers = Vector.deserialize(inputSerializedData, new c(5), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.wallpapers);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_wallPapersNotModified extends WallPapers {
        public static final int constructor = 471437699;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_webBrowserSettings extends WebBrowserSettings {
        public static final int constructor = 2045480115;
        public boolean display_close_button;
        public int flags;
        public long hash;
        public boolean open_external_browser;
        public ArrayList<WebDomainException> external_exceptions = new ArrayList<>();
        public ArrayList<WebDomainException> inapp_exceptions = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.open_external_browser = TLObject.hasFlag(readInt32, 1);
            this.display_close_button = TLObject.hasFlag(this.flags, 2);
            int i10 = 6;
            this.external_exceptions = Vector.deserialize(inputSerializedData, new c(i10), z10);
            this.inapp_exceptions = Vector.deserialize(inputSerializedData, new c(i10), z10);
            this.hash = inputSerializedData.readInt64(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.open_external_browser);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.display_close_button);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            Vector.serialize(outputSerializedData, this.external_exceptions);
            Vector.serialize(outputSerializedData, this.inapp_exceptions);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class Themes extends TLObject {
        public static Themes TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (Themes) TLObject.TLdeserialize(Themes.class, i10 != -1707242387 ? i10 != -199313886 ? null : new TL_themesNotModified() : new TL_themes(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class Tl_chatThemes extends ChatThemes {
        public static final int constructor = -1106673293;
        public ArrayList<TLRPC.Chat> chats;
        public int flags;
        public long hash;
        public String next_offset;
        public ArrayList<TLRPC.ChatTheme> themes;
        public ArrayList<TLRPC.User> users;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.hash = inputSerializedData.readInt64(z10);
            this.themes = Vector.deserialize(inputSerializedData, new c(7), z10);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.themes);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class Tl_getUniqueGiftChatThemes extends TLMethod<ChatThemes> {
        public static final int constructor = -466818615;
        public long hash;
        public int limit;
        public String offset;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override // org.telegram.tgnet.TLMethod
        public ChatThemes deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return ChatThemes.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class WallPapers extends TLObject {
        public static WallPapers TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (WallPapers) TLObject.TLdeserialize(WallPapers.class, i10 != -842824308 ? i10 != 471437699 ? null : new TL_wallPapersNotModified() : new TL_wallPapers(), inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static abstract class WebBrowserSettings extends TLObject {
        public static WebBrowserSettings TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (WebBrowserSettings) TLObject.TLdeserialize(WebBrowserSettings.class, fromConstructor(i10), inputSerializedData, i10, z10);
        }

        private static WebBrowserSettings fromConstructor(int i10) {
            if (i10 == -1021538482) {
                return new TL_webBrowserSettingsNotModified();
            }
            if (i10 != 2045480115) {
                return null;
            }
            return new TL_webBrowserSettings();
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class WebDomainException extends TLObject {
        public static final int constructor = -1824741993;
        public String domain;
        public long favicon;
        public int flags;
        public String title;
        public String url;

        public static WebDomainException TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (WebDomainException) TLObject.TLdeserialize(WebDomainException.class, i10 != -1824741993 ? null : new WebDomainException(), inputSerializedData, i10, z10);
        }

        public static boolean equalsByDomain(WebDomainException webDomainException, WebDomainException webDomainException2) {
            if (webDomainException == webDomainException2) {
                return true;
            }
            if (webDomainException == null || webDomainException2 == null) {
                return false;
            }
            return TextUtils.equals(webDomainException.domain.toLowerCase(), webDomainException2.domain.toLowerCase());
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.domain = inputSerializedData.readString(z10);
            this.url = inputSerializedData.readString(z10);
            this.title = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.favicon = inputSerializedData.readInt64(z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.domain);
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.favicon);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class acceptAuthorization extends TLObject {
        public static final int constructor = -202552205;
        public long bot_id;
        public TLRPC.TL_secureCredentialsEncrypted credentials;
        public String public_key;
        public String scope;
        public ArrayList<TLRPC.TL_secureValueHash> value_hashes = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.bot_id);
            outputSerializedData.writeString(this.scope);
            outputSerializedData.writeString(this.public_key);
            Vector.serialize(outputSerializedData, this.value_hashes);
            this.credentials.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class authorizationForm extends TLObject {
        public static final int constructor = -1389486888;
        public int flags;
        public String privacy_policy_url;
        public ArrayList<TLRPC.SecureRequiredType> required_types = new ArrayList<>();
        public ArrayList<TLRPC.TL_secureValue> values = new ArrayList<>();
        public ArrayList<TLRPC.SecureValueError> errors = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static authorizationForm TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (authorizationForm) TLObject.TLdeserialize(authorizationForm.class, -1389486888 != i10 ? null : new authorizationForm(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            int i10 = 8;
            this.required_types = Vector.deserialize(inputSerializedData, new r(i10), z10);
            this.values = Vector.deserialize(inputSerializedData, new c(i10), z10);
            this.errors = Vector.deserialize(inputSerializedData, new c(9), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.privacy_policy_url = inputSerializedData.readString(z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            Vector.serialize(outputSerializedData, this.required_types);
            Vector.serialize(outputSerializedData, this.values);
            Vector.serialize(outputSerializedData, this.errors);
            Vector.serialize(outputSerializedData, this.users);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.privacy_policy_url);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class authorizations extends TLObject {
        public static final int constructor = 1275039392;
        public int authorization_ttl_days;
        public ArrayList<TLRPC.TL_authorization> authorizations = new ArrayList<>();

        public static authorizations TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (authorizations) TLObject.TLdeserialize(authorizations.class, 1275039392 != i10 ? null : new authorizations(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.authorization_ttl_days = inputSerializedData.readInt32(z10);
            this.authorizations = Vector.deserialize(inputSerializedData, new c(10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.authorization_ttl_days);
            Vector.serialize(outputSerializedData, this.authorizations);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class autoDownloadSettings extends TLObject {
        public static final int constructor = 1674235686;
        public TLRPC.TL_autoDownloadSettings high;
        public TLRPC.TL_autoDownloadSettings low;
        public TLRPC.TL_autoDownloadSettings medium;

        public static autoDownloadSettings TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (autoDownloadSettings) TLObject.TLdeserialize(autoDownloadSettings.class, 1674235686 != i10 ? null : new autoDownloadSettings(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.low = TLRPC.TL_autoDownloadSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.medium = TLRPC.TL_autoDownloadSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.high = TLRPC.TL_autoDownloadSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.low.serializeToStream(outputSerializedData);
            this.medium.serializeToStream(outputSerializedData);
            this.high.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class businessChatLinks extends TLObject {
        public static final int constructor = -331111727;
        public ArrayList<TL_businessChatLink> links = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static businessChatLinks TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (businessChatLinks) TLObject.TLdeserialize(businessChatLinks.class, -331111727 != i10 ? null : new businessChatLinks(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.links = Vector.deserialize(inputSerializedData, new c(11), z10);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.links);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class cancelPasswordEmail extends TLObject {
        public static final int constructor = -1043606090;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class changeAuthorizationSettings extends TLObject {
        public static final int constructor = 1089766498;
        public boolean call_requests_disabled;
        public boolean confirmed;
        public boolean encrypted_requests_disabled;
        public int flags;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 8, this.confirmed);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.hash);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.encrypted_requests_disabled);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeBool(this.call_requests_disabled);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class changePhone extends TLObject {
        public static final int constructor = 1891839707;
        public String phone_code;
        public String phone_code_hash;
        public String phone_number;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.User.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.phone_number);
            outputSerializedData.writeString(this.phone_code_hash);
            outputSerializedData.writeString(this.phone_code);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class checkUsername extends TLObject {
        public static final int constructor = 655677548;
        public String username;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.username);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class clearRecentEmojiStatuses extends TLObject {
        public static final int constructor = 404757166;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class confirmBotConnection extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 1743593320;
        public TLRPC.InputUser bot_id;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            this.bot_id.serializeToStream(outputSerializedData);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class confirmPasswordEmail extends TLObject {
        public static final int constructor = -1881204448;
        public String code;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.code);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class confirmPhone extends TLObject {
        public static final int constructor = 1596029123;
        public String phone_code;
        public String phone_code_hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.phone_code_hash);
            outputSerializedData.writeString(this.phone_code);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class connectedBots extends TLObject {
        public static final int constructor = 400029819;
        public ArrayList<TL_connectedBot> connected_bots = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static connectedBots TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (connectedBots) TLObject.TLdeserialize(connectedBots.class, i10 != 400029819 ? null : new connectedBots(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.connected_bots = Vector.deserialize(inputSerializedData, new c(12), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.connected_bots);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class contactBirthdays extends TLObject {
        public static final int constructor = 290452237;
        public ArrayList<TL_contactBirthday> contacts = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static contactBirthdays TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (contactBirthdays) TLObject.TLdeserialize(contactBirthdays.class, i10 != 290452237 ? null : new contactBirthdays(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.contacts = Vector.deserialize(inputSerializedData, new c(13), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(290452237);
            Vector.serialize(outputSerializedData, this.contacts);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class contentSettings extends TLObject {
        public static final int constructor = 1474462241;
        public int flags;
        public boolean sensitive_can_change;
        public boolean sensitive_enabled;

        public static contentSettings TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (contentSettings) TLObject.TLdeserialize(contentSettings.class, 1474462241 != i10 ? null : new contentSettings(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.sensitive_enabled = TLObject.hasFlag(readInt32, 1);
            this.sensitive_can_change = TLObject.hasFlag(this.flags, 2);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.sensitive_enabled);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.sensitive_can_change);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class createBusinessChatLink extends TLObject {
        public static final int constructor = -2007898482;
        public TL_inputBusinessChatLink link;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_businessChatLink.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.link.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class createTheme extends TLObject {
        public static final int constructor = -2077048289;
        public TLRPC.InputDocument document;
        public int flags;
        public TLRPC.TL_inputThemeSettings settings;
        public String slug;
        public String title;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Theme.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.document.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.settings.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class declinePasswordReset extends TLObject {
        public static final int constructor = 1284770294;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class deleteAccount extends TLObject {
        public static final int constructor = 1099779595;
        public String reason;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.reason);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class deleteBusinessChatLink extends TLObject {
        public static final int constructor = 1611085428;
        public String slug;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.slug);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class deletePasskey extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -172665281;
        public String id;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.id);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class deleteSecureValue extends TLObject {
        public static final int constructor = -1199522741;
        public ArrayList<TLRPC.SecureValueType> types = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.types);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class deleteWebBrowserSettingsExceptions extends TLMethod<WebBrowserSettings> {
        public static final int constructor = -2036304291;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLMethod
        public WebBrowserSettings deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return WebBrowserSettings.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class disablePeerConnectedBot extends TLObject {
        public static final int constructor = 1581481689;
        public TLRPC.InputPeer peer;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class editBusinessChatLink extends TLObject {
        public static final int constructor = -1942744913;
        public TL_inputBusinessChatLink link;
        public String slug;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_businessChatLink.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.slug);
            this.link.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class finishPasskeyLogin extends TLMethod<TLRPC.auth_Authorization> {
        public static final int constructor = -1739084537;
        public inputPasskeyCredentialPublicKey credential;
        public int flags;
        public long from_auth_key_id;
        public int from_dc_id;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            this.credential.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.from_dc_id);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.from_auth_key_id);
            }
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.auth_Authorization deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.auth_Authorization.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getAccountTTL extends TLObject {
        public static final int constructor = 150761757;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.TL_accountDaysTTL.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getAllSecureValues extends TLObject {
        public static final int constructor = -1299661699;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new c(8));
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getAuthorizationForm extends TLObject {
        public static final int constructor = -1456907910;
        public long bot_id;
        public String public_key;
        public String scope;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return authorizationForm.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.bot_id);
            outputSerializedData.writeString(this.scope);
            outputSerializedData.writeString(this.public_key);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getAuthorizations extends TLObject {
        public static final int constructor = -484392616;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return authorizations.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getAutoDownloadSettings extends TLObject {
        public static final int constructor = 1457130303;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return autoDownloadSettings.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getBirthdays extends TLObject {
        public static final int constructor = -621959068;
        public TL_birthday birthday;
        public int flags;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return contactBirthdays.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getBusinessChatLinks extends TLObject {
        public static final int constructor = 1869667809;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return businessChatLinks.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getChannelDefaultEmojiStatuses extends TLObject {
        public static final int constructor = 1999087573;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return EmojiStatuses.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getChannelRestrictedStatusEmojis extends TLObject {
        public static final int constructor = 900325589;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.EmojiList.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getChatThemes extends TLMethod<Themes> {
        public static final int constructor = -700916087;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override // org.telegram.tgnet.TLMethod
        public Themes deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Themes.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getConnectedBots extends TLObject {
        public static final int constructor = 1319421967;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return connectedBots.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getContactSignUpNotification extends TLObject {
        public static final int constructor = -1626880216;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getContentSettings extends TLObject {
        public static final int constructor = -1952756306;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return contentSettings.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getDefaultBackgroundEmojis extends TLObject {
        public static final int constructor = -1509246514;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.EmojiList.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getDefaultEmojiStatuses extends TLObject {
        public static final int constructor = -696962170;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return EmojiStatuses.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getDefaultGroupPhotoEmojis extends TLObject {
        public static final int constructor = -1856479058;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.EmojiList.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getDefaultProfilePhotoEmojis extends TLObject {
        public static final int constructor = -495647960;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.EmojiList.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getGlobalPrivacySettings extends TLObject {
        public static final int constructor = -349483786;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.GlobalPrivacySettings.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getMultiWallPapers extends TLObject {
        public static final int constructor = 1705865692;
        public ArrayList<TLRPC.InputWallPaper> wallpapers = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new c(5));
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.wallpapers);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getNotifyExceptions extends TLObject {
        public static final int constructor = 1398240377;
        public boolean compare_sound;
        public int flags;
        public TLRPC.InputNotifyPeer peer;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 2, this.compare_sound);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.peer.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getNotifySettings extends TLObject {
        public static final int constructor = 313765169;
        public TLRPC.InputNotifyPeer peer;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.PeerNotifySettings.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getPaidMessagesRevenue extends TLObject {
        public static final int constructor = 431639143;
        public int flags;
        public TLRPC.InputPeer parent_peer;
        public TLRPC.InputUser user_id;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return paidMessagesRevenue.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.parent_peer != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.parent_peer.serializeToStream(outputSerializedData);
            }
            this.user_id.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getPasskeys extends TLMethod<Passkeys> {
        public static final int constructor = -367063982;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLMethod
        public Passkeys deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Passkeys.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getPassword extends TLObject {
        public static final int constructor = 1418342645;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Password.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getPasswordSettings extends TLObject {
        public static final int constructor = -1663767815;
        public TLRPC.InputCheckPasswordSRP password;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return passwordSettings.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.password.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getPrivacy extends TLObject {
        public static final int constructor = -623130288;
        public TLRPC.InputPrivacyKey key;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return privacyRules.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.key.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getReactionsNotifySettings extends TLObject {
        public static final int constructor = 115172684;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_reactionsNotifySettings.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getRecentEmojiStatuses extends TLObject {
        public static final int constructor = 257392901;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return EmojiStatuses.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getRequirementsToContact extends TLObject {
        public static final int constructor = -660962397;
        public ArrayList<TLRPC.InputUser> id = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new c(14));
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.id = Vector.deserialize(inputSerializedData, new o(11), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.id);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getSavedMusicByID extends TLObject {
        public static final int constructor = 1970513129;
        public ArrayList<TLRPC.InputDocument> documents = new ArrayList<>();
        public TLRPC.InputUser id;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.SavedMusic.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.id.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.documents);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getSavedMusicIds extends TLObject {
        public static final int constructor = -526557265;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return SavedMusicIds.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getSavedRingtones extends TLObject {
        public static final int constructor = -510647672;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return SavedRingtones.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getSecureValue extends TLObject {
        public static final int constructor = 1936088002;
        public ArrayList<TLRPC.SecureValueType> types = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new c(8));
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.types);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getTheme extends TLObject {
        public static final int constructor = -1919060949;
        public long document_id;
        public String format;
        public TLRPC.InputTheme theme;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Theme.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.format);
            this.theme.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.document_id);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getThemes extends TLObject {
        public static final int constructor = 1913054296;
        public String format;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Themes.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.format);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getTmpPassword extends TLObject {
        public static final int constructor = 1151208273;
        public TLRPC.InputCheckPasswordSRP password;
        public int period;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return tmpPassword.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.password.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.period);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getWallPaper extends TLObject {
        public static final int constructor = -57811990;
        public TLRPC.InputWallPaper wallpaper;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.WallPaper.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.wallpaper.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getWallPapers extends TLObject {
        public static final int constructor = 127302966;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return WallPapers.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getWebAuthorizations extends TLObject {
        public static final int constructor = 405695855;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return webAuthorizations.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getWebBrowserSettings extends TLMethod<WebBrowserSettings> {
        public static final int constructor = 1449482088;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override // org.telegram.tgnet.TLMethod
        public WebBrowserSettings deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return WebBrowserSettings.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class getWebPagePreview extends TLMethod<webPagePreview> {
        public static final int constructor = 1460498287;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public int flags;
        public String message;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 8)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
        }

        @Override // org.telegram.tgnet.TLMethod
        public webPagePreview deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return webPagePreview.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class initPasskeyLogin extends TLMethod<passkeyLoginOptions> {
        public static final int constructor = 1368051895;
        public String api_hash;
        public int api_id;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.api_id);
            outputSerializedData.writeString(this.api_hash);
        }

        @Override // org.telegram.tgnet.TLMethod
        public passkeyLoginOptions deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return passkeyLoginOptions.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class initPasskeyRegistration extends TLMethod<passkeyRegistrationOptions> {
        public static final int constructor = 1117079528;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLMethod
        public passkeyRegistrationOptions deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return passkeyRegistrationOptions.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class inputPasskeyCredentialPublicKey extends TLObject {
        public static final int constructor = 1009235855;
        public String id;
        public String raw_id;
        public InputPasskeyResponse response;

        public static inputPasskeyCredentialPublicKey TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (inputPasskeyCredentialPublicKey) TLObject.TLdeserialize(inputPasskeyCredentialPublicKey.class, i10 != 1009235855 ? null : new inputPasskeyCredentialPublicKey(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.id = inputSerializedData.readString(z10);
            this.raw_id = inputSerializedData.readString(z10);
            this.response = InputPasskeyResponse.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeString(this.raw_id);
            this.response.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class inputPasskeyResponseLogin extends InputPasskeyResponse {
        public static final int constructor = -1021329078;
        public byte[] authenticator_data;
        public TLRPC.TL_dataJSON client_data;
        public byte[] signature;
        public String user_handle;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.client_data = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.authenticator_data = inputSerializedData.readByteArray(z10);
            this.signature = inputSerializedData.readByteArray(z10);
            this.user_handle = inputSerializedData.readString(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.client_data.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.authenticator_data);
            outputSerializedData.writeByteArray(this.signature);
            outputSerializedData.writeString(this.user_handle);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class inputPasskeyResponseRegister extends InputPasskeyResponse {
        public static final int constructor = 1046713180;
        public byte[] attestation_object;
        public TLRPC.TL_dataJSON client_data;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.client_data = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.attestation_object = inputSerializedData.readByteArray(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.client_data.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.attestation_object);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class installTheme extends TLObject {
        public static final int constructor = 2061776695;
        public boolean dark;
        public int flags;
        public String format;
        public TLRPC.InputTheme theme;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.dark);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.format);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.theme.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class installWallPaper extends TLObject {
        public static final int constructor = -18000023;
        public TLRPC.TL_wallPaperSettings settings;
        public TLRPC.InputWallPaper wallpaper;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.wallpaper.serializeToStream(outputSerializedData);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class paidMessagesRevenue extends TLObject {
        public static final int constructor = 504403720;
        public long stars_amount;

        public static paidMessagesRevenue TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (paidMessagesRevenue) TLObject.TLdeserialize(paidMessagesRevenue.class, i10 != 504403720 ? null : new paidMessagesRevenue(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.stars_amount = inputSerializedData.readInt64(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.stars_amount);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class passkeyLoginOptions extends TLObject {
        public static final int constructor = -503089271;
        public TLRPC.TL_dataJSON options;

        public static passkeyLoginOptions TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (passkeyLoginOptions) TLObject.TLdeserialize(passkeyLoginOptions.class, i10 != -503089271 ? null : new passkeyLoginOptions(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.options = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.options.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class passkeyRegistrationOptions extends TLObject {
        public static final int constructor = -513057567;
        public TLRPC.TL_dataJSON options;

        public static passkeyRegistrationOptions TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (passkeyRegistrationOptions) TLObject.TLdeserialize(passkeyRegistrationOptions.class, i10 != -513057567 ? null : new passkeyRegistrationOptions(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.options = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.options.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class passwordInputSettings extends TLObject {
        public static final int constructor = -1036572727;
        public String email;
        public int flags;
        public String hint;
        public TLRPC.PasswordKdfAlgo new_algo;
        public byte[] new_password_hash;
        public TLRPC.TL_secureSecretSettings new_secure_settings;

        public static passwordInputSettings TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (passwordInputSettings) TLObject.TLdeserialize(passwordInputSettings.class, -1036572727 != i10 ? null : new passwordInputSettings(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.new_algo = TLRPC.PasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.new_password_hash = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.hint = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.email = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.new_secure_settings = TLRPC.TL_secureSecretSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.new_algo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeByteArray(this.new_password_hash);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.hint);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.email);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.new_secure_settings.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class passwordSettings extends TLObject {
        public static final int constructor = -1705233435;
        public String email;
        public int flags;
        public TLRPC.TL_secureSecretSettings secure_settings;

        public static passwordSettings TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (passwordSettings) TLObject.TLdeserialize(passwordSettings.class, -1705233435 != i10 ? null : new passwordSettings(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.email = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.secure_settings = TLRPC.TL_secureSecretSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.email);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.secure_settings.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class privacyRules extends TLObject {
        public static final int constructor = 1352683077;
        public ArrayList<TLRPC.PrivacyRule> rules = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static privacyRules TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (privacyRules) TLObject.TLdeserialize(privacyRules.class, 1352683077 != i10 ? null : new privacyRules(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.rules = Vector.deserialize(inputSerializedData, new c(15), z10);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.rules);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class registerDevice extends TLObject {
        public static final int constructor = -326762118;
        public boolean app_sandbox;
        public int flags;
        public boolean no_muted;
        public ArrayList<Long> other_uids = new ArrayList<>();
        public byte[] secret;
        public String token;
        public int token_type;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.no_muted);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt32(this.token_type);
            outputSerializedData.writeString(this.token);
            outputSerializedData.writeBool(this.app_sandbox);
            outputSerializedData.writeByteArray(this.secret);
            Vector.serializeLong(outputSerializedData, this.other_uids);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class registerPasskey extends TLMethod<Passkey> {
        public static final int constructor = 1437867990;
        public inputPasskeyCredentialPublicKey credential;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.credential.serializeToStream(outputSerializedData);
        }

        @Override // org.telegram.tgnet.TLMethod
        public Passkey deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Passkey.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class reorderUsernames extends TLObject {
        public static final int constructor = -279966037;
        public ArrayList<String> order = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serializeString(outputSerializedData, this.order);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class reportPeer extends TLObject {
        public static final int constructor = -977650298;
        public String message;
        public TLRPC.InputPeer peer;
        public TLRPC.ReportReason reason;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.peer.serializeToStream(outputSerializedData);
            this.reason.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.message);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class reportProfilePhoto extends TLObject {
        public static final int constructor = -91437323;
        public String message;
        public TLRPC.InputPeer peer;
        public TLRPC.InputPhoto photo_id;
        public TLRPC.ReportReason reason;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.peer.serializeToStream(outputSerializedData);
            this.photo_id.serializeToStream(outputSerializedData);
            this.reason.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.message);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class requirementToContactEmpty extends RequirementToContact {
        public static final int constructor = 84580409;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class requirementToContactPaidMessages extends RequirementToContact {
        public static final int constructor = -1258914157;
        public long stars_amount;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.stars_amount = inputSerializedData.readInt64(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.stars_amount);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class requirementToContactPremium extends RequirementToContact {
        public static final int constructor = -444472087;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resendPasswordEmail extends TLObject {
        public static final int constructor = 2055154197;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resetAuthorization extends TLObject {
        public static final int constructor = -545786948;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resetNotifySettings extends TLObject {
        public static final int constructor = -612493497;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resetPassword extends TLObject {
        public static final int constructor = -1828139493;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return ResetPasswordResult.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resetPasswordFailedWait extends ResetPasswordResult {
        public static final int constructor = -478701471;
        public int retry_date;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.retry_date = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.retry_date);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resetPasswordOk extends ResetPasswordResult {
        public static final int constructor = -383330754;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resetPasswordRequestedWait extends ResetPasswordResult {
        public static final int constructor = -370148227;
        public int until_date;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.until_date = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.until_date);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resetWallPapers extends TLObject {
        public static final int constructor = -1153722364;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resetWebAuthorization extends TLObject {
        public static final int constructor = 755087855;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resetWebAuthorizations extends TLObject {
        public static final int constructor = 1747789204;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resolveBusinessChatLink extends TLObject {
        public static final int constructor = 1418913262;
        public String slug;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return resolvedBusinessChatLinks.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.slug);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class resolvedBusinessChatLinks extends TLObject {
        public static final int constructor = -1708937439;
        public int flags;
        public String message;
        public TLRPC.Peer peer;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static resolvedBusinessChatLinks TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (resolvedBusinessChatLinks) TLObject.TLdeserialize(resolvedBusinessChatLinks.class, -1708937439 != i10 ? null : new resolvedBusinessChatLinks(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.message = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z10);
            }
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class saveAutoDownloadSettings extends TLObject {
        public static final int constructor = 1995661875;
        public int flags;
        public boolean high;
        public boolean low;
        public TLRPC.TL_autoDownloadSettings settings;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.low);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.high);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class saveRingtone extends TLObject {
        public static final int constructor = 1038768899;
        public TLRPC.InputDocument id;
        public boolean unsave;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return SavedRingtone.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.id.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.unsave);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class saveSecureValue extends TLObject {
        public static final int constructor = -1986010339;
        public long secure_secret_id;
        public TLRPC.TL_inputSecureValue value;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.TL_secureValue.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.value.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.secure_secret_id);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class saveTheme extends TLObject {
        public static final int constructor = -229175188;
        public TLRPC.InputTheme theme;
        public boolean unsave;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.theme.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.unsave);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class saveWallPaper extends TLObject {
        public static final int constructor = 1817860919;
        public TLRPC.TL_wallPaperSettings settings;
        public boolean unsave;
        public TLRPC.InputWallPaper wallpaper;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.wallpaper.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.unsave);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class sendChangePhoneCode extends TLObject {
        public static final int constructor = -2108208411;
        public String phone_number;
        public TLRPC.TL_codeSettings settings;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.auth_SentCode.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.phone_number);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class sendConfirmPhoneCode extends TLObject {
        public static final int constructor = 457157256;
        public String hash;
        public TLRPC.TL_codeSettings settings;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.auth_SentCode.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.hash);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class sendVerifyEmailCode extends TLObject {
        public static final int constructor = -1730136133;
        public String email;
        public TLRPC.EmailVerifyPurpose purpose;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return sentEmailCode.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.purpose.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.email);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class sendVerifyPhoneCode extends TLObject {
        public static final int constructor = -1516022023;
        public String phone_number;
        public TLRPC.TL_codeSettings settings;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.auth_SentCode.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.phone_number);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class sentEmailCode extends TLObject {
        public static final int constructor = -2128640689;
        public String email_pattern;
        public int length;

        public static sentEmailCode TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (sentEmailCode) TLObject.TLdeserialize(sentEmailCode.class, -2128640689 != i10 ? null : new sentEmailCode(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.email_pattern = inputSerializedData.readString(z10);
            this.length = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.email_pattern);
            outputSerializedData.writeInt32(this.length);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class setAccountTTL extends TLObject {
        public static final int constructor = 608323678;
        public TLRPC.TL_accountDaysTTL ttl;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.ttl.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class setAuthorizationTTL extends TLObject {
        public static final int constructor = -1081501024;
        public int authorization_ttl_days;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.authorization_ttl_days);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class setContactSignUpNotification extends TLObject {
        public static final int constructor = -806076575;
        public boolean silent;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeBool(this.silent);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class setContentSettings extends TLObject {
        public static final int constructor = -1250643605;
        public int flags;
        public boolean sensitive_enabled;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.sensitive_enabled);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class setGlobalPrivacySettings extends TLObject {
        public static final int constructor = 517647042;
        public TLRPC.GlobalPrivacySettings settings;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.GlobalPrivacySettings.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class setPrivacy extends TLObject {
        public static final int constructor = -906486552;
        public TLRPC.InputPrivacyKey key;
        public ArrayList<TLRPC.InputPrivacyRule> rules = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return privacyRules.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.key.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.rules);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class setReactionsNotifySettings extends TLObject {
        public static final int constructor = 829220168;
        public TL_reactionsNotifySettings settings;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_reactionsNotifySettings.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class tmpPassword extends TLObject {
        public static final int constructor = -614138572;
        public byte[] tmp_password;
        public int valid_until;

        public static tmpPassword TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (tmpPassword) TLObject.TLdeserialize(tmpPassword.class, -614138572 != i10 ? null : new tmpPassword(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.tmp_password = inputSerializedData.readByteArray(z10);
            this.valid_until = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeByteArray(this.tmp_password);
            outputSerializedData.writeInt32(this.valid_until);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class toggleConnectedBotPaused extends TLObject {
        public static final int constructor = 1684934807;
        public boolean paused;
        public TLRPC.InputPeer peer;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.paused);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class toggleNoPaidMessagesException extends TLObject {
        public static final int constructor = -30483850;
        public int flags;
        public TLRPC.InputPeer parent_peer;
        public boolean refund_charged;
        public boolean require_payment;
        public TLRPC.InputUser user_id;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.refund_charged);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.parent_peer != null);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.require_payment);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.parent_peer.serializeToStream(outputSerializedData);
            }
            this.user_id.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class toggleSponsoredMessages extends TLObject {
        public static final int constructor = -1176919155;
        public boolean enabled;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeBool(this.enabled);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class toggleUsername extends TLObject {
        public static final int constructor = 1490465654;
        public boolean active;
        public String username;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.username);
            outputSerializedData.writeBool(this.active);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class toggleWebBrowserSettingsException extends TLMethod<TLRPC.Updates> {
        public static final int constructor = 1626161705;
        public boolean delete;
        public int flags;
        public boolean open_external_browser;
        public String url;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 2, this.delete);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.open_external_browser);
            }
            outputSerializedData.writeString(this.url);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class unregisterDevice extends TLObject {
        public static final int constructor = 1779249670;
        public ArrayList<Long> other_uids = new ArrayList<>();
        public String token;
        public int token_type;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.token_type);
            outputSerializedData.writeString(this.token);
            Vector.serializeLong(outputSerializedData, this.other_uids);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateBirthday extends TLObject {
        public static final int constructor = -865203183;
        public TL_birthday birthday;
        public int flags;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.birthday.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateBusinessAwayMessage extends TLObject {
        public static final int constructor = -1570078811;
        public int flags;
        public TL_inputBusinessAwayMessage message;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.message.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateBusinessGreetingMessage extends TLObject {
        public static final int constructor = 1724755908;
        public int flags;
        public TL_inputBusinessGreetingMessage message;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.message.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateBusinessIntro extends TLObject {
        public static final int constructor = -1508585420;
        public int flags;
        public TL_inputBusinessIntro intro;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.intro.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateBusinessLocation extends TLObject {
        public static final int constructor = -1637149926;
        public String address;
        public int flags;
        public TLRPC.InputGeoPoint geo_point;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.geo_point.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.address);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateBusinessWorkHours extends TLObject {
        public static final int constructor = 1258348646;
        public TL_businessWorkHours business_work_hours;
        public int flags;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.business_work_hours.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateColor extends TLObject {
        public static final int constructor = 1749885262;
        public TLRPC.PeerColor color;
        public int flags;
        public boolean for_profile;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 2, this.for_profile);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.color.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateConnectedBot extends TLObject {
        public static final int constructor = 1721797758;
        public TLRPC.InputUser bot;
        public boolean deleted;
        public int flags;
        public TL_inputBusinessBotRecipients recipients;
        public TL_businessBotRights rights;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 2, this.deleted);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 1, this.rights != null);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.rights.serializeToStream(outputSerializedData);
            }
            this.bot.serializeToStream(outputSerializedData);
            this.recipients.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateDeviceLocked extends TLObject {
        public static final int constructor = 954152242;
        public int period;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.period);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateEmojiStatus extends TLObject {
        public static final int constructor = -70001045;
        public TLRPC.EmojiStatus emoji_status;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.emoji_status.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateNotifySettings extends TLObject {
        public static final int constructor = -2067899501;
        public TLRPC.InputNotifyPeer peer;
        public TLRPC.TL_inputPeerNotifySettings settings;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.peer.serializeToStream(outputSerializedData);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updatePasswordSettings extends TLObject {
        public static final int constructor = -1516564433;
        public passwordInputSettings new_settings;
        public TLRPC.InputCheckPasswordSRP password;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.password.serializeToStream(outputSerializedData);
            this.new_settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updatePersonalChannel extends TLObject {
        public static final int constructor = -649919008;
        public TLRPC.InputChannel channel;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.channel.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateProfile extends TLObject {
        public static final int constructor = 2018596725;
        public String about;
        public String first_name;
        public int flags;
        public String last_name;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.User.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.first_name);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.last_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.about);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateStatus extends TLObject {
        public static final int constructor = 1713919532;
        public boolean offline;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeBool(this.offline);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateTheme extends TLObject {
        public static final int constructor = 1555261397;
        public TLRPC.InputDocument document;
        public int flags;
        public String format;
        public TLRPC.TL_inputThemeSettings settings;
        public String slug;
        public TLRPC.InputTheme theme;
        public String title;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Theme.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.format);
            this.theme.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.slug);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.document.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.settings.serializeToStream(outputSerializedData);
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateUsername extends TLObject {
        public static final int constructor = 1040964988;
        public String username;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.User.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.username);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class updateWebBrowserSettings extends TLMethod<WebBrowserSettings> {
        public static final int constructor = -1696627970;
        public boolean display_close_button;
        public int flags;
        public boolean open_external_browser;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.open_external_browser = TLObject.hasFlag(readInt32, 1);
            this.display_close_button = TLObject.hasFlag(this.flags, 2);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.open_external_browser);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.display_close_button);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
        }

        @Override // org.telegram.tgnet.TLMethod
        public WebBrowserSettings deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return WebBrowserSettings.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class uploadRingtone extends TLObject {
        public static final int constructor = -2095414366;
        public TLRPC.InputFile file;
        public String file_name;
        public String mime_type;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Document.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.file.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.file_name);
            outputSerializedData.writeString(this.mime_type);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class uploadTheme extends TLObject {
        public static final int constructor = 473805619;
        public TLRPC.InputFile file;
        public String file_name;
        public int flags;
        public String mime_type;
        public TLRPC.InputFile thumb;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Document.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            this.file.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.thumb.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.file_name);
            outputSerializedData.writeString(this.mime_type);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class uploadWallPaper extends TLObject {
        public static final int constructor = -578472351;
        public TLRPC.InputFile file;
        public String mime_type;
        public TLRPC.TL_wallPaperSettings settings;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.WallPaper.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.file.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.mime_type);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class verifyEmail extends TLObject {
        public static final int constructor = 53322959;
        public TLRPC.EmailVerifyPurpose purpose;
        public TLRPC.EmailVerification verification;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return EmailVerified.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.purpose.serializeToStream(outputSerializedData);
            this.verification.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class verifyPhone extends TLObject {
        public static final int constructor = 1305716726;
        public String phone_code;
        public String phone_code_hash;
        public String phone_number;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.phone_number);
            outputSerializedData.writeString(this.phone_code_hash);
            outputSerializedData.writeString(this.phone_code);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class webAuthorizations extends TLObject {
        public static final int constructor = -313079300;
        public ArrayList<TLRPC.TL_webAuthorization> authorizations = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static webAuthorizations TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (webAuthorizations) TLObject.TLdeserialize(webAuthorizations.class, -313079300 != i10 ? null : new webAuthorizations(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.authorizations = Vector.deserialize(inputSerializedData, new c(16), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.authorizations);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class webPagePreview extends TLObject {
        public static final int constructor = -1936029524;
        public TLRPC.MessageMedia media;
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static webPagePreview TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (webPagePreview) TLObject.TLdeserialize(webPagePreview.class, -1936029524 != i10 ? null : new webPagePreview(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.media.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_chatThemesNotModified extends ChatThemes {
        public static final int constructor = -535699004;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_reactionNotificationsFromAll extends ReactionNotificationsFrom {
        public static final int constructor = 1268654752;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_reactionNotificationsFromContacts extends ReactionNotificationsFrom {
        public static final int constructor = -1161583078;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class TL_webBrowserSettingsNotModified extends WebBrowserSettings {
        public static final int constructor = -1021538482;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }
}
