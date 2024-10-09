package org.telegram.ui.Components.Paint;

/* loaded from: classes3.dex */
public abstract class ObjectDetectionEmojis {
    private static String[] labelEmojis;

    public static String labelToEmoji(int i) {
        if (labelEmojis == null) {
            labelEmojis = new String[]{"👥", "🔥", "📚", "🏔", "\u1f9ca", "🍱", null, "🚰", "\u1f9f8", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "\u1fa91", "🧔", "🌉", "\u1fa70", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "\u1f93f", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "\u1fa73", "🚌", "🐂", "🌌", "🐹", "\u1faa8", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "\u1f9f1", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "\u1f9fa", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "\u1fa9c", "💻", "🍳", "📽️", "\u1fa91", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "\u1f9c3", "🍚", null, "👥", "🏙", null, "\u1f9f8", "🍪", "\u1f7e9", "🕎", "\u1f9f6", "\u1f6f9", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "\u1f9f8", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "\u1f97d", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "\u1f9f6", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "\u1f6f9", "\u1f9a2", "🍖", "🥅", "\u1f9c1", "🐕", "🚤", "🌳", "☕", "⚽", "\u1f9f8", "🍲", "\u1f9cd", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "\u1f9b6", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "\u1f9f8", "👥", "\u1fa9f", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "\u1f9f6", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "\u1f9fe", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "\u1f9f1", "\u1f93f", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "\u1fa96", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "\u1fab4", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "\u1f9f5", "🐦", "\u1f6f9", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "\u1fa90", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "\u1f9b8", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "\u1f9f6", "💍", "🎤", "🎡", "🏂", "🚤", "\u1f9f1", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "\u1f9b8", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "\u1fa91", "\u1f6d5", "🦋", "👠", "🏃", "\u1faa1", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "\u1f9f5", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "\u1fab4", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "\u1f9ad", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "\u1f93f", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "\u1f9b9", "\u1fa96", "🛶", "🤳", "\u1f6fa", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
        }
        if (i >= 0) {
            String[] strArr = labelEmojis;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return null;
    }
}
